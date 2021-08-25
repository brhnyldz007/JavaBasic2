package com.neotech.lesson23;

public class A {
	
	String name;
	String lastname;
	
	A(){
		System.out.println("default constructor");
	}
	A(String newname,String newlastname){
		this.name = newname;
		this.lastname = newlastname;
	}
	
	public static void printF() {
		System.out.println("burhan");
	}

}
