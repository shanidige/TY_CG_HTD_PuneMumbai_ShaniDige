package com.capg.corejava.inheritance;

public class Father extends Grandfather {
	String fname="Eddard";

	public static void main(String[] args) {
		
		new Father().print();

	}
	@Override
public void print() {
	System.out.println(fname+" "+ name+" "+lastname);
	super.print();
}
	public void show() {
		// TODO Auto-generated method stub
		
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
