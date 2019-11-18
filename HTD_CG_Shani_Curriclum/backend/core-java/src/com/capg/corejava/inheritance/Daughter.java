package com.capg.corejava.inheritance;

public class Daughter extends Father {
	String dname="sansa";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d=new Daughter();
		d.print();
		d.display();
		d.show();

	}
	@Override
	public void print() {
		 System.out.println(dname+" "+ fname +" "+lastname);
		 super.print();
	 }
	@Override
	 public void display() {
		 System.out.println("display method in daughter");
		 super.print();
	 }
	@Override
	 public void show() {
		 System.out.println(" show method in daughter");
		 super.print();
	 }
}
