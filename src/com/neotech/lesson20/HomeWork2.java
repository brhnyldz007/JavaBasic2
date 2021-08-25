package com.neotech.lesson20;

public class HomeWork2 {
	
	//Same class
	
	String name;
	String address;
	String name1;
	int grade;
	int age;
	//default constructor
	public HomeWork2(){
		name = "N/A";
		address = "N/A";
	}
	
	//overloaded constructor
	private HomeWork2(String newname, String newaddress,String newname1){
		name = newname;
		address = newaddress;
		name1 = newname1;
	}
	
	protected HomeWork2(String newname1, String newaddress1,int newgrade1){
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
	
	public static void main(String[] args) {
		
		HomeWork2 str = new HomeWork2();
		//public
		str.displayInfo();
		HomeWork2 str1 = new HomeWork2("Burhan","California/LaMesa","Yildiz");
		//private
		str1.displayInfo();
		
		HomeWork2 str2 = new HomeWork2("Burhan","California/La Mesa", 90);
		//protected
		//I am sorry for being lazy not to write a meaningful display
		str2.displayInfo1();
		
		
	}

}
