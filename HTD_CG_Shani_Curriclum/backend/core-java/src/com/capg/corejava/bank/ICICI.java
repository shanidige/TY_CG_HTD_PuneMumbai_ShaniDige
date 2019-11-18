package com.capg.corejava.bank;

public class ICICI implements ATM {

	@Override
	public void validatecard() {
		System.out.println("......connecting to icici db");
		System.out.println("validate data of icici db");
	}

	@Override
	public void getinfo() {
		System.out.println("......connecting to icici db");
		System.out.println("getting data of icici db");

	}

}
