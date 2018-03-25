package com.thirdware.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	{
		System.out.println("It is instantiated...!!!");
	}
	@Pointcut("execution(* com.thirdware.controllers.FirstController.process(..))")
	 public void pointcut(){
		  
	  }
	
	@Before("pointcut()")
	public void doThis(){
		System.out.println("Aspect is working!!!!");
	}
	
	
}
