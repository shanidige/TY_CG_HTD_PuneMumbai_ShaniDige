package com.capgemini.exception.arithmaetic;

public class arrayexception {

	public static void main(String[] args) {
		System.out.println("main started");
		
		int [] y = new int[3];
		try {
			System.out.println(y[7]);
		} 
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("please don't cross array index");
		}
		System.out.println("main ended");
	}
}