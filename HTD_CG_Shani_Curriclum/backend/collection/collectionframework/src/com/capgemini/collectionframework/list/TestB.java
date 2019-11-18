package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("chinnu");
		al.add(2.99);
		al.add('f');

		/*
		 * Object r=al.get(0); Object t=al.get(1); Object s=al.get(2); Object
		 * m=al.get(3); System.out.println(r); System.out.println(t);
		 * System.out.println(s); System.out.println(m);
		 */

		/*
		 * 
		 * for(int i=0;i<4;i++) { Object r= al.get(i); System.out.println(r); }
		 */
		
		
		for(Object r:al) {
			System.out.println(r);
		}
		

	}

}
