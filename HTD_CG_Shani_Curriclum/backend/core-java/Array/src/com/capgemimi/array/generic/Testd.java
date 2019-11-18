package com.capgemimi.array.generic;

public class Testd {

	public static void main(String[] args) {
		String m[] = { "rd","rf","rm" };
		recive(m);
	}

	static void recive(String[] d) {//static bcoz no obj created
		for (String i : d) {
			System.out.println(i);
		}
	}
}
