package com.neotech.lesson23;

public class Computer {
	
	String str = "StringBuffer";
	
	void memory() {
		System.out.println("Computer stores string in " + str);
	}

}
class Apple extends Computer{
	
	void memory() {
		str = "stack";
		System.out.println("Computer stores non-primitive types in " + str);
	}
	
}
class Lenova extends Computer{
	
	void memory() {
		str = "ram";
		System.out.println("Computers 16gb " + str + " works really good!" );
	}
	
}
class HP extends Computer{
	void memory() {
		str = "new";
		System.out.println(str + " type hp works reaaly good!");
	}
	
}
class Dell extends Computer{
	void memory() {
		str="dell";
		System.out.println(str+ " is a good computer brand!");
	}
	
}