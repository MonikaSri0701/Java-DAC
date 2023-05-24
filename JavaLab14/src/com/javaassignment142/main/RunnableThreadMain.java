package com.javaassignment142.main;

public class RunnableThreadMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableThread());
		t1.start();
		try {
			for(int i = 1;  i<=10; i++) {
			System.out.println("RunnableThread Main says: " +i);
			Thread.sleep(1500);
			}
			System.out.println("RunnableThread Main ends here");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}


