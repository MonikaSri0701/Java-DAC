package com.javaassignment62.pojo;

public class Appointment {
	private double appointment_number;
	private double appointment_date;
    private Doctor doc;
    private Patient pat;
	
	public Appointment(double appointment_number, double appointment_date, Doctor doc, Patient pat) {
		super();
		this.appointment_number = appointment_number;
		this.appointment_date = appointment_date;
		this.doc = doc;
		this.pat = pat;
	}

	public double getAppointment_number() {
		return appointment_number;
	}

	public double getAppointment_date() {
		return appointment_date;
	}

	public Doctor getDoc() {
		return doc;
	}

	public Patient getPat() {
		return pat;
	}
	
	public void dis() {
	 System.out.println("name of patiant " + pat.getPatient_name());
	 System.out.println("desease " + pat.getPatient_disease());
	 System.out.println("patiant mobile number" + pat.getMobile_num());
	 System.out.println("doctor name" + doc.getDoctor_name());
	 System.out.println("doctor qualification" + doc.getDoctor_qaulification());
	 System.out.println("Appointment number" + getAppointment_number());
	 System.out.println("Appointment number" + getAppointment_date());
	 
	}
}
