package com.thirdware.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
   
	@RequestMapping("/hello.do")
	public String greet(){
    	  return "first";
      }
}
