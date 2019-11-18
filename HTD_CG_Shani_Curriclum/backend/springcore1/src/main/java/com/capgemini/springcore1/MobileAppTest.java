package com.capgemini.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore1.beans.MobileBean;
import com.capgemini.springcore1.beans.MobileDisplayBean;

public class MobileAppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		MobileBean mobileBean = context.getBean("mobile",MobileBean.class);
		
		System.out.println("Brand Name : "+ mobileBean.getBrandName());
		System.out.println("Model Name :"+mobileBean.getModelName());
		System.out.println("price :" +mobileBean.getPrice());
		System.out.println("display size :"+mobileBean.getMobileBean().getDisplaySize());
		System.out.println("resolution :" + mobileBean.getMobileBean().getResolution());

	}

}
