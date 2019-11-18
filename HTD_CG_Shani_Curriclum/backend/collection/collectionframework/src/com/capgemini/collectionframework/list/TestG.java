package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("raju");
		al.add(19);
		al.add('m');
		al.add(6.14);
		
		for(Object r:al) {
			System.out.println(r);
		}

	}

}
