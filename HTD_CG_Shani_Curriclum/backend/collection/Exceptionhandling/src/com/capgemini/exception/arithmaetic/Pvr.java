package com.capgemini.exception.arithmaetic;

public class Pvr {
	void confirm() {
		System.out.println("confirm started");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException g) {
			System.out.println("exception present at confirm in pvr");
			throw g;
		} finally {// it display even after exception occur
			System.out.println("confimation ended");

		}
	}
}
