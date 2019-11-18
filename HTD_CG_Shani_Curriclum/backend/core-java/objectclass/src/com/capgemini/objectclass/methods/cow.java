package com.capgemini.objectclass.methods;

public class cow {
	int id;
	String name;

	public boolean equals(cow ref) 
	{
		cow r = (cow) ref; //downcasting to be done
		if (this.id == r.id) 
		{
			if (this.name.equals(r.name))
			{
				return true;
			} else 
			{
				return false;
			}
		} 
		else 
		{
			return false;

		}
	}
}