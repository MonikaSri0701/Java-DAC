package com.Hospital21.main;

public class Patient {
	
	private String patient_name;
	private String patient_disease;
	private double mobile_num;
	
	public Patient(String patient_name, String patient_disease, double mobile_num) {
		super();
		this.patient_name = patient_name;
		this.patient_disease = patient_disease;
		this.mobile_num = mobile_num;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public String getPatient_disease() {
		return patient_disease;
	}
	public double getMobile_num() {
		return mobile_num;
	}
	
}