package com.javaassignment94.main;

public class CheckString {
	public static void main(String[] args) {
	String s1 = "India is my country";
	String s2 = "All Indians are my brothers and sisters ";
		  
	System.out.println("String1 in uppercase: " +s1.toUpperCase());
	System.out.println();
	System.out.println("String1 in lowercase: " +s1.toLowerCase());
	System.out.println();	
	System.out.println("Total Number of characters in S1: " +s1.length());
	System.out.println();
	
	if(s2.contains("India"))
		System.out.println("True");
	else
		System.out.println("False");
		System.out.println("Index no of India: " +s2.indexOf("India"));
		
	String[] arr =s2.split(" ");
	System.out.println("Displaying all individual strings of S2: ");
	for(String s : arr)
		System.out.println(s);	
}
}