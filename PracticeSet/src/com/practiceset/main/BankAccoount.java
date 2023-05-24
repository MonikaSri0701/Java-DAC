package com.practiceset.main;
	class BankAccount {
	    private int accno;
	    double balance;

	    public BankAccount(int accno, double balance) {
	        this.accno = accno;
	        this.balance = balance;
	    }

	    public synchronized void deposit(double amount) {
	        System.out.println(Thread.currentThread().getName() + " depositing " + amount + " to account " + accno);
	        balance += amount;
	        System.out.println("New balance after deposit by " + Thread.currentThread().getName() + " is " + balance);
	    }

	    public synchronized void withdraw(double amount) {
	        if (balance - amount >= 0) {
	            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount + " from account " + accno);
	            balance -= amount;
	            System.out.println("New balance after withdrawal by " + Thread.currentThread().getName() + " is " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + " from account " + accno + " due to insufficient balance.");
	        }
	    }
	}

	
