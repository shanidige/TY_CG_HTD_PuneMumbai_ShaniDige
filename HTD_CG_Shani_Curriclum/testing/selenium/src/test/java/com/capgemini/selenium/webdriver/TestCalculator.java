package com.capgemini.selenium.webdriver;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	@Test
	public void add() {

		Caluculator cal = new Caluculator();
		int a = 10;
		int b = 11;
		int i = cal.add(a, b);
		Assert.assertEquals(21, i);

	}
}