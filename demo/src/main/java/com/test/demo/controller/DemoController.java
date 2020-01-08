package com.test.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Person;
import com.test.demo.repository.PersonDAO;

@RestController
public class DemoController {

	
	@Autowired
	PersonDAO personDao;
	
	@GetMapping(path="/getAllPersons", produces = "application/json")
	public List<Person> getAllPersons()
	{
		return (List<Person>) personDao.findAll();
	}
	
	@GetMapping(path="/getById", produces = "application/json")
	public Person findSpecific(@RequestParam Long id)
	{
		Optional<Person> findById = personDao.findById(id);
		
		return findById.get();
	}
}
