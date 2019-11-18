package com.capgemini.hotelmanagementsystem.exception;

@SuppressWarnings("serial")
public class HotelManagementSystemExceptionController extends RuntimeException {
	String message;

	public HotelManagementSystemExceptionController(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
