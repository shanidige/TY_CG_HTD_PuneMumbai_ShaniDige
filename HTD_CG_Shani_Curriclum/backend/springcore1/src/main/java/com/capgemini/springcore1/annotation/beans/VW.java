package com.capgemini.springcore1.annotation.beans;

import com.capgemini.springcore1.interfaces.Engine;

public class VW implements Engine {

	@Override
	public int getCC() {
		return 2300;
	}

	@Override
	public String getType() {
		return "4-stroke Disel";
	}

}
