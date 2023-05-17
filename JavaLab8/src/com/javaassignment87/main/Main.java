package com.javaassignment87.main;

public class Main {
	public static void main(String[] args) {
	FullTimeFaculty ftf1 = new FullTimeFaculty(101, 50000, 10000);
	PartTimeFaculty ptf1 = new PartTimeFaculty(201, 20, 1000);

		ftf1.acceptInput();

		 System.out.println("Full-time faculty details:");
		 ftf1.display();

		  ptf1.acceptInput();

		 System.out.println("Part-time faculty details:");
		  ptf1.display();
		    }
}
