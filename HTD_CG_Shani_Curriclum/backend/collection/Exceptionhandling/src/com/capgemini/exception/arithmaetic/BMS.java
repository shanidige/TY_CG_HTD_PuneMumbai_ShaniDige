package com.capgemini.exception.arithmaetic;

public class BMS {

	public static void main(String[] args) {
		System.out.println("main strated");
		Pvr p = new Pvr();
		try {
			p.confirm();
		} catch (ArithmeticException m) {
			System.out.println("exception cause at main inbms");
		}
		System.out.println(" main ended");
	}

}
