package com.neotech.lesson22;

public class Shape {
	double radius;

	Shape(double r) {
		radius = r;
	}

}

class Circle extends Shape {

	Circle(double r) {
		super(r);
	}

	// create a method to calculate the area of circle
	void areaOfCircle() {
		System.out.println("The area of the circle is: " + 3.14 * radius * radius);
	}

}
