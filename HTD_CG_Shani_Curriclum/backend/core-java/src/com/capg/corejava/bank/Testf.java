package com.capg.corejava.bank;

public class Testf {

	public static void main(String[] args) {
Pen p= new Marker();//up-casting
Marker i= (Marker)p;//down-casting
i.cost=100;
i.write();
i.size=2.4;
i.colour();

	}

}
