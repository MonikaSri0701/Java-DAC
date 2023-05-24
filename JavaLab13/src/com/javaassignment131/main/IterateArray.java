package com.javaassignment131.main;
import java.util.Iterator;
import java.util.ArrayList;

public class IterateArray {

	public static void main(String[] args) {
			ArrayList<Integer> lst = new ArrayList<Integer>();
 		
			lst.add(100);
			lst.add(200); 
			lst.add(300);
			lst.add(400);
			lst.add(500);
 		
			System.out.println("ArrayList elements are as follows : ");
			lst.forEach(System.out::println);
 	
			System.out.println("Itrating through array elements : ");
			Iterator<Integer> it = lst.iterator();
 		
			while(it.hasNext()) {
 			System.out.println(it.next());
 		}	
 	} 	
}
