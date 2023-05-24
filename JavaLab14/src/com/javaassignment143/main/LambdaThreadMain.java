package com.javaassignment143.main;

public class LambdaThreadMain {

	public static void main(String[] args) {
	Thread t1 = new Thread (() -> {	
	try {
		int n = 5; int factorial = 1;
		for(int i = 1;  i<=n; i++) {
		factorial *= i;
		System.out.println("Factorial of " + n + " is " + factorial);			
		Thread.sleep(1500);		}
		System.out.println("LambdaThread Main ends here");
		}
		catch(InterruptedException e) {
			e.printStackTrace();	}		
	});
	t1.start();
	try {
		int n = 5;int factorial = 1;
		for(int i = 1;  i<=n; i++) {
		factorial *= i;
		System.out.println("Factorial of " + n + " is " +factorial);				
		Thread.sleep(1500);}
		System.out.println("LambdaThread ends here");
		}
		catch(InterruptedException e) {
		e.printStackTrace();	}	
}
	}


