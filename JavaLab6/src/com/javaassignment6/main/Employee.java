package com.javaassignment6.main;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {

	Employee[ ] arr =new Employee[10];
	Scanner scanner =new Scanner(System.in);
	
	for (int i=0; i<arr.length; i++) {
		System.out.println("Enter employee name" +(i+1)+ ":");
		String name =scanner.next();
		System.out.println("Enter your salary" +(i+1)+ ":");
		int salary =scanner.nextInt();	
		System.out.println("Enter your department" +(i+1)+ ":");
		String department =scanner.next();
		
		Employee emp= new Employee();
		arr[i]= emp;	
	}	
	System.out.println("Details of employees are:");
	for (Employee emp : arr) {
	    System.out.println("Employee name: " + emp.getname());
	    System.out.println("Salary: " + emp.getsalary());
	    System.out.println("Department: " + emp.getdepartment());
	}
}
	private String getdepartment() {
		return getdepartment(); }
	private String getsalary() {
		return getsalary(); }
	private String getname() {
		return getname(); }
}
