package com.capgemini.sorting.set;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet<Emp>();
		hs.add(23);
		hs.add(45.8);
		hs.add("shim");
		hs.add(null);
		
		for(Object r:hs) {
			System.out.println(r); 
		}
		
	}

}
