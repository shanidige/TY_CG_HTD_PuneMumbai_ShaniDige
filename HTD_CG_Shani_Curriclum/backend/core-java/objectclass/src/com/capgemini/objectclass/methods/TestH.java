package com.capgemini.objectclass.methods;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {
 marker m= new marker ("camlin",1);
 
	System.out.println("id is"+m.id);
	System.out.println("name is"+m.name);
	System.out.println("---------");
	
	Object r= m.clone();
	marker k=(marker)r;
	
	System.out.println("id is"+m.id);
	System.out.println("name is"+m.name);
	
	
	
	}

}
