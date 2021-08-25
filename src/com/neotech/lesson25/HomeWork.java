package com.neotech.lesson25;

import java.util.ArrayList;

public class HomeWork {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Ferrari");
		cars.add("Porche");
		cars.add("McLaren");
		cars.add("Bmw");
		
		for(int i=0;i<cars.size();i++) {
			String car = cars.get(i);
			System.out.println(car);
		}
		System.out.println("+++++++++++++++");
		
		for(String car:cars) {
			System.out.println(car);
		}
	}

}
