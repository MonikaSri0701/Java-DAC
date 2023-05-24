package com.javaassignment156.main;

public class ProdConsMain {

	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
		};
		t1.start();
		t2.start();		
	}
}
