package com.capgemimi.array.generic;

public class Teste {

	public static void main(String[] args) {
		student []st = new student[4];
student s1=new student (1,"yash",67.6);
student s2=new student (2,"ash",67.67);
student s3=new student (3,"sh",60.6);
student s4=new student (4,"ysh",87.6);

st[0]=s1;
st[1]=s2;
st[2]=s3;
st[3]=s4;

recive(st);
	}
static void recive(student[]ar) {
	for(student k:ar) {
		System.out.println(k.id);
		System.out.println(k.name);
		System.out.println(k.percentage);
	}

	}

}
