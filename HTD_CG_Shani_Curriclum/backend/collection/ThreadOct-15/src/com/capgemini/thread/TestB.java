package com.capgemini.thread;

public class TestB {

	public static void main(String[] args) {
		PVR  a =new PVR();
		Paytm p1= new Paytm(a);
		p1.start();
		Paytm p2= new Paytm(a);
		p2.start();
		a.leavesme();
		


	}

}
