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

package org.openecomp.mso.adapters.requestsdb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import org.openecomp.mso.adapters.requestsdb.exceptions.MsoRequestsDbException;
import org.openecomp.mso.requestsdb.InfraActiveRequests;
import org.openecomp.mso.requestsdb.SiteStatus;

/**
 * MSO Request DB Adapter Web Service
 */
@WebService(name = "RequestsDbAdapter", targetNamespace = "http://com.att.mso/requestsdb")
public interface MsoRequestsDbAdapter {

    @WebMethod
    public void updateInfraRequest (@WebParam(name = "requestId") @XmlElement(required = true) String requestId,
                                    @WebParam(name = "lastModifiedBy") @XmlElement(required = true) String lastModifiedBy,
                                    @WebParam(name = "statusMessage") @XmlElement(required = false) String statusMessage,
                                    @WebParam(name = "responseBody") @XmlElement(required = false) String responseBody,
                                    @WebParam(name = "requestStatus") @XmlElement(required = false) RequestStatusType requestStatus,
                                    @WebParam(name = "progress") @XmlElement(required = false) String progress,
                                    @WebParam(name = "vnfOutputs") @XmlElement(required = false) String vnfOutputs,
                                    @WebParam(name = "serviceInstanceId") @XmlElement(required = false) String serviceInstanceId,
                                    @WebParam(name = "networkId") @XmlElement(required = false) String networkId,
                                    @WebParam(name = "vnfId") @XmlElement(required = false) String vnfId,
                                    @WebParam(name = "vfModuleId") @XmlElement(required = false) String vfModuleId,
                                    @WebParam(name = "volumeGroupId") @XmlElement(required = false) String volumeGroupId) throws MsoRequestsDbException;

    @WebMethod
    public InfraActiveRequests getInfraRequest (@WebParam(name="requestId") @XmlElement(required = true) String requestId) throws MsoRequestsDbException;

    @WebMethod
    public boolean getSiteStatus (@WebParam(name="siteName") @XmlElement(required = true) String siteName);

}
