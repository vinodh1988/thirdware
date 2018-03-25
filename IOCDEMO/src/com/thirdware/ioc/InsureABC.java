package com.thirdware.ioc;

import org.springframework.stereotype.Component;

@Component
public class InsureABC implements Insure {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("ABC is processing the insurance");
	}

}
