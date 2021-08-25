package com.neotech.lesson20;

public class HomeWork3 {
	//different class
	
	String name;
	String address;
	String name1;
	int grade;
	int age;
	//default constructor
	public HomeWork3(){
		name = "N/A";
		address = "N/A";
	}
	
	//overloaded constructor
	private HomeWork3(String newname, String newaddress,String newname1){
		name = newname;
		address = newaddress;
		name1 = newname1;
	}
	
	protected HomeWork3(String newname1, String newaddress1,int newgrade1){
		name = newname1;
		address = newaddress1;
		grade = newgrade1;
	}
	
	// only protected,public and private are permitted
	/*public static HomeWork2(String name2, String address2,int age1,int grade2) {
		
	}*/
	public void displayInfo() {
		//System.out.println("Address of " + name + " is " + address );
		System.out.println("Address of " + name + " " + name1 + " is " +address);
		
	}
	public void displayInfo1() {
		System.out.println(name +" " + address + " " + grade);
	}

}
