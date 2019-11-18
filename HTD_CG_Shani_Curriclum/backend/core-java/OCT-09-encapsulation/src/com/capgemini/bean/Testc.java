package com.capgemini.bean;

public class Testc {

	public static void main(String[] args) {
		Van r = Van.getVan();
		System.out.println(r);

		Van t = Van.getVan();
		System.out.println(t);

		Van s = Van.getVan();
		System.out.println(s);
	}

}
