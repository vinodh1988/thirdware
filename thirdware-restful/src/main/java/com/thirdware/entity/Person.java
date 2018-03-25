package com.thirdware.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
    private  int sno;
	@Column(name="name")
    private  String name;
	@Column(name="city")
    private String city;
    
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int sno, String name, String city) {
		super();
		this.sno = sno;
		this.name = name;
		this.city = city;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
}
