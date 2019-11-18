package com.capgemini.exception.custom;

public class TestB {
	public static void main(String[] args) {
		amount a = new amount();
		try {
			a.check(32000);
			System.out.println("collect cash");
		} catch (InvalidLemitException e) {
			e.printStackTrace();
		}
	}
}
