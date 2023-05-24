package com.javaassignment121.main;

public class CreateGenMain {

	public static void main(String[] args) {
		Character[] cArray = {'a','e','i','o','u'};
		Integer[] iArray = {1,2,3,4,5};
		Double[] dArray  = {1.2,2.3,4.5,6.7};
		System.out.println("Arrays of Integer are: ");
		CreateGen.show(cArray);
		System.out.println("Arrays of Double are:");
		CreateGen.show(iArray);
		System.out.println("Arrays of character are:");
		CreateGen.show(dArray);
	}	
}
