package com.javaassignment123.main;
import java.util.ArrayList;
import java.util.List;

public class WrapperList {
	public static void main(String[] args) {
	List<Object> ref = new ArrayList<>();
	System.out.println("Inserting the elements of "
			+ "diff wrapper class");
	ref.add(40);
	ref.add('B');
	ref.add(true);
	ref.add("Hello");
	
	for(Object obj: ref)
		System.out.println(obj);
	
	System.out.println("After deleting the "
			+ "elements from the list");

	ref.remove(Integer.valueOf(40));
	for(Object obj: ref)
		System.out.println(obj);
	
	System.out.println(ref.contains('B'));
}
}
