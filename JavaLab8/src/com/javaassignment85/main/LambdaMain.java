package com.javaassignment85.main;

public class LambdaMain {
public static void main(String[] args) {
        
        MathOp ref =(int a, int b) -> {
        	return(a+b);
        };
        
        MathOp ref1 =(int a, int b) -> {
        	return(a-b);
        };
        
        MathOp ref2 =(int a, int b) -> {
        	return(a/b);
        };
        
        System.out.println("Result of addition: " 
        		+ ref.calculate(20, 45));
        System.out.println("Result of subtraction: " 
        		+ ref1.calculate(45, 20));
        System.out.println("Result of division: " 
        		+ ref2.calculate(20, 5));
    }
}
