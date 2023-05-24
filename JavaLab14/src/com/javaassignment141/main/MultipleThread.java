package com.javaassignment141.main;

public class MultipleThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 1;  i<=10; i++) {
				System.out.println("Multiple Thread says: " +i);
				Thread.sleep(2000);
			}
			System.out.println("Multiple Thread ends here");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
