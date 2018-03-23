package com.thirdware.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thirdware.entity.Person;

@Service
public class DataService {

	  public List<Person> getPeople(){
		  List<Person> l=new ArrayList<Person>();
		  l.add(new Person(1,"Rob","Chennai"));
		  l.add(new Person(2,"Jack","Chennai"));
		  l.add(new Person(3,"Blue","Mumbai"));
		  l.add(new Person(4,"Craig","Banaras"));
		  
		  return l;
		  
	  }
}
