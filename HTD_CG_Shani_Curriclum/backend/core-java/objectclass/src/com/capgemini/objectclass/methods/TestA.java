package com.capgemini.objectclass.methods;

public class TestA {

	public static void main(String[] args) {
Pen p= new Pen();
int add= p.hashCode();
System.out.println("address is "+ add);//hashCode

String r=  p.toString();//tostring
System.out.println(r);

	}
}
