package com.capgemini.objectclass.methods;

public class student {
	int id;
	String nm;
	double per;
	
	public student(int id, String nm, double per) {
		super();
		this.id = id;
		this.nm = nm;
		this.per = per;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", nm=" + nm + ", per=" + per + "]";
	}

	
	

}
