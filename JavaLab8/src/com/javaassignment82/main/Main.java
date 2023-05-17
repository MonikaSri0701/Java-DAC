package com.javaassignment82.main;

public class Main {
    public static void main(String[] args) {
        Result result = new Result();
        int mark = 65;
        int average = 70;
        boolean pass = result.Pass(mark);
        String division = result.Division(average);
        System.out.println("Pass: " + pass);
        System.out.println("Division: " + division);
    }
}