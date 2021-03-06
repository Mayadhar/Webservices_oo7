package com.webservice.jaxws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.web.bind.annotation.RequestMapping;

import com.webservice.jaxws.beans.Person;

@WebService(endpointInterface = "com.webservice.jaxws.service.PersonService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class PersonServiceImpl implements PersonService {

	private static Map<Integer, Person> persons = new HashMap<>();

	public boolean addPerson(Person p) {
		if (persons.get(p.getId()) != null)
			return false;
		persons.put(p.getId(), p);
		return true;
	}

	public boolean deletePerson(int id) {
		if (persons.get(id) == null)
			return false;
		persons.remove(id);
		return true;
	}

	public Person getPerson(int id) {
		return persons.get(id);
	}

	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i = 0;
		for (Integer id : ids) {
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}
}
