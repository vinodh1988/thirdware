package com.thirdware.ioc;

import org.springframework.stereotype.Component;

@Component("vservice")
public class ABCServiceProvider implements VehicleService{

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("Being Serviced by ABC service provider....");
	}

}
