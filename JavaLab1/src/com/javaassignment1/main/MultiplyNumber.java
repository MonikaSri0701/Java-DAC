package com.javaassignment1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyNumber {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter first number: ");
		int fnum =Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number: ");
		int snum =Integer.parseInt(br.readLine());
		
		
		System.out.println("Multiplication of 2 numbers: " 
		+ ( fnum*snum ));

	}
}