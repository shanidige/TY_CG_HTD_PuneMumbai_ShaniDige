package com.capgemini.exception.custom;

public class amount {
	void check(int val) throws InvalidLemitException {
		if (val > 40000) {
			throw new InvalidLemitException();
		}
	}

}
