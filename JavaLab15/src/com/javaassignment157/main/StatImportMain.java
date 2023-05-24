package com.javaassignment157.main;
import static java.lang.System.*;

import java.util.Arrays;

public class StatImportMain {
	public static void main(String[] args) {
	int[] a1 = {1, 2, 3, 4, 5,};
	int[] a2= Arrays.copyOfRange(a1,3,5);
	out.println("Element of a2 are:");
	for(int x : a2)
		out.println(x);		
}		
	}
