package com.javaassignment56.main;
import com.javaassignment56.entity.MaxValue;
import java.util.Scanner;

public class MaxMain {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter three integers:");
		    int num1 = scanner.nextInt();
		    int num2 = scanner.nextInt();
		    int num3 = scanner.nextInt();
		    int max = MaxValue.getMaxValue(num1, num2, num3);
		    System.out.println("The maximum value is: " + max);
		  }
		}
