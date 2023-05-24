package com.practiceset.main;

public class JointAccountDemo {
	    public static void main(String[] args) {
	        BankAccount jointAccount = new BankAccount(123456, 1000);

	        Runnable depositRunnable = () -> {
	            for (int i = 0; i < 5; i++) {
	                jointAccount.deposit(200);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };

	        Runnable withdrawRunnable = () -> {
	            for (int i = 0; i < 5; i++) {
	                synchronized (jointAccount) {
	                    if (jointAccount.balance >= 200) {
	                        jointAccount.withdraw(200);
	                    } else {
	                        System.out.println(Thread.currentThread().getName() + " cannot withdraw due to insufficient balance. Current balance is " + jointAccount.balance);
	                    }
	                }
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };

	        Thread t1 = new Thread(depositRunnable, "Thread 1");
	        Thread t2 = new Thread(withdrawRunnable, "Thread 2");
	        Thread t3 = new Thread(withdrawRunnable, "Thread 3");

	        t1.start();
	        t2.start();
	        t3.start();
	    }

}
