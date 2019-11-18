package com.capgemini.vidyathri;

import java.util.ArrayList;
import java.util.Collections;

public class Sortedall {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("m");
		al.add("n");
		al.add("f");
		al.add("k");
		System.out.println("before "+al);
		//Collections.sort(al);
		
		Collections.shuffle(al);
		System.out.println("after"+al);
		

	}

}
