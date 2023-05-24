package com.javaassignment136.main;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		System.out.println("All elements from list are:");
		lst.forEach(System.out::println);
		
		int element = 100;
	    int position = 2;
	    lst.add(position, element);
		
		System.out.println("All elements from list after "
				+ "inserting the specified elements:");
		lst.forEach(System.out::println);
	}
}
