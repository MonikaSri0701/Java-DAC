package com.javaassignment151.main;
import java.util.Arrays;

public class ArrayCopyMain {

	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] a2 = new int[10];
		
		a2=a1;
		System.out.println("Copied array a1 into a2:");
		for(int x : a2)
			System.out.println(x);
		
		int[] a3= a1.clone();
		System.out.println("Elements in a3 using clone are:");
		for(int x : a3)
			System.out.println(x);
		
		int[] a4= new int[5];
		System.arraycopy(a3, 0, a4, 0, 5);
		System.out.println("Array of size5 using copyOf:");
		for(int x : a4)
			System.out.println(x);
		
		int[] a5= Arrays.copyOf(a1, 15);
		System.out.println("Array of size15 using copyOf:");
		for(int x : a5)
			System.out.println(x);
		
		int[] a6= Arrays.copyOfRange(a1,3,5);
		System.out.println("Copied 3rd to 5th element of a1 using copyOfRange:");
		for(int x : a6)
			System.out.println(x);
		
		a1[0]= 100;
		a1[1]= 1000;

		
		int[] a7= a1.clone();
		System.out.println("Changed value of original array a1:");
		for(int x : a7)
			System.out.println(x);
		
		
	}

}






















