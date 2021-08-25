package com.neotech.lesson22;

public class Teacher {
	String firstName, lastName;

	Teacher() {
		System.out.println("Default contructor for Teacher class");
	}

	Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void teaching() {
		System.out.println("Teaching...");
	}

}
