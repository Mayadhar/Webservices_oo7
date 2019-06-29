
package com.webservice.jaxws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonServiceImplService", targetNamespace = "http://service.jaxws.webservice.com/", wsdlLocation = "http://localhost:8083/Servlet_JaxWS_Document_Annotation/personWS?wsdl")
public class PersonServiceImplService
    extends Service
{

    private final static URL PERSONSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PERSONSERVICEIMPLSERVICE_QNAME = new QName("http://service.jaxws.webservice.com/", "PersonServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8083/Servlet_JaxWS_Document_Annotation/personWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PERSONSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public PersonServiceImplService() {
        super(__getWsdlLocation(), PERSONSERVICEIMPLSERVICE_QNAME);
    }

    public PersonServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONSERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PERSONSERVICEIMPLSERVICE_QNAME);
    }

    public PersonServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONSERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonService getPersonServiceImplPort() {
        return super.getPort(new QName("http://service.jaxws.webservice.com/", "PersonServiceImplPort"), PersonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonService getPersonServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.jaxws.webservice.com/", "PersonServiceImplPort"), PersonService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PERSONSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PERSONSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
