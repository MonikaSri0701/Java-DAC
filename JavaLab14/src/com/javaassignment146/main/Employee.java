package com.javaassignment146.main;
import java.io.Serializable;

public class Employee implements Serializable {
	private int empno;
	private String empname;
	public Employee(int empno,String empname) {
		this.empno = empno;
		this.empname = empname;
	}
	public Employee() {
		empno= 34;			}
	public int getEmpno() {
		return empno;			}
	public void setEmpno(int empno) {
		this.empno = empno;			}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
