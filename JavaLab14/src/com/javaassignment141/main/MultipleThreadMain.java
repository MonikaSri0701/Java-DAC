package com.javaassignment141.main;

public class MultipleThreadMain {

	public static void main(String[] args) {
		MultipleThread t1 = new MultipleThread();
		t1.start();
		try {
			for(int i = 1;  i<=10; i++) {
			System.out.println("Multiple Thread Main says: " +i);
			Thread.sleep(2000);
			}
			System.out.println("Multiple Thread Main ends here");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
