package com.javaassignment55.main;
import com.javaassignment55.entity.Circle;
public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(7.5, "blue");

		System.out.println("Circle 1:");
		System.out.println("Radius = " + c1.getRadius());
		System.out.println("Area = " + c1.getArea());

		System.out.println("Circle 2:");
		System.out.println("Radius = " + c2.getRadius());
		System.out.println("Area = " + c2.getArea());
	}

}
