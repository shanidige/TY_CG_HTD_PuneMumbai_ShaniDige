package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Calculatortest {
	private Calculator calculator = null;

	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}

	@Test
	public void Testadd() {
		int i = calculator.add(10, 5);
		assertEquals(15, i);
	}

	@Test
	public void Testsub() {
		int j = calculator.sub(10, 5);
		assertEquals(5, j);
	}

	@Test
	public void Testmul() {
		int k = calculator.mul(10, 5);
		assertEquals(50, k);
	}

	@Test
	public void Testdiv() {
		int l = calculator.div(10, 5);
		assertEquals(2, l);
	}

	@Test
	public void Testdivzero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
	}

}
