package com.javaassignment153.main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {

public static void main(String[] args) {
	LocalDate currentDate =LocalDate.now();
	System.out.println("Today's date is: " +currentDate);
			
	LocalDate birthDate =LocalDate.of(1995, Month.JUNE, 02);
	Period period = Period.between(birthDate, currentDate);
			
	System.out.println("Period between Birth and Current date is :");
	System.out.println("Years : " +period.getYears());
	System.out.println("Months : " +period.getMonths());
	System.out.println("Days : " +period.getDays());
			
	//String to date
	String dateString = "2023-04-13";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date = LocalDate.parse(dateString, formatter);
	System.out.println("String converted to Date: " + date);
	        
	 //date to String 
	 Date date1 = new Date();
	 SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
	 String strDate = formatter1.format(date1);
	 System.out.println("Date converted to String: " + strDate);		 			
	}
}
