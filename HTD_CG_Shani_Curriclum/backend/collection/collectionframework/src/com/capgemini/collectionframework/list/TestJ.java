package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("raju");
		al.add(19);
		al.add('m');
		al.add(6.14);
		
		Iterator<Double> it=al.iterator();
		
		
		while(it.hasNext()) {
			Double r= it.next();
			System.out.println(r);
		}

	}

}
