package com.inheritancedemo.main;

public class num3 extends num2 {
	private int num3;

	public num3(int num1, int num2, int num3) {
		super(num1, num2);
		this.num3 = num3;
	}
	public int getNum3() {
		return num3;
	}
	public void add2() {
	int add2 = getNum1()+getNum2()+num3;
	System.out.println("addition of num1,num 2 and num3 :" +add2);	
   }
 }

