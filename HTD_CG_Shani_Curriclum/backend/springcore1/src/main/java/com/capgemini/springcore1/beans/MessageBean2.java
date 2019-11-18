package com.capgemini.springcore1.beans;

import java.lang.reflect.Constructor;

public class MessageBean2 {

	
	public  MessageBean2() {
		System.out.println("constuctor o/p");
	}
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println(" Its's Init phase");
	}
	public void destroy () {
		System.out.println(" It's Destroy phase");
	}
}
