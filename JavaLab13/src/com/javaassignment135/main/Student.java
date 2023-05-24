package com.javaassignment135.main;
import java.util.Objects;

public class Student {
	private String name;
	private int regno;
	private int marks;
public Student(String name, int regno, int marks){
	this.name = name;
	this.regno = regno;
	this.marks = marks;
}
public Student() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
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

