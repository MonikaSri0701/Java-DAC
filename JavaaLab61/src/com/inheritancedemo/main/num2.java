package com.inheritancedemo.main;

public class num2 extends num1 {
	
	private int num2;

	public num2(int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}
	
	public void add1() {
		int add1 = getNum1()+ num2;
		System.out.println("addition of num1 and num2 : " + add1);
	}
}