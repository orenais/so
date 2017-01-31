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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.03 at 02:02:13 PM EDT 
//


package org.openecomp.mso.apihandlerinfra.volumebeans;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openecomp.mso.apihandlerinfra.vnfbeans1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VolumeParams_QNAME = new QName("http://ecomp.att.com/mso/infra/volume-request/v1", "volume-params");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openecomp.mso.apihandlerinfra.vnfbeans1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestInfo }
     * 
     */
    public RequestInfo createRequestInfo() {
        return new RequestInfo();
    }

    /**
     * Create an instance of {@link VolumeRequest }
     * 
     */
    public VolumeRequest createVolumeRequest() {
        return new VolumeRequest();
    }

    /**
     * Create an instance of {@link VolumeInputs }
     * 
     */
    public VolumeInputs createVolumeInputs() {
        return new VolumeInputs();
    }

    /**
     * Create an instance of {@link VolumeOutputs }
     * 
     */
    public VolumeOutputs createVolumeOutputs() {
        return new VolumeOutputs();
    }

    /**
     * Create an instance of {@link VolumeRequests }
     * 
     */
    public VolumeRequests createVolumeRequests() {
        return new VolumeRequests();
    }
    
   

   /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ecomp.att.com/mso/infra/volume-request/v1", name = "volume-params")
    public JAXBElement<Object> createVolumeParams(Object value) {
        return new JAXBElement<Object>(_VolumeParams_QNAME, Object.class, null, value);
    }

}
