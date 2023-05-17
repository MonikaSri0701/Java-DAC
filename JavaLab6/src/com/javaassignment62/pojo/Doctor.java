package com.javaassignment62.pojo;

public class Doctor {
	private String doctor_name;
	private String doctor_qaulification;
	
	public Doctor(String doctor_name, String doctor_qaulification) {
		this.doctor_name = doctor_name;
		this.doctor_qaulification = doctor_qaulification;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public String getDoctor_qaulification() {
		return doctor_qaulification;
	}
}
