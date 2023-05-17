package com.javaassignment4.main;
import java.util.Scanner;
public class SwitchQues {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of day of week :- ");
		int day_of_week = sc.nextInt();
			
			switch (day_of_week) {
			case 1:
				System.out.println("Today is monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;			
			case 3:
				System.out.println("Today is Wednesday");
				break;			
			case 4:
				System.out.println("Today is Thursday");
				break;			
			case 5:
				System.out.println("Today is Friday");
				break;			
			case 6:
				System.out.println("Today is Saturday");
				break;				
			case 7:
				System.out.println("Today is Sunday");
				break;			
			default:
				System.out.println("Enter number between 1 to 7....."); }
		}
}
