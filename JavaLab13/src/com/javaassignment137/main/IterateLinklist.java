package com.javaassignment137.main;
import java.util.Iterator;
import java.util.LinkedList;
public class IterateLinklist {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		 		
		lst.add(20);
		lst.add(30); 
		lst.add(40);
		lst.add(50);
		lst.add(60);
		 	
	System.out.println("Iterating through array elements : ");
	Iterator<Integer> it = lst.iterator();
		 		
	while(it.hasNext()) {
	System.out.println(it.next());
		}	
	} 	
}

