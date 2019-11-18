package com.capgemini.exception.arithmaetic;

public class Arithmetic_Arrayexecpption {

	public static void main(String[] args) {
		System.out.println("main started");

		int[] y = new int[3];
		String s= null;
		try {
			System.out.println(10 / 0);//here arithmetic catch method is not present so it will execute general catch block
			System.out.println(s.toUpperCase());
			System.out.println(y[7]);	
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("please don't cross array index");
		} 
		catch(NullPointerException b) {
			System.out.println("not valid");
		}
		
		catch(Exception  g) { //general exception  & it should be last block in code
			System.out.println("sorry something went wrong");
		}
		System.out.println("main ended");
}
}
