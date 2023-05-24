package com.scannerdemo.main;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int fnum = sc.nextInt();

		System.out.print("Enter second number: ");
		int snum = sc.nextInt();

		System.out.println("Sum of " + fnum + " and " + snum + " is " + (fnum + snum));
	}

}
