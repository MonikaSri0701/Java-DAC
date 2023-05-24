package com.javaassignment145.main;

public class JointAccountDemo {
    public static void main(String[] args) {
    	BankAccount acct = new BankAccount();
    	Thread t1 = new Thread(() -> acct.withdraw(14000));
    	Thread t3 = new Thread(() -> acct.withdraw(10000));

    	Thread t2 = new Thread(() -> acct.deposit(30000));
    	
    	
    	t1.start();
    	System.out.println("Amount withdrawn by first person");

    	t3.start();
    	System.out.println("Amount withdrawn by second person");

    	try {
    		Thread.sleep(2500);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    	t2.start(); 	
    }       
}


