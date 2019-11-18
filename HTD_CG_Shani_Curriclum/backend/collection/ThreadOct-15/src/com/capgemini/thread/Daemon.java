package com.capgemini.thread;

public class Daemon {
	public static void main(String[] args) {

		System.out.println("Main started");
		Pen p = new Pen();
		p.setDaemon(true);
		p.start();
		
		Pen t = new Pen();
		t.setDaemon(true);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
