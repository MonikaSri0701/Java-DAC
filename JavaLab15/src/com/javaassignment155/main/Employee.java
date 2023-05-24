package com.javaassignment155.main;

public class Employee implements Cloneable{
	int empid;
    String empname;
    Department dept;
 
    public Employee(int empid, String empname, Department dept) {
        this.empid = empid;
        this.empname = empname; 
        this.dept = dept;
    }    
    public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone(); 
        emp.dept = (Department) dept.clone();
        return emp;
    }
}


