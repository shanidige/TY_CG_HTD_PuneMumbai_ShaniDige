package com.capgemini.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo {
	Scanner sc = new Scanner(System.in); 
 
public boolean cardno(String num) {
	Pattern pat = Pattern.compile("\\d{16}");
	 long r = sc.nextLong();
		String str1 = Long.toString(r);
		Matcher mat = pat.matcher("str1");
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	
}
}
