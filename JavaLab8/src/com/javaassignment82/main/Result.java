package com.javaassignment82.main;

class Result implements Exam, Classify {
    public boolean Pass(int mark) {
        return mark >= 50;
    }

    public String Division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No Division";
        }
    }
}