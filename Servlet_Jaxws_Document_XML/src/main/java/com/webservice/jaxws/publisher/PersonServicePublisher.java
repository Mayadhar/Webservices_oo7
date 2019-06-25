package com.webservice.jaxws.publisher;

import javax.xml.ws.Endpoint;

import com.webservice.jaxws.service.PersonServiceImpl;

//Endpoint publisher
public class PersonServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new PersonServiceImpl());
	}

}