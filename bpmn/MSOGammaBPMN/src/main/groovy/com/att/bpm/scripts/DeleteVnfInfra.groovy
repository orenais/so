/*-
 * ============LICENSE_START=======================================================
 * OPENECOMP - MSO
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package com.att.bpm.scripts


import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory

import org.apache.commons.lang3.*
import org.camunda.bpm.engine.delegate.BpmnError
import org.camunda.bpm.engine.runtime.Execution

import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList

import org.xml.sax.InputSource


import org.openecomp.mso.bpmn.core.WorkflowException
import org.openecomp.mso.bpmn.core.json.JsonUtils;


/**
 * This class supports the DeleteVnfInfra Flow
 * with the Deletion of a generic vnf for
 * infrastructure.
 */
class DeleteVnfInfra extends AbstractServiceTaskProcessor {

	String Prefix="DELVI_"
	ExceptionUtil exceptionUtil = new ExceptionUtil()
	JsonUtils jsonUtil = new JsonUtils()
	VidUtils vidUtils = new VidUtils(this)

	/**
	 * This method gets and validates the incoming
	 * request.
	 *
	 * @param - execution
	 */
	public void preProcessRequest(Execution execution) {
		def isDebugEnabled = execution.getVariable("isDebugLogEnabled")
		execution.setVariable("prefix",Prefix)
		utils.log("DEBUG", " *** STARTED DeleteVnfInfra PreProcessRequest Process*** ", isDebugEnabled)

		execution.setVariable("DELVI_SuccessIndicator", false)
		execution.setVariable("DELVI_vnfInUse", false)

		try{
			// Get Variables
			String deleteVnfRequest = execution.getVariable("bpmnRequest")
			execution.setVariable("DELVI_DeleteVnfRequest", deleteVnfRequest)
			utils.logAudit("Incoming DeleteVnfInfra Request is: \n" + deleteVnfRequest)

			if(deleteVnfRequest != null){

				String requestId = execution.getVariable("att-mso-request-id")
				execution.setVariable("DELVI_requestId", requestId)

				String serviceInstanceId = execution.getVariable("serviceInstanceId")
				execution.setVariable("DELVI_serviceInstanceId", serviceInstanceId)
				utils.log("DEBUG", "Incoming Service Instance Id is: " + serviceInstanceId, isDebugEnabled)

				String vnfId = execution.getVariable("vnfId")
				execution.setVariable("DELVI_vnfId", vnfId)
				utils.log("DEBUG", "Incoming Vnf(Instance) Id is: " + vnfId, isDebugEnabled)

				String source = jsonUtil.getJsonValue(deleteVnfRequest, "requestDetails.requestInfo.source")
				execution.setVariable("DELVI_source", source)
				utils.log("DEBUG", "Incoming Source is: " + source, isDebugEnabled)

				//For Completion Handler & Fallout Handler
				String requestInfo =
				"""<request-info xmlns="http://ecomp.att.com/mso/infra/vnf-request/v1">
					<request-id>${requestId}</request-id>
					<action>DELETE</action>
					<source>${source}</source>
				   </request-info>"""

				execution.setVariable("DELVI_requestInfo", requestInfo)

				// Setting for sub flow calls
				execution.setVariable("DELVI_type", "generic-vnf")

			}else{
				exceptionUtil.buildAndThrowWorkflowException(execution, 500, "Incoming Bpmn Request is Null.")
			}

		}catch(BpmnError b){
			utils.log("DEBUG", "Rethrowing MSOWorkflowException", isDebugEnabled)
			throw b
		}catch(Exception e){
			utils.log("DEBUG", " Error Occured in DeleteVnfInfra PreProcessRequest method!" + e, isDebugEnabled)
			exceptionUtil.buildAndThrowWorkflowException(execution, 2500, "Internal Error - Occured in DeleteVnfInfra PreProcessRequest")

		}
		utils.log("DEBUG", "*** COMPLETED DeleteVnfInfra PreProcessRequest Process ***", isDebugEnabled)
	}

	public void sendSyncResponse (Execution execution) {
		def isDebugEnabled=execution.getVariable("isDebugLogEnabled")
		execution.setVariable("prefix",Prefix)

		utils.log("DEBUG", " *** STARTED DeleteVnfInfra SendSyncResponse Process *** ", isDebugEnabled)

		try {
			String requestId = execution.getVariable("DELVI_requestId")
			String vnfId = execution.getVariable("DELVI_vnfId")

			String DeleteVnfResponse = """{"requestReferences":{"instanceId":"${vnfId}","requestId":"${requestId}"}}""".trim()

			utils.log("DEBUG", " DeleteVnfInfra Sync Response is: \n"  + DeleteVnfResponse, isDebugEnabled)
			execution.setVariable("DELVI_sentSyncResponse", true)

			sendWorkflowResponse(execution, 202, DeleteVnfResponse)

		} catch (Exception ex) {
			utils.log("DEBUG", "Error Occured in DeleteVnfInfra SendSyncResponse Process " + ex.getMessage(), isDebugEnabled)
			exceptionUtil.buildAndThrowWorkflowException(execution, 2500, "Internal Error - Occured in DeleteVnfInfra SendSyncResponse Process")

		}
		utils.log("DEBUG", "*** COMPLETED DeleteVnfInfra SendSyncResponse Process ***", isDebugEnabled)
	}

	public void processGetVnfResponse(Execution execution){
		def isDebugEnabled=execution.getVariable("isDebugLogEnabled")
		execution.setVariable("prefix",Prefix)
		utils.log("DEBUG", " *** STARTED DeleteVnfInfra processGetVnfResponse Process *** ", isDebugEnabled)
		try {
			String vnf = execution.getVariable("DELVI_genericVnf")
			String resourceVersion = utils.getNodeText1(vnf, "resource-version")
			execution.setVariable("DELVI_resourceVersion", resourceVersion)

			if(utils.nodeExists(vnf, "relationship")){
				InputSource source = new InputSource(new StringReader(vnf));
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder()
				Document vnfXml = docBuilder.parse(source)

				NodeList nodeList = vnfXml.getElementsByTagName("relationship")
				for (int x = 0; x < nodeList.getLength(); x++) {
					Node node = nodeList.item(x)
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) node
						def e = eElement.getElementsByTagName("related-to").item(0).getTextContent()
						if(e.equals("volume-group") || e.equals("l3-network") || e.equals("vserver")){
							utils.log("DEBUG", "Generic Vnf still has relationship to OpenStack.", isDebugEnabled)
							execution.setVariable("DELVI_vnfInUse", true)
						}else{
							utils.log("DEBUG", "Relationship NOT related to OpenStack", isDebugEnabled)
						}
					}
				}
			}

			if(utils.nodeExists(vnf, "vf-module")){
				execution.setVariable("DELVI_vnfInUse", true)
				utils.log("DEBUG", "Generic Vnf still has vf-modules.", isDebugEnabled)
			}


		} catch (Exception ex) {
			utils.log("DEBUG", "Error Occured in DeleteVnfInfra processGetVnfResponse Process " + ex.getMessage(), isDebugEnabled)
			exceptionUtil.buildAndThrowWorkflowException(execution, 2500, "Internal Error - Occured in DeleteVnfInfra processGetVnfResponse Process")

		}
		utils.log("DEBUG", "*** COMPLETED DeleteVnfInfra processGetVnfResponse Process ***", isDebugEnabled)
	}

	public void prepareCompletionHandlerRequest(Execution execution){
		def isDebugEnabled=execution.getVariable("isDebugLogEnabled")
		execution.setVariable("prefix",Prefix)

		utils.log("DEBUG", " *** STARTED DeleteVnfInfra PrepareCompletionHandlerRequest Process *** ", isDebugEnabled)

		try {
			String requestInfo = execution.getVariable("DELVI_requestInfo")
			requestInfo = utils.removeXmlPreamble(requestInfo)
			String vnfId = execution.getVariable("DELVI_vnfId")

			String request =
				"""<aetgt:MsoCompletionRequest xmlns:aetgt="http://ecomp.att.com/mso/workflow/schema/v1"
									xmlns:ns="http://ecomp.att.com/mso/request/types/v1">
							${requestInfo}
							<status-message>Vnf has been deleted successfully.</status-message>
							<vnfId>${vnfId}</vnfId>
							<mso-bpel-name>DeleteVnfInfra</mso-bpel-name>
						</aetgt:MsoCompletionRequest>"""

			execution.setVariable("DELVI_completionHandlerRequest", request)
			utils.log("DEBUG", "Completion Handler Request is: " + request, isDebugEnabled)

			execution.setVariable("WorkflowResponse", "Success") // for junits

		} catch (Exception ex) {
			utils.log("DEBUG", "Error Occured in DeleteVnfInfra PrepareCompletionHandlerRequest Process " + ex.getMessage(), isDebugEnabled)
			exceptionUtil.buildAndThrowWorkflowException(execution, 2500, "Internal Error - Occured in DeleteVnfInfra PrepareCompletionHandlerRequest Process")

		}
		utils.log("DEBUG", "*** COMPLETED DeleteVnfInfra PrepareCompletionHandlerRequest Process ***", isDebugEnabled)
	}

	public void sendErrorResponse(Execution execution){
		def isDebugEnabled=execution.getVariable("isDebugLogEnabled")
		execution.setVariable("prefix",Prefix)

		utils.log("DEBUG", " *** STARTED DeleteVnfInfra sendErrorResponse Process *** ", isDebugEnabled)
		try {
			def sentSyncResponse = execution.getVariable("DELVI_sentSyncResponse")
			if(sentSyncResponse == false){
				utils.log("DEBUG", "Sending a Sync Error Response", isDebugEnabled)
				WorkflowException wfex = execution.getVariable("WorkflowException")
				String response = exceptionUtil.buildErrorResponseXml(wfex)

				utils.logAudit(response)
				sendWorkflowResponse(execution, 500, response)
			}else{
				utils.log("DEBUG", "A Sync Response has already been sent. Skipping Send Sync Error Response.", isDebugEnabled)
			}

		} catch(Exception ex) {
			utils.log("DEBUG", "Error Occured in DeleteVnfInfra sendErrorResponse Process " + ex.getMessage(), isDebugEnabled)
			exceptionUtil.buildAndThrowWorkflowException(execution, 2500, "Internal Error - Occured in DeleteVnfInfra sendErrorResponse Process")
		}
		utils.log("DEBUG", "*** COMPLETED DeleteVnfInfra sendErrorResponse Process ***", isDebugEnabled)
	}



}
