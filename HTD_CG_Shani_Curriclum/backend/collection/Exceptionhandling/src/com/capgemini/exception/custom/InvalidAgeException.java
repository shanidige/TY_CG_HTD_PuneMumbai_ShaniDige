package com.capgemini.exception.custom;

public class InvalidAgeException extends RuntimeException {
	private String msg = "Invalid age to proceed";
	
	@Override
	public String toString() {
		return msg;
	}
}
