package com.javaassignment1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptName {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Enter your name : ");
		String uname = br.readLine();
		
		System.out.println("Your name : " + uname);

	}

}
