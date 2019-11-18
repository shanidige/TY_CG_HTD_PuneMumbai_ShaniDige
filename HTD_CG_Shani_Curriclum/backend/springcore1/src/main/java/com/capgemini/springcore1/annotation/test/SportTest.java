package com.capgemini.springcore1.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.Sports;

public class SportTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sportsConfig.xml");

		Sports sports = context.getBean("sports", Sports.class);

		System.out.println("Sports name : " + sports.getName());
		System.out.println("Total players : " + sports.getTotalPlayers());
		System.out.println("Team Info : " + sports.getTeamInfo());

	}

}
