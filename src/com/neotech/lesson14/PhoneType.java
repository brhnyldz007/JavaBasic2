package com.neotech.lesson14;

public class PhoneType {

	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		Phone android = new Phone();
		Phone nokia = new Phone();
		
		iphone.model = "Iphone";
		iphone.year = 2021;
		iphone.color = " red";
		
		iphone.ring();
		iphone.phoneCall();
		
		System.out.println("======================");
		
		android.model = "Samsung";
		android.color = "black";
		android.year = 2020;
		
		android.ring();
		android.phoneCall();
		
		System.out.println("=======================");
		
		nokia.model = "3310";
		nokia.color = "blue";
		nokia.year = 2000;
		
		nokia.ring();
		nokia.phoneCall();
		
	}
}
