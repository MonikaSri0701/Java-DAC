package com.javaassignment106.main;
import java.util.Scanner;

public class BinaryMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a binary number: ");
	        String binary = scanner.nextLine();
	        int decimal = 0;
	        try {
	            for (int i = 0; i < binary.length(); i++) {
	                char c = binary.charAt(i);
	                if (c != '0' && c != '1') {
	                    throw new InvalidBinary();
	                }
	                decimal = decimal * 2 + (c - '0');
	            }
	            System.out.println("Decimal equivalent: " + decimal);
	        } catch (InvalidBinary e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}

