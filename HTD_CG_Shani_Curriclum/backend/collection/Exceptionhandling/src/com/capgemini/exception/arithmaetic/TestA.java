package com.capgemini.exception.arithmaetic;

import java.io.File;
import java.io.IOException;

public class TestA {

	public static void main(String[] args) {
System.out.println("main started");
File f=new File("vikas.txt");
try {
	f.createNewFile();
	System.out.println("file is created");
}
catch(IOException h) {
	System.out.println("sorry not able to file not created");
}
System.out.println("main ended");

	}

}
