package com.javaassignment88.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (1 for factorial, "
        		+ "2 for circle area):");
        int choice = sc.nextInt();

        Processor processor;
        if (choice == 1) {
            processor = new Factorial();
        } else if (choice == 2) {
            processor = new Circle();
        } else {
            System.out.println("Your choice is invalid");
            return;
        }

        System.out.println("Enter data:");
        processor.data = sc.nextInt();

        processor.showData();
        processor.process();
    }
}