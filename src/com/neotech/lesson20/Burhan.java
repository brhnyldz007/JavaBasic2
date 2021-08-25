package com.neotech.lesson20;

public class Burhan {
	
	String name;
	String address;
	//default constructor
	Burhan(){
		name = "N/A";
		address = "N/A";
	}
	
	//overloaded constructor
	Burhan(String newname, String newaddress){
		name = newname;
		address = newaddress;
	}
	public void displayInfo() {
		System.out.println("Address of " + name + " is " + address );
	}

}
