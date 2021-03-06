/*-
 * ============LICENSE_START=======================================================
 * ONAP - SO
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * Copyright (C) 2017 Huawei Technologies Co., Ltd. All rights reserved.
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

package org.onap.so.adapters.vnfrest;

import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Everything that is common between all VfModule and VolumeGroup Requests.
 */
public abstract class VfRequestCommon extends VfResponseCommon {
    private Boolean skipAAI;
    private String notificationUrl;

    public Boolean getSkipAAI() {
        return skipAAI;
    }

    public void setSkipAAI(Boolean skipAAI) {
        this.skipAAI = skipAAI;
    }

    public String getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public boolean isSynchronous() {
        return notificationUrl == null || notificationUrl.isEmpty();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("skipAAI", skipAAI).append("notificationUrl", notificationUrl)
                .toString();
    }

    // getMessageId, setMessageId, toJsonString, toJsonString are all defined in VfResponseCommon.
}
