package com.javaassignment53.main;
import java.util.Scanner;
import java.io.IOException;

import com.javaassignment53.entity.Account;

        
public class AccountMain {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String custname =sc.nextLine();
		
		System.out.println("Enter your Account number: ");
		int accno =sc.nextInt();
		
		System.out.println("Enter your Amount: ");
		double amt =sc.nextInt();
		
		Account bk=new Account(accno, custname,amt);
		System.out.println("Current balance is: " + bk.getAmt());
	
}
}
