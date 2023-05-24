package com.javaassignment101.main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SqValue {
	public int num;
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
		     try {
			        double num = scanner.nextDouble();
			        double square = num * num;
	        System.out.println("The square of " + num + " is " 
	        			+ square);
	 } 
		     catch (InputMismatchException e) {
	        System.out.println("Error: Please enter a "
	        		+ "valid number.");
	            }
	        }
}

