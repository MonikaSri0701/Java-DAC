package com.javaassignment54.main;

import java.io.IOException;

import com.javaassignment54.entity.Car;

public class CarMain {
	public static void main(String[] args) throws IOException{

	Car cr1 = new Car();
	Car cr2 = new Car("Hundai");
	
	System.out.println("Default model name is: "+cr1.getModel());
	System.out.println("New model name is:" +cr2.getModel());
	
	}
}
	
