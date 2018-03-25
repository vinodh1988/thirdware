package com.thirdware.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thirdware.ioc.Vehicle;

public class MainClass {
   public static void main(String n[]){
	   
	   //Vehicle v=new Car(); //Dependency
	  // v.showDetails();
	   ApplicationContext ac=
			   new ClassPathXmlApplicationContext("bean.xml");
	   
	  Vehicle v=(Vehicle) ac.getBean("car");
	  
	  v.showDetails();
	    
	  
	  v=(Vehicle)ac.getBean("van");
	   
	  v.showDetails();
   }
}
