package com.javaassignment84.main;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        Average a = new Average();
        
        int result1 = s.Process(15, 10); 
        float result2 = a.Process(10, 30);
        
        System.out.println("Sum: " + result1);
        System.out.println("Average: " + result2);
    }
}
