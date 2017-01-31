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

package org.openecomp.mso.adapters.vnf.exceptions;


import javax.xml.ws.WebFault;

import org.openecomp.mso.adapters.vnf.exceptions.VnfException;

/**
 * This class reports an exception when trying to update a Network that does
 * not exist in the target cloud/tenant.  Note that deleteNetwork suppresses
 * this exception (deletion of non-existent network is considered a success).
 * 
 *
 */
@WebFault (name="VnfNotFound", faultBean="org.openecomp.mso.adapters.vnf.exceptions.VnfExceptionBean", targetNamespace="http://com.att.mso/vnf")
public class VnfNotFound extends VnfException {

	private static final long serialVersionUID = 1L;

	public VnfNotFound (String cloudId, String tenantId, String vnfName) {
		super("VNF " + vnfName + " not found in cloud/tenant " + cloudId + "/" + tenantId);
	}
}
