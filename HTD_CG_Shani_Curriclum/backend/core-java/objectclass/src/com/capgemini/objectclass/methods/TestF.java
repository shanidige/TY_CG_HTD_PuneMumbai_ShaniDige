package com.capgemini.objectclass.methods;

public class TestF {

	public static void main(String[] args) {
cow c= new cow();
c.id=1;
c.name="ganga";

cow d= new cow();
d.id=2;
d.name="tunga";


cow e= new cow();
e.id=1;
e.name="ganga";

boolean result= c.equals(e);
System.out.println(result);



	}

}
