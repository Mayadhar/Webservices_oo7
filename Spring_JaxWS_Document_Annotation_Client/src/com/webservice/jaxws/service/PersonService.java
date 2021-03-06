
package com.webservice.jaxws.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://service.jaxws.webservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.AddPersonResponse")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/addPersonRequest", output = "http://service.jaxws.webservice.com/PersonService/addPersonResponse")
    public boolean addPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Person arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.webservice.jaxws.service.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.GetPersonResponse")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/getPersonRequest", output = "http://service.jaxws.webservice.com/PersonService/getPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.DeletePersonResponse")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/deletePersonRequest", output = "http://service.jaxws.webservice.com/PersonService/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.webservice.jaxws.service.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPersons", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.GetAllPersons")
    @ResponseWrapper(localName = "getAllPersonsResponse", targetNamespace = "http://service.jaxws.webservice.com/", className = "com.webservice.jaxws.service.GetAllPersonsResponse")
    @Action(input = "http://service.jaxws.webservice.com/PersonService/getAllPersonsRequest", output = "http://service.jaxws.webservice.com/PersonService/getAllPersonsResponse")
    public List<Person> getAllPersons();

}
