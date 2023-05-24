package com.javaassignment144.main;

public class PrimeFibonacciMain {

	public static void main(String[] args) {
		PrimeandFibo ap = new PrimeandFibo();
		Thread t1 = new Thread(() -> ap.prime(100));
		Thread t2 = new Thread(() -> ap.Fibonacci(50));
		System.out.println("The Fibo series are:");
		t2.start();
		try {
			
			Thread.sleep(1000);
		}catch (InterruptedException e) {
            e.printStackTrace();
        }
	System.out.println("The Prime number series are:");	
		t1.start();

	}
}