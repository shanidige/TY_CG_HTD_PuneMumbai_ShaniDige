package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore1.annotation.beans.MessageBean;

@Configuration
public class MessageConfig {

	@Bean
	@Scope("prototype")
	public MessageBean getMessage() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("hello world .....");
		return messageBean;

	}

}// end of class
