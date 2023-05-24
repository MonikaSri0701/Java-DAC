package com.javaassignment122.main;

import java.util.Arrays;

public class GenericExchange {
	
	public static <T> void show(T[] arr, int a, int b) {
		T temp = arr[a];
		arr[a]= arr[b];
		arr[b]=temp;
	}
	public static void main(String[] args) {
		Integer arr[] = {1, 3, 4, 6, 8};
		System.out.println("Original element position:");
		System.out.println(Arrays.toString(arr));
		System.out.println("New element position:");
		show(arr,0,3);
		System.out.println(Arrays.toString(arr));
	}
}
