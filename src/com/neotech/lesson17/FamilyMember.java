package com.neotech.lesson17;

public class FamilyMember {

	String firstName; // instance variable, belongs to the instance/object
	static String lastName; // static/class variable, belongs to the class
	int age; // instance variable, belongs to the instance/object

	// With non-static methods you can only use ALL variables
	void printFullName() {
		System.out.println("Full name is " + firstName + " " + lastName);
	}

	// With static methods you can ONLY use static variables
	static void printFamilyName() {
		// System.out.println("Full name is " + firstName + " " + lastName);
		System.out.println("Family name is " + lastName);
	}


}
