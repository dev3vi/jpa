package com.laptrinhjavaweb.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private EntityManager em;
	
	public List<Person> getAllPerson() {
		TypedQuery<Person> query = em.createQuery("from Person p", Person.class);
		return query.getResultList();	
	}
	
	public Person getPersonById(Long id) {
		return em.find(Person.class, id);
	}
	
	@Transactional
	public void createPerson(Long id,  String name, String gender, Integer age, String address) {
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setAddress(address);
		em.persist(person);
	}
	
	@Transactional
	public void deletePerson(Long id) {
		Person person = getPersonById(id);
		em.remove(person);
	}
	
	@Transactional
	public void updatePerson(Long id, String name, String gender, Integer age, String address) {
		Person person = em.find(Person.class, id);
		System.out.println(person.getName());
		System.out.println(person.getId());
		em.detach(person);
		System.out.println(person.getName());
		System.out.println(person.getId());
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setAddress(address);
		em.merge(person);
	}
}
