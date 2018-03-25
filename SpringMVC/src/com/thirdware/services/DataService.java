package com.thirdware.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DataService {

	  public List<String> emitData(){
		  List<String>l=new ArrayList<String>();
		  l.add("Apple");
		  l.add("Google");
		  l.add("Quartz");
		  l.add("Microsoft");
		  l.add("Amazon");
		  
		  return l;
	  }
}
