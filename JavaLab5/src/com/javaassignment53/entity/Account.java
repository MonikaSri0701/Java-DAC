package com.javaassignment53.entity;

public class Account {
	private int accno;
    private String custname;
    private double amt;

     public Account(int accno, String custname, double amt) {
        this.accno = accno;
        this.custname = custname;
        this.amt = amt;
    }

	public double getAmt() {
		return amt;
	}
}
