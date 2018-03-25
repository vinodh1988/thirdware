package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Person;
import com.service.DataService;

@Controller
public class FirstController {
	@Autowired
	DataService dataservice;
	@Autowired
	Person person;
	@Autowired
	SampleValidator samplevalidator;
	
	@InitBinder
	   protected void initBinder(WebDataBinder binder) {
		System.out.println("This is called....!!!");
	      binder.addValidators(samplevalidator);
	   }
	
	@RequestMapping("test.htm")
	public String mapData(ModelMap m){
		m.addAttribute("data",dataservice.emitString());
		m.addAttribute("person",dataservice.getPersons());
		return "hello";
	}
	
	@RequestMapping("form.htm")
	public ModelAndView formView(){
		
		return new ModelAndView("form","person",person);
		
	}
	
	@RequestMapping(value="add.htm",method=RequestMethod.POST)
	public String redirect(@ModelAttribute("person")@Validated Person p,BindingResult result){
		
		System.out.println(result);
		System.out.println("This is working...!");
		if(result.hasErrors())
			return "form";
		dataservice.addPerson(p);
		return "success";
		
	}
	
	

}
