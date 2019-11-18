package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treebank {
	

	public static void main(String[] args) {

		
		ById comp=new ById();
		Byname compByname = new Byname();
		TreeSet<Bank> hs = new TreeSet<Bank>();

		Bank e1 = new Bank(1, "miyabank", 45009l);
		Bank e2 = new Bank(2, "jiyabank", 499009l);
		Bank e3 = new Bank(3, "kiyabank", 2333009l);
		Bank e4 = new Bank(4, "liyabank", 788009l);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);

		Iterator<Bank> it = hs.iterator();
		while (it.hasNext()) {
			Bank r = it.next();
			System.out.println("pin is" + r.pin);
			System.out.println("name is" + r.name);
			System.out.println("micr is" + r.micr);
			System.out.println("-------");
		}

	}

}
