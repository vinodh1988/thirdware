package com.thirdware.ioc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Van implements Vehicle{

Assemble assemble;

@Autowired
VehicleService vservice;

List<Insure> ilist;


public List<Insure> getIlist() {
	return ilist;
}


public void setIlist(List<Insure> ilist) {
	this.ilist = ilist;
}


Assemble getAssemble() {
	return assemble;
}


public void setAssemble(Assemble assemble) {
	this.assemble = assemble;
}


	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Van class implementation of Vehicle");
		assemble.assembleParts();
		vservice.service();
		
		for(Insure x:ilist)
			x.process();
	}

}
