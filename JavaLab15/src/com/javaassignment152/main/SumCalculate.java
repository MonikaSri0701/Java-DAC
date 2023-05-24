package com.javaassignment152.main;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public class SumCalculate {
	public static double sum(Collection<? extends Number> numbers) {
		double result = 0.0;		 
	    for (Number num : numbers) result += num.doubleValue();	 
	    return result;
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 4, 6);
		System.out.println("Integers no are = " + integers);
		double sum = sum(integers);
		System.out.println("Sum of integers = " + sum);
		 
		 
		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		System.out.println("Integers no are = " + doubles);
		sum = sum(doubles);
		System.out.println("Sum of doubles = " + sum);
	  }

}



