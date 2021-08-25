package com.neotech.lesson14;

public class Task {
	
	
	void largerNumber(int a,int b) {
		if(a>b) 
		{
			System.out.println(a  + " is larger than " + b);
		}else {
			System.out.println(b + " is larger than " + a);
		}
		
	}
	
	void evenOrOdd(int a) {
		if(a%2 == 0) {
			System.out.println( a + " is a even number.");
		}else {
			System.out.println( a + " is a odd number.");
		}
	}

	public static void main(String[] args) {
		
		Task a = new Task();
		
		a.largerNumber(5,8);
		
		System.out.println("===============");
		
		a.evenOrOdd(5);
		
		
	}

}



