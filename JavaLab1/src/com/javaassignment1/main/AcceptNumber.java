package com.javaassignment1.main;

import java.util.Scanner;

public class AcceptNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Accept first number: ");
		int num1 =sc.nextInt();
		
		System.out.print("Accept second number: ");
		int num2 =sc.nextInt();
		
		
		System.out.println("Your first number is:" + num1);
		System.out.println("Your first number is:" + num2);
	}

}
