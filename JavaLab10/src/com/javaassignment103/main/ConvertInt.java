package com.javaassignment103.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertInt {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
	      try {
		        int st = scanner.nextInt();
		        System.out.print("Converted string value to "
		        		+ "int: " +st);
	      }     
	     catch (InputMismatchException e) {
      System.out.println("Please enter a valid .");
          }
      }
}
