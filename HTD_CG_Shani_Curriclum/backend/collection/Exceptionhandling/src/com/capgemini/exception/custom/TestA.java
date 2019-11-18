package com.capgemini.exception.custom;

public class TestA {
	public static void main(String[] args) {
		validator v = new validator();
		try {
			v.Verify(25);
			System.out.println("welcome to pub");
		} catch (InvalidAgeException in) {
			System.out.println("in.getmsg");
		}
	}
}
