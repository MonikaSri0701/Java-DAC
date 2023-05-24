package com.javaassignment105.main;
import java.util.Scanner;

public class MarksMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter registration number: ");
	        int regno = scanner.nextInt();
	        System.out.print("Enter marks: ");
	        int marks = scanner.nextInt();
	        MarkProcess process = new MarkProcess(regno, marks);
	        try {
	            process.validation();
	            System.out.println("Result: " + process.result());
	        } catch (IllegalMarks e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	 }
}
