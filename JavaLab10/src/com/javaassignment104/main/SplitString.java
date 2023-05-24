package com.javaassignment104.main;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

	public class SplitString {

		public static void main(String[] args) {
			 String str = "Monika Srivastava";
			 
	try{
			StringTokenizer st = new StringTokenizer(str);
			  	 
		System.out.println("Individual strings in str are: ");
			 
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
			 }
	catch(NoSuchElementException exc) {
		System.out.println("call the nextToken() method ");
				 }
			 }
	}