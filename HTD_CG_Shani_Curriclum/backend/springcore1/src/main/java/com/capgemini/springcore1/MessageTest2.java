package com.capgemini.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.MessageBean2;

public class MessageTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		
		MessageBean2 messageBean2 = context.getBean("messageBean2",MessageBean2.class);
		System.out.println("Message =" + messageBean2.getMessage());
		
		
		MessageBean2 Bean2 = context.getBean("messageBean2",MessageBean2.class);
		System.out.println("Message =" + Bean2.getMessage());
		
		((AbstractApplicationContext)context).close();
	}

}
