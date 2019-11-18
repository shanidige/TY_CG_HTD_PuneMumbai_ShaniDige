package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestP {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("priya");
		al.add("ziya");
		al.add("miya");
		
		
		for(int i=0;i<3;i++) {
			Object r= al.get(i);
			System.out.println(r);
		}
		
		System.out.println("-----------");
		
		for(String s: al) {
			System.out.println(s);
		}
		System.out.println("-----------");
		
		Iterator <String>it= al.iterator();
		
		while(it.hasNext()) {
			String st=it.next();
			System.out.println(st);
		}
		
		
		
	}

}
