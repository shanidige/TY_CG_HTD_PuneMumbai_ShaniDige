package com.capg.corejava.bank;

public class SBI implements ATM {

	@Override
	public void validatecard() {
		System.out.println("......connecting to sbi db");
		System.out.println("validate data of sbi db");
	}

	@Override
	public void getinfo() {
		System.out.println("......connecting to sbi db");
		System.out.println("getting data of sbi db");

}
}
