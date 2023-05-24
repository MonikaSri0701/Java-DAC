package com.javaassignment113.main;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		CopyF obj = new CopyF();
		Date d = new Date();
		System.out.println("File copy started at: " +d);
		obj.copydata();
		d = new Date();
		System.out.println("File copy ended at: " +d);
	}

}
