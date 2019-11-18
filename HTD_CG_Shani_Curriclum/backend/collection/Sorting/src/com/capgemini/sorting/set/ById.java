package com.capgemini.sorting.set;

import java.util.Comparator;

public class ById implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		if(b1.pin>b2.pin) {
			return 1;
		}
		
		else if(b1.pin<b2.pin) {
			return -1;
		}else {
		return 0;}
	}
	

}
