package com.capgemini.thread;

public class PVR {
	synchronized void confirm()// synchronized method to make thread safe
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void leavesme() {
		System.out.println("notify called");
		notify();
	}
}
