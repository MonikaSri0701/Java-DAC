package com.javaassignment88.main;

class Factorial extends Processor {
    void process() {
        int fact = 1;
        for (int i = 1; i <= data; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + data + " is " + fact);
    }
}
