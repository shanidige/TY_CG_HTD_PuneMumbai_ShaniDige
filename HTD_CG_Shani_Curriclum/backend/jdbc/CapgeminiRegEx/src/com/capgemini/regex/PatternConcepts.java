
package com.capgemini.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pat1 = Pattern.compile("\\d");// for single digit pattern
		Matcher mat1 = pat1.matcher("1");// matches class check for the matches
		System.out.println("For pattern \\d:" + mat1.matches());

		Pattern pat2 = Pattern.compile("\\d+");// for more than one digit pattern
		Matcher mat2 = pat2.matcher("12345");// matches class check for the matches
		System.out.println("For pattern \\d+:" + mat2.matches());

		Pattern pat3 = Pattern.compile("\\d{16}");// for only ten digit pattern e.g mobile number
		Matcher mat3 = pat3.matcher("1234567990123443");// matches class check for the matches
		System.out.println("For pattern \\d{9}:" + mat3.matches());

		Pattern pat4 = Pattern.compile("\\d{0}");// for only zero digit pattern e.g mobile number
		Matcher mat4 = pat4.matcher("");// matches class check for the matches
		System.out.println("For pattern \\d{0}:" + mat4.matches());

		Pattern pat5 = Pattern.compile("\\d{1,9}");// it take only 1-9 digit
		Matcher mat5 = pat3.matcher("123456799");
		System.out.println("For pattern \\d{1,9}:" + mat5.matches());
		
		
		System.out.println("**____________________***********");
		
		
		Pattern pat6 = Pattern.compile("\\D");// it can take anything except ***single digit*** pattern
		Matcher mat6 = pat6.matcher("A");// matches class check for the matches
		System.out.println("For pattern \\D:" + mat6.matches());
		
		Pattern pat7 = Pattern.compile("\\D+");// it can take anything except ***any digit digit*** pattern
		Matcher mat7 = pat7.matcher("AU@@@");// matches class check for the matches
		System.out.println("For pattern \\D+:" + mat7.matches());
		
		
		System.out.println("*********************************");
		Pattern pat8 = Pattern.compile("\\s");//for single space
		Matcher mat8 = pat8.matcher(" ");
		System.out.println("For pattern \\s:" + mat8.matches());
		
		Pattern pat9 = Pattern.compile("\\s+");//for multiple space
		Matcher mat9 = pat9.matcher("   ");
		System.out.println("For pattern \\s+:" + mat9.matches());
		
		Pattern pat10 = Pattern.compile("\\S");//for no space but you can give single charater
		Matcher mat10 = pat10.matcher("a++");
		System.out.println("For pattern \\S:" + mat10.matches());
		
		Pattern pat11 = Pattern.compile("\\S+");//for no space but you can you anything 
		Matcher mat11 = pat11.matcher("567aa");
		System.out.println("For pattern \\S+:" + mat11.matches());
		
		System.out.println("*************************************");
		
		
		Pattern pat12 = Pattern.compile("\\w"); // represents single char 
		Matcher mat12 = pat12.matcher("v");
		System.out.println("For \\w:"+mat12.matches());
		
		
		Pattern pat13 = Pattern.compile("\\w+"); // represents multiple char 
		Matcher mat13 = pat13.matcher("qwerty");
		System.out.println("For \\w+:"+mat13.matches());
		
		
		Pattern pat14 = Pattern.compile("\\W"); // represents anything but char (special char)
		Matcher mat14 = pat14.matcher("!");
		System.out.println("For \\W:"+mat14.matches());
		
		Pattern pat15= Pattern.compile("\\W+"); // represents anything but chars (special chars)
		Matcher mat15= pat15.matcher("!!$^#(");
		System.out.println("For \\W+:"+mat15.matches());
		
		Pattern pat = Pattern.compile("\\d{16}");
		long r = sc.nextLong();
		String str1 = Long.toString(r);
		Matcher mat = pat.matcher(str1);
		System.out.println("validation of card is "+mat.matches());
		 
		

	}

}
