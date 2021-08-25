package com.neotech.lesson17;

public class Dog {
	// instance/object variables
	String name;
	int age;
	// static/class variable
	static String breed = "Husky";
	static int paws = 4;
	void displayDogInfo() {
		System.out.println("Name: " + name + " age: " + age + " breed: " + breed + " paws: " + paws);
	}
}
