package com.neotech.lesson05;

public class HomeWork2 {
	public static void main(String[] args) {
		
		
		double hour = 11.00;
		
		if(hour<12.00) {
			System.out.println("Good morning!");
		}else if(hour>= 12.00 && hour < 15.00) {
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good evening!");
		}
	}

}
