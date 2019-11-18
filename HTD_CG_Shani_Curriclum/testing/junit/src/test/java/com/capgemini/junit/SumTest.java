package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void add() {
		Sum s = new Sum();
		int i = s.add(-10, 5);
		assertEquals(-5, i);
	}

	@Test
	public void add3() {
		Sum s = new Sum();
		int i = s.add(-2, 5, 5);
		assertEquals(8, i);
	}

}
