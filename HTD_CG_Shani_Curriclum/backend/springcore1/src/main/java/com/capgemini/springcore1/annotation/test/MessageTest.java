package com.capgemini.springcore1.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.springcore1.annotation.config.MessageConfig;
import com.capgemini.springcore1.annotation.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println("Messsage 1="+messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println("Messsage 2="+messageBean2.getMessage());
		
		
		messageBean2.setMessage("It's New Message for Bean2");
		System.out.println("Messsage 1="+messageBean.getMessage());
		System.out.println("Messsage 2="+messageBean2.getMessage());
	}

}
