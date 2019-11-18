package com.capgemini.exception.arithmaetic;

public class paytm {
	void book() {
		System.out.println("book started");
		IRCTC i = new IRCTC();
		try {
		i.confirm();
		}
catch(ArithmeticException b) {
	System.out.println("exception present in book");
}
		System.out.println("book ended");
	}
}