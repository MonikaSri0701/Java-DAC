package com.javaassignment87.main;

class Faculty {
    private int facultyId;
    private double salary;

    public Faculty(int facultyId, double salary) {
        this.setFacultyId(facultyId);
        this.setSalary(salary);
    }
    public int getFacultyId() {
        return facultyId;
    }
    public double getSalary() {
        return salary;
    }
    public void display() {
        System.out.println("Faculty ID: " + getFacultyId());
        System.out.println("Salary: " + getSalary());
    }
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
