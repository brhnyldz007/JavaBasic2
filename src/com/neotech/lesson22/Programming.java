package com.neotech.lesson22;

public class Programming {
	
	String name;
	Programming(){
		System.out.println("I love programming languages");
	}

	Programming(String name){
		this.name = name;
		System.out.println("I love " + this.name);
	}
	public static void main(String[] args) {
		
		Programming str = new Programming();
		Programming str1 = new Programming("java");
		
	}
}
