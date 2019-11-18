package com.capgemini.springcore1.annotation.beans;

import com.capgemini.springcore1.interfaces.Engine;

public class ISuzu implements Engine {

	@Override
	public int getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "4-stroke Petrol";
	}

}
