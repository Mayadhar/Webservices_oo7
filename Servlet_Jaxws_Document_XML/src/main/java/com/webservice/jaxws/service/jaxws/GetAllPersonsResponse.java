
package com.webservice.jaxws.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllPersonsResponse", namespace = "http://service.jaxws.webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllPersonsResponse", namespace = "http://service.jaxws.webservice.com/")
public class GetAllPersonsResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private com.webservice.jaxws.beans.Person[] _return;

    /**
     * 
     * @return
     *     returns Person[]
     */
    public com.webservice.jaxws.beans.Person[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.webservice.jaxws.beans.Person[] _return) {
        this._return = _return;
    }

}
