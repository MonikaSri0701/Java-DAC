package com.javaassignment139.main;

import java.util.Objects;

public class Student {
		private int regno;
		private String name;
		private int marks;
	public Student(int regno, String name, int marks){
		this.regno = regno;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
	return "Reg No: " + regno + ", Name: " + name + ", Marks: " + marks;		
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, regno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && regno == other.regno;
	}	
}
