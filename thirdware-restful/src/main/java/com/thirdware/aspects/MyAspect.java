package com.thirdware.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    
	{
		System.out.println("############It is instantiated...!!!");
	}
	@Pointcut("execution(* com.thirdware.controllers.RestServiceController.*(..))")
	 public void pointcut(){
		  
	  }
	
	@Before("pointcut()")
	public void doThis(){
		System.out.println("Aspect is working!!!!");
	}
	
	@AfterReturning(pointcut="pointcut()",returning="data")
	public void doThisAlso(Object data){
	    System.out.println(data);
	}
	
}
