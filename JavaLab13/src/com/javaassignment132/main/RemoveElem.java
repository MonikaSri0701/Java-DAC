package com.javaassignment132.main;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElem {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
 		
		lst.add(100);
		lst.add(200); 
		lst.add(300);
		lst.add(400);
		lst.add(500);
	
		System.out.println("List of elements are as follows: ");
		Iterator<Integer> it = lst.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		lst.remove(3);
		System.out.println("List after removing 3rd element: ");
		lst.forEach(System.out::println);
}
	}

