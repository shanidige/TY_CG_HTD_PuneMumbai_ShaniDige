package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(58.9);
		al.add(19.87);
		al.add(65.9);
		al.add(6.14);

		for (int i = 0; i < 4; i++) {
			Double r = al.get(i);
			System.out.println(r);
		}

	}

}
