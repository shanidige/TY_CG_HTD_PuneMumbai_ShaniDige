package com.capgemini.exception.arithmaetic;

public class IRCTC {
	void confirm() {
		System.out.println("confirm started");
		try {
		System.out.println(10/0);
		}catch(ArithmeticException  g) {
			System.out.println("exception present in confirm");
		}

		System.out.println("confimation ended");
	}
}