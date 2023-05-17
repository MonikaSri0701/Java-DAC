package com.javaassignment87.main;
import java.util.Scanner;

class PartTimeFaculty extends Faculty {
    private double hour;
    private double rate;

    public PartTimeFaculty(int facultyId, double hour, double rate) 
    { super(facultyId, 0);
        this.hour = hour;
        this.rate = rate;
        calculateSalary();
    }
    private void calculateSalary() {
        setSalary(hour * rate);
    }
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter faculty ID: ");
        setFacultyId(sc.nextInt());
        System.out.print("Enter number of hours: ");
        hour = sc.nextDouble();
        System.out.print("Enter hourly rate: ");
        rate = sc.nextDouble();
        calculateSalary();
    }
   public void display() {
        super.display();
        System.out.println("Number of hours: " + hour);
        System.out.println("Hourly rate: " + rate);
    }
}