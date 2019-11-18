package com.capg.corejava.inheritance;

public class Grandfather {
	String name="Torrhe";
	String lastname="strak";
	
	public static void main(String[] args) {
		Grandfather g=new Grandfather();
		g.print();
	}
public void print() {
	System.out.println(name+ " " + lastname);
}
}
