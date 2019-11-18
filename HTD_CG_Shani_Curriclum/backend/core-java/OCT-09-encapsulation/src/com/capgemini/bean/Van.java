package com.capgemini.bean;

public class Van {
	private static Van v = new Van();

	private Van() {

	}

	public static Van getVan() {
		return v;
	}
}
