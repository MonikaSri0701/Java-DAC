package com.javaassignment105.main;

class MarkProcess {
    private int regno;
    private int marks;
    
    public MarkProcess(int regno, int marks) {
        this.regno = regno;
        this.marks = marks;
    }
    
    public void validation() throws IllegalMarks {
        if (marks < 0) {
            throw new IllegalMarks();
        }
    }  
    public String result() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}

