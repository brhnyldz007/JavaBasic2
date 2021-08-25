package com.neotech.lesson14;

public class Phone {

	String model;
	String color;
	int year;
	
	public void ring() {
		System.out.println("It has 40 different ring tones.");
	}
	
	public void phoneCall() 
	{
		System.out.println("The phone " + model + " and the color is " + color + "");
	}
}
