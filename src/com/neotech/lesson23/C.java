package com.neotech.lesson23;

public class C extends B{
	
	String car;
	
	C(){
		System.out.println("default constructor");
	}

	C(String name,String lastname,String school,String car){
	super.name = name;
	super.lastname = lastname;
	super.school = school;
	this.car = car;
	}
	public static void main(String[] args) {
		C str = new C("Burhan","Yildiz","Neotech","Blazer");
		
		
		System.out.println(str.car);
		
		
	}
	
}
