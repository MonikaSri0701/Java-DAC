package com.scannerdemo.main;

import java.util.Scanner;

public class ScannerMain1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double fnum = sc.nextDouble();

		System.out.print("Enter second number: ");
		double snum = sc.nextDouble();

		System.out.println("Sum of " + fnum + " and " + snum + " is " + (fnum + snum));
	}

}
