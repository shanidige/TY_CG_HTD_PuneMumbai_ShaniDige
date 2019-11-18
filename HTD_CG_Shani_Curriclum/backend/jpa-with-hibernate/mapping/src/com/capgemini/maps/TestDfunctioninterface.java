package com.capgemini.maps;

import java.util.function.Function;

public class TestDfunctioninterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f=i-> i*i;
		int ans=f.apply(5);
		System.out.println("result is "+ ans);

	}

}
