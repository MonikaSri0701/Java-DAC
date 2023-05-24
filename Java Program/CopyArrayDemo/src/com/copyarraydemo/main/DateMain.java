package com.copyarraydemo.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateMain 
{

	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("enter the  starting date in format yyyy-mm-dd:");
		String str =sc.next();
		
		
		
		System.out.println("enter the  ending date in format yyyy-mm-dd:");
		String str1 =sc.next();
		
		
		 
		//Period pr = Period.between("2022-01-01", "2022-02-01");
		
		LocalDate dateBefore = LocalDate.parse(str);
	    LocalDate dateAfter = LocalDate.parse(str1);
		long daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
		
	    System.out.println("The number of days between dates: " + daysDiff);
		
		//System.out.println("number of days:-"+ pr.getDays());
		

	}

}
