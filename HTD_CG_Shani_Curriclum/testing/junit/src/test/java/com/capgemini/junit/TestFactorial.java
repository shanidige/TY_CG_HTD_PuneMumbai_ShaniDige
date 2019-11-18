package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	public void Testfact() {
		Factorial f= new Factorial();
		int i=f.fact(5);
		assertEquals(120, i);
	
	}
	
	@Test
	public void Testfactzero() {
		Factorial f= new Factorial();
		int i=f.fact(0);
		assertEquals(1, i);
	
	}

}
