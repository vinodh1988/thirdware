package com.thirdware.ioc;

import org.springframework.stereotype.Component;

@Component("cservice")
public class XYZServiceProvider implements VehicleService {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("Being Serviced by XYZ....!!!!");
	}
  
}
