package com.starter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.jaxws.service.client.Person;
import com.webservice.jaxws.service.client.PersonService;

public class Starter {
	URL wsdlURL = null;
	QName qname = null;
	Service service = null;
	private static PersonService ps = null;

	public Starter() throws MalformedURLException {
		wsdlURL = new URL("http://localhost:8083/Servlet_JaxWS_RPC_Annotation/personWS?wsdl");
		qname = new QName("http://service.jaxws.webservice.com/", "PersonServiceImplService");
		service = Service.create(wsdlURL, qname);
		ps = service.getPort(PersonService.class);
	}

	public static void main(String[] args) throws MalformedURLException {

		Starter client = new Starter();
		// Adding Person
		client.addPerson();

		// Fetch all persons
		client.getAllPersons();

		// Delete Person
		client.deletePerson(112);

		// Fetch all persons
		client.getAllPersons();

	}

	private void addPerson() {
		Person p1 = new Person();
		p1.setId(112);
		p1.setName("Rahul");
		p1.setAge(39);
		Person p2 = new Person();
		p2.setName("Suresh");
		p2.setId(526);
		p2.setAge(78);
		if (ps.addPerson(p1)) {
			System.out.println(p1 + " Added Successfully");
		} else {
			System.out.println("Error while Adding " + p1);
		}
		if (ps.addPerson(p2)) {
			System.out.println(p1 + " Added Successfully");
		} else {
			System.out.println("Error while Adding " + p2);
		}
	}

	private void deletePerson(int id) {
		Person p = ps.getPerson(id);
		if (ps.deletePerson(id)) {
			System.out.println(p + " Deleted Successfully");
		} else {
			System.out.println(p + " unable to delete");
		}
	}

	public void getPerson(int id) {
		System.out.println(ps.getPerson(id));
	}

	public void getAllPersons() {
		System.out.println(Arrays.asList(ps.getAllPersons()));
	}
}
