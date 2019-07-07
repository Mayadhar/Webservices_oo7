
package com.webservice.jaxws.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addPerson", namespace = "http://service.jaxws.webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://service.jaxws.webservice.com/")
public class AddPerson {

    @XmlElement(name = "arg0", namespace = "")
    private com.webservice.jaxws.beans.Person arg0;

    /**
     * 
     * @return
     *     returns Person
     */
    public com.webservice.jaxws.beans.Person getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.webservice.jaxws.beans.Person arg0) {
        this.arg0 = arg0;
    }

}
