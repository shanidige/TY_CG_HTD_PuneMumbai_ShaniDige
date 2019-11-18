package com.capgemini.objectclass.methods;

public class marker implements Cloneable {
	String name;
	int id;
	public marker(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
 