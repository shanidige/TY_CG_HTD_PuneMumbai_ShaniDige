package com.capgemimi.array.generic;

public class mousetest {

	public static void main(String[] args) {
		mouse m =new mouse();
       double [] t= {12.3,34.5,56.8};
        m.walk(t);
        
        
        int[] j= {12,23,45,67};
        m.run(j);
        
        System.out.println("-------");
        int[] h= {12,23,45,67};
        m.onlyodd(h);
	}

}
