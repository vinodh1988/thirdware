package com.thirdware.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.thirdware.mvc.controllers"})
@SpringBootApplication
public class SpringBootApp {
  
public static void main(String[] args) throws Exception {
	   SpringApplication.run(SpringBootApp.class, args);
   }

}
