package com.javaassignment102.main;
import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	        arr[i] = scanner.nextInt();
	}

System.out.print("Enter the position of the element to print: ");
	         int position = scanner.nextInt();

	   try {
	       System.out.println("Element at position " 
	    		   + position + " is " + arr[position - 1]);
	   } catch (ArrayIndexOutOfBoundsException e) {
	       System.out.println("Invalid position. The array "
	       		+ "size is " + n);
 }
	    }
  }

