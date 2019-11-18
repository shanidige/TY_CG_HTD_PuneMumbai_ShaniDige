package com.capgemini.vidyathri;

import java.util.Collections;
import java.util.LinkedList;

public class Arraylistdouble {

	public static void main(String[] args) {
		LinkedList<Double> al = new LinkedList<Double>();
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);

		/*ArrayList<Double> bl = new ArrayList<Double>();
		bl.add(29.4);
		bl.add(3.6);
		System.out.println();*/
		
		System.out.println("before"+al);
		Collections.sort(al);
		System.out.println("after"+al);
	}

}
