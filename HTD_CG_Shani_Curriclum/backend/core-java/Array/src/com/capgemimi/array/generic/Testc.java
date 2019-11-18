package com.capgemimi.array.generic;

public class Testc {

	public static void main(String[] args) {
		char ch[] = { 'a', 'p', 'p', 'l', 'e' };
		for (char a : ch) {
			System.out.println(a);
		}

		double d[] = { 24.8, 98.8, 34.6, 56.8 };
		for (double g : d) {
			System.out.println(g);
		}

		double[] a = new double[4];
		a[2] = 100;
		for (double f : a) {
			System.out.println(f);
		}
	}
}