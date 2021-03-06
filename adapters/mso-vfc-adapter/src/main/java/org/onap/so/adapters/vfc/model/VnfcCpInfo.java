/*
 * Copyright (C) 2019 Verizon. All Rights Reserved Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.onap.so.adapters.vfc.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public class VnfcCpInfo {
    @NotNull
    private String id;
    @NotNull
    private String cpdId;
    private String vnfExtCpId;
    private List<CpProtocolInfo> cpProtocolInfo;
    private String vnfLinkPortId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpdId() {
        return cpdId;
    }

    public void setCpdId(String cpdId) {
        this.cpdId = cpdId;
    }

    public String getVnfExtCpId() {
        return vnfExtCpId;
    }

    public void setVnfExtCpId(String vnfExtCpId) {
        this.vnfExtCpId = vnfExtCpId;
    }

    public List<CpProtocolInfo> getCpProtocolInfo() {
        return cpProtocolInfo;
    }

    public void setCpProtocolInfo(List<CpProtocolInfo> cpProtocolInfo) {
        this.cpProtocolInfo = cpProtocolInfo;
    }

    public String getVnfLinkPortId() {
        return vnfLinkPortId;
    }

    public void setVnfLinkPortId(String vnfLinkPortId) {
        this.vnfLinkPortId = vnfLinkPortId;
    }
}
