package com.javaassignment87.main;
import java.util.Scanner;

class FullTimeFaculty extends Faculty {
    private double basic;
    private double allowance;

    public FullTimeFaculty(int facultyId, double basic, 
    		double allowance) {
        super(facultyId, 0);
        this.basic = basic;
        this.allowance = allowance;
        calculateSalary();
    }
    private void calculateSalary() {
        setSalary(basic + allowance); }
    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter faculty ID: ");
        setFacultyId(sc.nextInt());
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();
        System.out.print("Enter allowance: ");
        allowance = sc.nextDouble();
        calculateSalary();
    }
    public void display() {
        super.display();
        System.out.println("Basic salary: " + basic);
        System.out.println("Allowance: " + allowance);
    }
}