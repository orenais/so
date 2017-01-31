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

package com.att.domain2.workflow.sdnc.adapter.callback.wsdl.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.att.domain2.workflow.sdnc.adapter.schema.v1.SDNCAdapterCallbackRequest;
import com.att.domain2.workflow.sdnc.adapter.schema.v1.SDNCAdapterResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 *
 */
@WebService(name = "SDNCCallbackAdapterPortType", targetNamespace = "http://domain2.att.com/workflow/sdnc/adapter/callback/wsdl/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SDNCCallbackAdapterPortType {


    /**
     *
     * @param sdncAdapterCallbackRequest
     * @return
     *     returns com.att.domain2.workflow.sdnc.adapter.schema.v1.SDNCAdapterResponse
     */
    @WebMethod(operationName = "SDNCAdapterCallback")
    @WebResult(name = "SDNCAdapterResponse", targetNamespace = "http://domain2.att.com/workflow/sdnc/adapter/schema/v1", partName = "SDNCAdapterCallbackResponse")
    public SDNCAdapterResponse sdncAdapterCallback(
        @WebParam(name = "SDNCAdapterCallbackRequest", targetNamespace = "http://domain2.att.com/workflow/sdnc/adapter/schema/v1", partName = "SDNCAdapterCallbackRequest")
        SDNCAdapterCallbackRequest sdncAdapterCallbackRequest);

}
