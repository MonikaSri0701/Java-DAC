package com.copyarraydemo.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class wildCard
{    
	static double sum(Collection<? extends Number> numbers)
	{
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	}

}
public class WlidCardGenericMain 
{

	public static void main(String[] args)
	{   
		
		List<Integer> integers = Arrays.asList(2, 4, 6);
		double sum = wildCard.sum(integers);
		System.out.println("Sum of integers = " + sum);
		 
		 
		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		sum = wildCard.sum(doubles);
		System.out.println("Sum of floats = " + sum);
	}

}
