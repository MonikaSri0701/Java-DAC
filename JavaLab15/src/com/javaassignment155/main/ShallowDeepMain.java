package com.javaassignment155.main;

public class ShallowDeepMain {

	public static void main(String[] args) {
		Department dept1 = new Department(1, "Administration");
		 
        Employee emp1 = new Employee(111, "Monika", dept1); 
        Employee emp2 = null;
 
        try {
            // Creating a clone of emp1 and assigning it to emp2 
            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing the designation of emp1: ");
        System.out.println(emp1.dept.deptname); 
  
        emp2.dept.deptname = "Manufacturing";
 
        System.out.println("After changing designation of emp1:");
        System.out.println(emp1.dept.deptname); 
	}
}
