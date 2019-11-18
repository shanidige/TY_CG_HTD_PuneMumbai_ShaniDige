package com.capgemini.exception.custom;

public class InvalidLemitException extends Exception {
	private String msg = "day limit is only 40000";

	@Override
	public String toString() {
		return msg;
	}

}
