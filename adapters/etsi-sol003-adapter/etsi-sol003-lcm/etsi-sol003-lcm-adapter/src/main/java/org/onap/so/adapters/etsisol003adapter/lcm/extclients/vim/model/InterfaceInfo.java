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

package org.onap.so.adapters.etsisol003adapter.lcm.extclients.vim.model;

import java.util.Objects;

public class InterfaceInfo {

    protected String identityEndPoint;

    public String getIdentityEndPoint() {
        return identityEndPoint;
    }

    public void setIdentityEndPoint(final String value) {
        identityEndPoint = value;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final InterfaceInfo interfaceInfo = (InterfaceInfo) o;
        return Objects.equals(this.identityEndPoint, interfaceInfo.identityEndPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityEndPoint);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class InterfaceInfo {\n");

        sb.append("    identityEndPoint: ").append(toIndentedString(identityEndPoint)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(final java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
