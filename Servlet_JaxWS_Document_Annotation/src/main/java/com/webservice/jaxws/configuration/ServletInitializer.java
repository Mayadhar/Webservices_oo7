package com.webservice.jaxws.configuration;

import javax.servlet.annotation.WebServlet;

import com.sun.xml.ws.transport.http.servlet.WSServlet;

@WebServlet(name = "PersonServlet", urlPatterns = "/personWS", loadOnStartup = 1)
public class ServletInitializer extends WSServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
