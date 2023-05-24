package com.commandreport.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandReport {

	public static void main(String[] args) throws IOException {
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("            Report Card ");
		
		System.out.println("Full name of Student: ");
		String fullname = br.readLine();
		System.out.println("Your name : " + fullname);
		
		System.out.println("Course Name: ");
		String coursename = br.readLine();
		System.out.println("Your name : " + coursename);
		
		System.out.println("Enter Maths subject marks: ");
		int maths =Integer.parseInt(br.readLine());
		
		System.out.println("Enter Chemistry subject marks: ");
		int chemistry =Integer.parseInt(br.readLine());
		
		System.out.println("Enter Physics subject marks: ");
		int physics =Integer.parseInt(br.readLine());
		
		float avg = (maths+chemistry+physics)/3;
		System.out.println("Average marks: " +avg);
		
		if(avg>80)
		{
			System.out.println("Grade A");
		}
			else
			{
				System.out.println("Grade B");
		}
	}
}
}
	

		

