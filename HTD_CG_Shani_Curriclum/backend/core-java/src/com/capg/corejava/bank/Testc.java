package com.capg.corejava.bank;

public class Testc {
	public static void main(String[] args) {
		Machine m=new Machine();
		HDFC h=new HDFC();
		ICICI i=new ICICI();
		SBI s=new SBI();
		m.slot(s);
	}

}
