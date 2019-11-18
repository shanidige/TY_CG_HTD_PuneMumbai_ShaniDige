package com.capgemini.sorting.set;

import java.util.Comparator;

public class Bymicr implements Comparator<Bank>{

	@Override
	public int compare(Bank b1, Bank b2) {
		Long k=b1.micr;
		Long p=b2.micr;
		return k.compareTo(p);
	}
	

}
