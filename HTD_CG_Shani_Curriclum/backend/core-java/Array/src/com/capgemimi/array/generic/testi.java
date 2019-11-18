package com.capgemimi.array.generic;

interface msg{
	void gm();
}


public class testi {

	public static void main(String[] args) {
		msg m= () -> System.out.println("good morning");
		m.gm();

	}

}
