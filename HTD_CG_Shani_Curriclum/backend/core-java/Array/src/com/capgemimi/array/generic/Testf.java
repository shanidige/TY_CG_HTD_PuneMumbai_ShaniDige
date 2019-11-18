package com.capgemimi.array.generic;

public class Testf {
	public static void main(String[] args)
	{
		int[] i = chinnu();
		for (int k : i) 
		{
			System.out.println(k);
		}
	}

	static int[] chinnu() 
	{
		int[] a = { 10, 20, 30, 40 };
		return a;
	}
}
