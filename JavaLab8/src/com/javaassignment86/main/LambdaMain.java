package com.javaassignment86.main;

public class LambdaMain {
	
	public static void main(String[] args) {
		
		MethodRef ref = LambdaMain :: perform;
		System.out.println("Sum of 10 and 20: " 
				+ref.calculate(10, 20));	
		
		ref = new LambdaMain( ) :: doSomeTask;
		System.out.println("Product of 10 and 20: " 
				+ref.calculate(10, 20));
	}	
	public static int perform(int a, int b) {
		return(a+b);
	}
	public int doSomeTask(int a, int b) {
		return(a*b);
	}
}
