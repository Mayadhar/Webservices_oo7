
package com.webservice.jaxws.service.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://service.jaxws.webservice.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.webservice.jaxws.service.Person
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/getPersonRequest", output = "http://service.jaxws.webservice.com/PersonService/getPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/addPersonRequest", output = "http://service.jaxws.webservice.com/PersonService/addPersonResponse")
    public boolean addPerson(
        @WebParam(name = "arg0", partName = "arg0")
        Person arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/deletePersonRequest", output = "http://service.jaxws.webservice.com/PersonService/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @return
     *     returns com.webservice.jaxws.service.PersonArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/getAllPersonsRequest", output = "http://service.jaxws.webservice.com/PersonService/getAllPersonsResponse")
    public PersonArray getAllPersons();

}
