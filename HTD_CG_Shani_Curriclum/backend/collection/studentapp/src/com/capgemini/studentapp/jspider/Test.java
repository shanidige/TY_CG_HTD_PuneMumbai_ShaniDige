package com.capgemini.studentapp.jspider;
import com.capgemini.student.qspiders.QTP;
import com.capgemini.student.qspiders.Selenium;


public class Test {

	public static void main(String[] args) {
		Selenium s= new Selenium();
		s.teachrselenium();
		QTP q= new QTP();
		q.teachrQTP();
		 
		Angular a= new Angular();
		a.teachangular();

	}

}
