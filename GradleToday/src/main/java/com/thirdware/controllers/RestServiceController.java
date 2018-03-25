package com.thirdware.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.entity.Person;
import com.thirdware.repositories.PersonDAO;
import com.thirdware.services.DataService;

@RestController
@RequestMapping("/restdata")
public class RestServiceController {
@Autowired
	PersonDAO persondao;
@Autowired
DataService dataservice;

	@RequestMapping("/plain")
	  public String firstService(){
		  return "This is my First Rest API , Emitting plain Text";
	  }
	
	@RequestMapping(value="/people")
	 public List<Person> emitPeopleInfo(){
		 return dataservice.getPeople();
	 }
	
	@RequestMapping(value="/repos/people")
	 public List<Person> getPeople(){
		 return (List<Person>) persondao.findAll();
	 }
	
	@RequestMapping(value="repos/people",method=RequestMethod.POST)
	public Person addPerson(@RequestBody Person person){
		return persondao.save(person);
	}
	
	@RequestMapping(value="repos/people/{sno}")
	public Person getPerson(@PathVariable int sno){
		return persondao.findBySno(sno);
	}
	
	

}
