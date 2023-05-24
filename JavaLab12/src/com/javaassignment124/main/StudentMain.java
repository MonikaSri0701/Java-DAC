package com.javaassignment124.main;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
			List<Student> studentlist = new ArrayList<>();
			
			Student s1 = new Student("Monika", 101, 90);
	        Student s2 = new Student("Ankit", 102, 80);
	        Student s3 = new Student("Kunal", 103, 85);
	        Student s4 = new Student("Amar", 104, 75);
	        Student s5 = new Student("Amit", 105, 80);
	        
	        if(!studentlist.contains(s1)){
	        	studentlist.add(s1);	 	}
	        if(!studentlist.contains(s2)){
	        	studentlist.add(s2);	 	}
	        if(!studentlist.contains(s3)){
	        	studentlist.add(s3);		}
	        if(!studentlist.contains(s4)){
	        	studentlist.add(s4);		}
	        if(!studentlist.contains(s5)){
	        	studentlist.add(s5);		}
	       
	        System.out.println("Details of all the students are: ");
	        for(Student s: studentlist)
	        	System.out.println(s.toString());
	}
}
