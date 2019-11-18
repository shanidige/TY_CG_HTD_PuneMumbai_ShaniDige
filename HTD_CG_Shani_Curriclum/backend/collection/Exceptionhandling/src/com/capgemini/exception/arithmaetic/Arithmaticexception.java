package com.capgemini.exception.arithmaetic;

public class Arithmaticexception {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			System.out.println(10/0);
			System.out.println("hi");
		} 
		catch(ArithmeticException a) {
			System.out.println("please don't divide by zero");
		}
		System.out.println("main ended");
		
		
		
		System.out.println("------------------------------");
		
		System.out.println("main started");
		try {
			System.out.println(10/2);
		} 
		catch(ArithmeticException a) {
			System.out.println("please don't divide by zero");
		}
		System.out.println("main ended");
	}
}