package com.javaassignment55.entity;

public class Circle {
		  private double radius;
		  private String color;

		  public Circle() {
		    this.radius = 4.0;
		    this.color = "red";
		  }
		  public Circle(double radius, String color) {
		    this.radius = radius;
		    this.color = color;
		  }
		  public double getRadius() {
		    return this.radius;
		  }
		  public double getArea() {
		    return Math.PI * Math.pow(this.radius, 2);
		  }
}

