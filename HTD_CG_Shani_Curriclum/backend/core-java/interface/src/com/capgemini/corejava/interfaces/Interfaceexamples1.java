package com.capgemini.corejava.interfaces;

public class Interfaceexamples1 extends Interfaceexample {

	@Override
	public void print() {
		System.out.println("interface example 1 got compiled");
	}

	public static void show() {
		System.out.println("interface displayed 1");
	}

	public void numprint() {
		System.out.println("interface numprint");
	}

	public static void main(String[] args) {
		Interfaceexamples1 obj1 = new Interfaceexamples1();
		obj1.print();
		Interfaceexamples1.show();
		obj1.display();
		obj1.numprint();
	}

	public void display() {
		System.out.println("");
	}

}
