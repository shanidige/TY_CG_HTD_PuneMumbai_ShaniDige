package com.capgemini.springcore1.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.annotation.beans.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		Car myCar = context.getBean("myCar", Car.class);

		System.out.println("model Name :" + myCar.getModelName());
		System.out.println("model No   :" + myCar.getModelNo());
		System.out.println("Engie Info");
		System.out.println("CC         :" + myCar.getEngine().getCC());
		System.out.println("Type       :" + myCar.getEngine().getType());

	}

}
