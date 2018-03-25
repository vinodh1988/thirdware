package com.control;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	{
		System.out.println("It is instantiated...!!!");
	}
	@Pointcut("execution(* com.control.FirstController.redirect(..))")
	 public void pointcut(){
		  
	  }
	
	@Before("pointcut()")
	public void doThis(){
		System.out.println("Aspect is working!!!!");
	}
	
	
}
