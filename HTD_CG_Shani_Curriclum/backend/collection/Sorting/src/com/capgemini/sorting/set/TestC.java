package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(Double[] args) {
		LinkedHashSet<Double> hs = new LinkedHashSet<Double>();
		hs.add(56.87);
		hs.add(7.8);
		hs.add(456.9);
		hs.add(null);

		for (Double r : hs) {
			System.out.println(r);
		}
		
	
		System.out.println("-----------------");
		
		
		Iterator<Double> it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}


	}

}
