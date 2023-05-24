package com.javaassignment139.main;
import java.util.HashSet;

public class StudentMain {

	public static void main(String[] args) {
		HashSet<Student> hset = new HashSet<Student>();
		Student s1 = new Student(101, "Monika", 90);
		Student s2 = new Student(101, "Monika", 90);
        Student s3 = new Student(102, "Ankit", 85);
        Student s4 = new Student(103, "Amar", 80);
        Student s5 = new Student(104, "Kunal", 90);
        
        hset.add(s5);
        hset.add(s4);
        hset.add(s3);
        hset.add(s2);
        hset.add(s1);
        
        System.out.println("All students from hset are: ");
        hset.forEach(System.out::println);

	} 
}
