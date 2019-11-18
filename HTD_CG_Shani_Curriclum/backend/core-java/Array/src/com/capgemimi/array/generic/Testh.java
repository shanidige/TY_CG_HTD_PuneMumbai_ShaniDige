
package com.capgemimi.array.generic;


	interface sum {
		 int add(int a,int b);


	 
	 public class Testh
	 {
		 public static void main(String[]args) {
			 sum f=(a,b)  -> a+b;
			 int j=f.add(10,20);
			 System.out.println("sum is"  + j);
			 
		 }
	 }
	}

