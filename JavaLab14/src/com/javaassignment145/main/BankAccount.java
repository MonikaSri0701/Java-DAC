package com.javaassignment145.main;

public class BankAccount {
	private int balance = 8000;

    public synchronized void withdraw(int amount) {
    	System.out.println("going to withdraw, checking for sufficient balance");
    	try {
    		Thread.sleep(2000);
    		if(balance < amount) {
    			System.out.println("insufficient balance available, waiting for deposit");
    		//	wait();
    		}
    		System.out.println("Sufficient balance available, updating the balance");
    		Thread.sleep(2500);
    		balance =balance- amount;
    		System.out.println("Withdrawl Completed!!!");
    	} catch(InterruptedException e) {
    		e.printStackTrace();	}
    	}
    public synchronized void deposit(int amount) {
    	System.out.println("going to deposit, updating the balance");
    	try {
    		Thread.sleep(2000);
    		balance =balance+ amount;
    		System.out.println("Deposit Completed!!!");
    		notify();
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    	}
    }
