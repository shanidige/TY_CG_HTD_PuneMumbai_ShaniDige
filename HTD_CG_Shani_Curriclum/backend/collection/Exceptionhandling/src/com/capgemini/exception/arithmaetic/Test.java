package com.capgemini.exception.arithmaetic;

public abstract class Test {

	public static void main(String[] args) {
		System.out.println("main method");
		paytm p = new paytm();
		try {
		p.book();
		}
		catch(ArithmeticException  a)
		{
			System.out.println("exception is in main method");
		}
		System.out.println("main ended");
	}

}
