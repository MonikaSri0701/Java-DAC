package com.javaassignment134.main;
import java.util.ArrayList;
import java.util.List;

public class ExtractData {

	public static void main(String[] args) {
		List<String> name = new ArrayList<> ();
		
		name.add("Monika");
		name.add("Atul");
		name.add("Ankit");
		name.add("Jai");
		name.add("Amar");
		
		System.out.println("The name list contains : " +name);

		List<String> extract= name.subList(0,4);
		System.out.println("After Extracting the Names are : " 
					+extract);
	}
}
