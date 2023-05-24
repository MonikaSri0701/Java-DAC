package com.javaassignment1310.main;

import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		TreeSet<Student> eset = new TreeSet<Student>();
		Student s1 = new Student(101, "Monika", 90);
        Student s2 = new Student(102, "Ankit", 85);
        Student s3 = new Student(103, "Amar", 80);
        Student s4 = new Student(104, "Kunal", 90);
        
        eset.add(s1);
        eset.add(s2);
        eset.add(s3);
        eset.add(s4);
        
        System.out.println("All students from TreeSet are: ");
        eset.forEach(System.out::println);
	}
}
