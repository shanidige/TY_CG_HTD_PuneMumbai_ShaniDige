package com.capg.corejava.cfs;

public class switchexample {
	public static void main(String[] args) {
		int dn = 5;
		switch (dn) {
		case 1:
			System.out.println("monday");
			break;
		default:
			System.out.println("invaid day");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;

		}
		switch (dn) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("weekdays");
			break;
		case 6:
		case 7:
			System.out.println("weekend days");

		default:
			System.out.println("invaid day");
		}
	}
}
