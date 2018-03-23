package com.thirdware.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.entity.Person;
import com.thirdware.services.DataService;

@RestController
@RequestMapping("/restdata")
public class RestServiceController {

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
}
