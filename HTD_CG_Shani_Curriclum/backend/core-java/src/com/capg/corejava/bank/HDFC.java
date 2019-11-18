package com.capg.corejava.bank;

public class HDFC implements ATM {

	@Override
	public void validatecard() {
		System.out.println("......connecting to hdfc db");
		System.out.println("validate data of hdfc db");
	}

	@Override
	public void getinfo() {
		System.out.println("......connecting to hdfc db");
		System.out.println("getting data of hdfc db");


}
}
