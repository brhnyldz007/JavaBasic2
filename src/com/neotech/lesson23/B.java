package com.neotech.lesson23;

public class B  extends A{
	String school;
	
	B(){
		System.out.println("default constructor");
	}
	B(String name,String lastname,String school){
		super.name=name;
		super.lastname=lastname;
		this.school = school;
	}
	public static void main(String[] args) {
		B str1 = new B();
		str1.printF();
	
	}
	

}
