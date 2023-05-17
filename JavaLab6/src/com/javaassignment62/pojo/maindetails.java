package com.javaassignment62.pojo;

public class maindetails {

	public static void main(String[] args) {
		
		Patient pat = new Patient("Monika","yusdgyusg",8565545);
		Doctor doc = new Doctor("Mr Amit","MBBS");
		
		Appointment apo = new Appointment(289686526,03042023,doc,pat);
		
		apo.dis();
	}
}


