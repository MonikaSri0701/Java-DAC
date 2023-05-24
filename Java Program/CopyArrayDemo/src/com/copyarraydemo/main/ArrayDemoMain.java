package com.copyarraydemo.main;

import java.util.Arrays;

public class ArrayDemoMain
{

	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		int arr2[];
		
		arr2 = arr1;
		System.out.println("second array is:-");
        for(int i :arr2)
        {	
        	System.out.println(i);
        }
		
		arr2 = arr1.clone();
		System.out.println("second array is with clone:-");
		for(int i :arr2) 
		{
			
		
			System.out.println(i);
		}
		//arr2 = new int[5];
		
		arr2 = Arrays.copyOf(arr1, 5);
		System.out.println("second array is with copyof method 1st 5 element:-");
		for(int i :arr2)
		{
			System.out.println(i);
		}
		
		arr2 = Arrays.copyOf(arr1, 15);
		System.out.println("second array is with copyof method 15 element:-");
		for(int i :arr2)
		{
			System.out.println(i);
		}
		
		arr2 = Arrays.copyOfRange(arr1, 3,6);
		System.out.println("second array is with copyofrange method:-");
		for(int i :arr2)
		{
			System.out.println(i);
		}
		
		
	}

}
