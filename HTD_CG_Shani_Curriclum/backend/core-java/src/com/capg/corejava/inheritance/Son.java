package com.capg.corejava.inheritance;

public class Son extends Father implements InterfaceExamples {
	String sname="robb";
 
	public static void main(String[] args) {
		Son s=new Son();
		s.print();
		s.display();
		s.show();
	}
	@Override
 public void print() {
	 System.out.println(sname+" "+ fname +" "+lastname);
	 super.print();
 }
	@Override
	 public void display() {
		 System.out.println("display method in son");
		 super.print();
	 }
	@Override
	 public void show () {
		 System.out.println(" show method in son");
		 super.print();
	 }
}
