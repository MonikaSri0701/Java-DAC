package com.javaassignment93.main;

public class StringLiteral {

	public static void main(String[] args) {
			String s1 = new String("Monika");
			String s2 = "Hello";
			String s3 = new String("Monika");
			String s4 = "Hello";
			
			if(s1==s3)
				System.out.println("Strings are same");
			else
				System.out.println("Strings are not same");
			if(s2==s4)
				System.out.println("Strings are same");
			else
				System.out.println("Strings are not same");
	}
}
