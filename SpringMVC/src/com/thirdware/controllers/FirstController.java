package com.thirdware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thirdware.services.DataService;

@Controller
public class FirstController {
@Autowired 
 DataService dataservice;
@RequestMapping("/first")
	public String process(ModelMap m){
		m.addAttribute("info","Data sent from Spring Controller!!!");
		m.addAttribute("names",dataservice.emitData());
	    return "first";
	}
}
