package com.javaassignment1.main;

import java.util.Scanner;

public class AddFloat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		float fnum =sc.nextFloat();
		
		System.out.println("Enter second number: ");
		float snum =sc.nextFloat();
		
		
		System.out.println("Sum of " + fnum  + " and " + snum  
				+ " is "  + (fnum+snum));
	}

}