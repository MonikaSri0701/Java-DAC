package com.Hospital24.main;

import com.Hospital21.main.Patient;
import com.Hospital22.main.Docter;
import com.Hospital23.main.Appointment;

public class maindetails {

	public static void main(String[] args) {
		
		Patient pat = new Patient("Monika","abcdefg",8565545);
		Docter doc = new Docter ("Mr Amit","MBBS");
		
		Appointment apo = new Appointment(289686526,03042023,doc,pat);
		
		apo.dis();
	}
}
