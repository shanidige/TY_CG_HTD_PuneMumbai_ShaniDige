package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(58.9);
		al.add(19.87);
		al.add(65.9);
		al.add(6.14);
		
		ListIterator it= al.listIterator();
		System.out.println("forwrd>>>>>>>");
		while(it.hasNext()) {
			Double r= (Double) it.next();
			System.out.println(r);
		}
		
		
		System.out.println("<<<<<backword");
		while(it.hasPrevious()) {
			Double r= (Double) it.previous();
			System.out.println(r);
		}
		
		
		
	}

}
