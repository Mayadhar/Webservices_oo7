package com.webservice.jaxws.configuration;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sun.xml.ws.transport.http.servlet.WSServletContextListener;

@WebListener
public class ServletListener implements ServletContextListener, ServletContextAttributeListener {
	private final WSServletContextListener contextListener;

	public ServletListener() {
		super();
		this.contextListener = new WSServletContextListener();
	}

	public void contextInitialized(ServletContextEvent sce) {
		this.contextListener.contextInitialized(sce);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		this.contextListener.contextDestroyed(sce);
	}

	public void attributeAdded(ServletContextAttributeEvent event) {
		this.contextListener.attributeAdded(event);
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		this.contextListener.attributeRemoved(event);
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		this.contextListener.attributeReplaced(event);
	}

}
