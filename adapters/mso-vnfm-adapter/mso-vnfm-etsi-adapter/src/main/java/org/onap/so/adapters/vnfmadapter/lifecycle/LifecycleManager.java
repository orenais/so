/*-
 * ============LICENSE_START=======================================================
 *  Copyright (C) 2019 Nordix Foundation.
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
 *
 * SPDX-License-Identifier: Apache-2.0
 * ============LICENSE_END=========================================================
 */

package org.onap.so.adapters.vnfmadapter.lifecycle;

import com.google.common.base.Optional;
import java.util.UUID;
import org.onap.aai.domain.yang.EsrVnfm;
import org.onap.aai.domain.yang.GenericVnf;
import org.onap.so.adapters.vnfmadapter.extclients.aai.AaiClientProvider;
import org.onap.so.adapters.vnfmadapter.extclients.aai.AaiHelper;
import org.onap.so.adapters.vnfmadapter.extclients.vnfm.VnfmServiceProvider;
import org.onap.so.adapters.vnfmadapter.extclients.vnfm.model.InlineResponse201;
import org.onap.so.adapters.vnfmadapter.jobmanagement.JobManager;
import org.onap.so.client.aai.AAIObjectType;
import org.onap.so.client.aai.entities.uri.AAIUriFactory;
import org.onap.so.client.graphinventory.entities.uri.Depth;
import org.onap.vnfmadapter.v1.model.CreateVnfRequest;
import org.onap.vnfmadapter.v1.model.CreateVnfResponse;
import org.onap.vnfmadapter.v1.model.DeleteVnfResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Manages lifecycle operations towards the VNFMs.
 */
@Component
public class LifecycleManager {
    private static final Logger logger = LoggerFactory.getLogger(LifecycleManager.class);
    private final AaiClientProvider aaiClientProvider;
    private final VnfmServiceProvider vnfmServiceProvider;
    private final AaiHelper aaiHelper;
    private final JobManager jobManager;

    @Autowired
    LifecycleManager(final AaiClientProvider aaiClientProvider, final AaiHelper aaiHelper,
            final VnfmServiceProvider vnfmServiceProvider, final JobManager jobManager) {
        this.aaiClientProvider = aaiClientProvider;
        this.vnfmServiceProvider = vnfmServiceProvider;
        this.aaiHelper = aaiHelper;
        this.jobManager = jobManager;
    }

    /**
     * Create a VNF on a VNFM.
     *
     * @param vnfIdInAai the ID of the VNF in AAI
     * @param request the create request
     * @return the response to the request
     */
    public CreateVnfResponse createVnf(final String vnfIdInAai, final CreateVnfRequest request) {
        final GenericVnf genericVnf = getGenericVnfFromAai(vnfIdInAai);
        checkIfVnfAlreadyExistsInVnfm(genericVnf);

        EsrVnfm vnfm = aaiHelper.getAssignedVnfm(genericVnf);
        if (vnfm == null) {
            vnfm = aaiHelper.selectVnfm(genericVnf);
            aaiHelper.addRelationshipFromGenericVnfToVnfm(genericVnf, vnfm.getVnfmId());
        }

        // operation ID set to random value for now, will be set correctly once we implement instantiate
        // call towards the VNFM
        final String jobId = jobManager.createJob(vnfm.getVnfmId(), UUID.randomUUID().toString(), false);
        final CreateVnfResponse response = new CreateVnfResponse();
        response.setJobId(jobId);
        return response;
    }

    private GenericVnf getGenericVnfFromAai(final String vnfIdInAai) {
        final GenericVnf genericVnf = aaiClientProvider.getAaiClient()
                .get(GenericVnf.class,
                        AAIUriFactory.createResourceUri(AAIObjectType.GENERIC_VNF, vnfIdInAai).depth(Depth.ONE))
                .orElseGet(() -> {
                    logger.debug("No Generic Vnf matched by id");
                    return null;
                });
        logger.debug("Retrieved generic VNF from AAI: " + genericVnf);
        return genericVnf;
    }

    private void checkIfVnfAlreadyExistsInVnfm(final GenericVnf genericVnf) {
        if (genericVnf.getSelflink() != null && !genericVnf.getSelflink().isEmpty()) {
            Optional<InlineResponse201> response = Optional.absent();
            try {
                response = vnfmServiceProvider.getVnf(genericVnf.getSelflink());
            } catch (final Exception exception) {
                logger.debug("Ignoring invalid self link in generic vnf", exception);
            }
            if (response.isPresent()) {
                throw new IllegalArgumentException("VNF " + genericVnf.getVnfId()
                        + " is already defined on the VNFM, self link: " + genericVnf.getSelflink());
            }
        }
    }

    /**
     * Delete a VNF on a VNFM.
     *
     * @param vnfIdInAai the ID of the VNF in AAI
     * @return the response to the request
     */
    public DeleteVnfResponse deleteVnf(final String vnfIdInAai) {
        // vnfm ID and operation ID set to random value for now, will be set correctly once we implement
        // terminate call towards the VNFM
        final String jobId = jobManager.createJob(UUID.randomUUID().toString(), UUID.randomUUID().toString(), true);
        final DeleteVnfResponse response = new DeleteVnfResponse();
        response.setJobId(jobId);
        return response;
    }
}
