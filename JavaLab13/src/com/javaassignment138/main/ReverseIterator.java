package com.javaassignment138.main;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
 		
		lst.add(10);
		lst.add(20); 
		lst.add(30);
		lst.add(40);
		lst.add(50);
		
		System.out.println("Oiginal list of elements : ");
		lst.forEach(System.out::println);
		
		System.out.println("Reverse list of elements : ");
		Iterator<Integer> descendingIterator = lst.descendingIterator();
	    while(descendingIterator.hasNext()) {
	    System.out.println(descendingIterator.next());
	}
}
	}
