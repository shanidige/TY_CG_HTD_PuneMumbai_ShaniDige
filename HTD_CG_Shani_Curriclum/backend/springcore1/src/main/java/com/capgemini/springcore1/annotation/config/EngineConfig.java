package com.capgemini.springcore1.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore1.annotation.beans.ISuzu;
import com.capgemini.springcore1.annotation.beans.VW;
import com.capgemini.springcore1.interfaces.Engine;

@Configuration
public class EngineConfig {
	@Bean(name = "iSuzu")
	@Primary
	public Engine getISuzu() {
		return new ISuzu();
	}

	@Bean(name = "vw")
	public Engine getVW() {
		return new VW();
	}

}
