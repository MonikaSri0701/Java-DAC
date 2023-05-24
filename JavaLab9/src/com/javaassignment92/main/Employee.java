package com.javaassignment92.main;
import java.util.Objects;

public class Employee {
	private int employeeid;
	  private String name;

	  public Employee(int id, String name) {
	    this.employeeid = id;
	    this.name = name;
	  }
	  public int getEmployeeid() {
		return employeeid; }
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid; }
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }	
	@Override
	public String toString() {
		return employeeid + " " + name;	 }
	@Override
	  public int hashCode() {
	    return Objects.hash(employeeid);
	  }
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.employeeid == e.employeeid;
		}
	  }