package com.neotech.lesson25;

public abstract class HomeWork3A {
	// Create a class Insurance that will have an attribute as insuranceName
	// and unimplemented behavior as getQuote and cancelInsurance.
	// Create 3 subclasses Car, Pet, Health.
	// Car class has its own attribute as carModel
	// and Class Pet has petType attribute.
	// Create 3 objects of the sub classes and store them in ArrayList.
	// Using for loop/advanced for loop/ iterator access all methods of the class.

	String insuranceName;

	
	HomeWork3A(String insuranceName) {
			this.insuranceName = insuranceName;
		}

	abstract void getQuote();

	abstract void cancelInsurance();
}

class CarInsurance extends HomeWork3A {
	String carModel;

	CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	void getQuote() {
		System.out.println("No Need Argue");
	}

	@Override
	void cancelInsurance() {
		System.out.println("Mila Lillian Yildiz");
	}

}

class PetInsurance extends HomeWork3A {
	String petType;

	PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	void getQuote() {
		System.out.println("Electric blue eyes");
	}

	@Override
	void cancelInsurance() {
		System.out.println("Ordinary day!");
	}

}

class HealthInsurance extends HomeWork3A{

	HealthInsurance(String insuranceName) {
		super(insuranceName);
	}

	@Override
	void getQuote() {
		System.out.println("The Stairway to heaven");
	}

	@Override
	void cancelInsurance() {
		System.out.println("The Wall");
	}

}
