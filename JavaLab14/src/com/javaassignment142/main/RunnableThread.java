package com.javaassignment142.main;

public class RunnableThread implements Runnable {
	@Override
	public void run() {
		try {
			for(int i = 1;  i<=10; i++) {
				System.out.println("RunnableThread says: " +i);
				Thread.sleep(2500);
			}
			System.out.println("RunnableThread ends here");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}


