package com.javaassignment135.main;
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<Student>();
        ArrayList<Student> list2 = new ArrayList<Student>();
		
		Student s1 = new Student("Monika", 101, 90);
        Student s2 = new Student("Ankit", 102, 80);
        Student s3 = new Student("Ankit", 102, 80);
        Student s4 = new Student("Monika", 101, 90);
        
        System.out.println("List1 objects are: ");
        list1.add(s1);
        list1.add(s2);
        list1.forEach(System.out::println);
        
        System.out.println("List2 objects are: ");
        list2.add(s3);
        list2.add(s4);
        list2.forEach(System.out::println);
        
        if(list1.containsAll(list2) && list2.containsAll(list1))
        System.out.println("Both list are same");
        else
        	System.out.println("Both list are different");        
	}
}
