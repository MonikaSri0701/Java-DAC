package com.javaassignment1311.main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class MapMain {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		
		hmap.put(1234, "abcd");
		hmap.put(5678, "efgh");
		hmap.put(4321, "ijkl");
		hmap.put(8765, "mnop");
		
		System.out.println("All enteries from hmap are: ");
		Set<Entry<Integer, String>> eset = hmap.entrySet();
		
		for(Entry<Integer, String> e : eset)
			System.out.println(e.getKey() +" : " + e.getValue());
		
	}
}
