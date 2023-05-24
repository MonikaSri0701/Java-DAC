package com.practiceset.main;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);		   
		    System.out.print("Enter the number of elements in the array: ");
		    int n = input.nextInt();
		    int[] arr = new int[n];		       
		    System.out.println("Enter the values of the array elements:");
		    for (int i = 0; i < n; i++) {
		    arr[i] = input.nextInt();
		    }
		        
		    int sum = 0;
		    for (int i = 0; i < n; i++) {
		    sum += arr[i];
		    }

		    double average = (double) sum / n;		       
		    System.out.println("The average value of the array elements is " + average);
	}
}

