package com.thirdware.ioc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
	
Assemble assemble;

@Autowired
Fuel fuel;

@Autowired
VehicleService cservice;

@Autowired
List<Insure> ilist;


public Car(Assemble assemble,String name){
	this.assemble=assemble;
	
}


@Override
	public void showDetails() {
		
		System.out.println("Car class implementation of vehicle");
		assemble.assembleParts();
		fuel.fillFuel();
		cservice.service();
		for(Insure x:ilist)
			x.process();
		System.out.println("-------------------------------------------");
	}

}
