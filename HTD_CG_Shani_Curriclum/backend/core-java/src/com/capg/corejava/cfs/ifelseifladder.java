package com.capg.corejava.cfs;

public class ifelseifladder {
	public static void main(String[]args) {
		int m=25;
		if(m>=75)
		{
			System.out.println("garde A");
		}
		else if(m>=50 && m<=75)
		{
			System.out.println("garde B");
		}
		else if(m>=35 && m<50)
		{
			System.out.println("garde B");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
