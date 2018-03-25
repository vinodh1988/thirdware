package com.thirdware.ioc;

import org.springframework.stereotype.Component;

@Component
public class InsureXYZ implements Insure{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("XYZ is process the insurance");
	}

}
