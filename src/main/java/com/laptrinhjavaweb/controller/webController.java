package com.laptrinhjavaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.entity.Person;
import com.laptrinhjavaweb.model.createPersonRequest;
import com.laptrinhjavaweb.service.PersonService;

@RestController
@RequestMapping("/api")
public class webController {
	
	@Autowired
	private PersonService ps;
	
	
	@GetMapping("/all-person")
	public List<Person> getAllPerson(Model model) {
		return ps.getAllPerson();
	}
	
	@PostMapping("/create-person")
	public void createPerson(@RequestBody createPersonRequest request) {
		ps.createPerson(request.getId(), request.getName(),request.getGender(),request.getAge() ,request.getAddress());
	}
	@DeleteMapping("/delete-person")
	public void createPerson(@RequestBody Long id) {
		ps.deletePerson(id);
	}
	
	@GetMapping("/get-person-by-id")
	public Person getPersonById(Long id) {
		return this.ps.getPersonById(id);
	}
	
	@PutMapping("/update-person")
	public void updatePerson(@RequestBody createPersonRequest request) {
		ps.updatePerson(request.getId(), request.getName(),request.getGender(),request.getAge() ,request.getAddress());
	}



}
