package com.capgemini.exception.custom;

public class validator {

	void Verify(int age)
	{
		if (age < 18) 
		{
			throw new InvalidAgeException();
		}
	}

}
