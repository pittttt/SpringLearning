package org.spring.di;


public class Person {
	private String pname;
	private Car car;
	
	
	public void setName(String name) {
		this.pname = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + pname + ", car=" + car + "]";
	}
	
}
