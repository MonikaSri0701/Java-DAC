package com.javaassignment92.main;

public class EmployeeMain {
	public static void main(String[] args) {
	    Employee e1 = new Employee(101, "Monika");
	    System.out.println("e1 details are: ");
	    System.out.println("e1");
	    
	    Employee e2 = new Employee(101, "Kunal");
	    System.out.println("e2 details are: ");
	    System.out.println("e2");
	    
	    if(e1.equals(e2))
	    	 System.out.println("e1 and e2 are same ");
	    else
	    	System.out.println("e1 and e2 are not same ");
	    if(e1.hashCode()==e2.hashCode())
	    	System.out.println("Both the ids are same ");
	    else
	    	System.out.println("Both the ids are not same ");
	    System.out.println();
	    System.out.println("e1's hashcode: " + e1.hashCode());
	    System.out.println("e2's hashcode: " + e2.hashCode());
}
	}