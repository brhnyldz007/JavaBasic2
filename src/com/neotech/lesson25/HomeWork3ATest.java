package com.neotech.lesson25;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork3ATest {
	
	public static void main(String[] args) {

		
		ArrayList<HomeWork3A> insuranceList = new ArrayList<>();

		insuranceList.add(new CarInsurance("Geico", "Chevrolet")); 
		insuranceList.add(new PetInsurance("Mila", "Dog"));
		insuranceList.add(new HealthInsurance("Lillian"));

		Iterator<HomeWork3A> iterator = insuranceList.iterator();

		while (iterator.hasNext()) {
			HomeWork3A ins = iterator.next();
			ins.getQuote();
			ins.cancelInsurance();

			System.out.println("-----------------------------");
		}

	}

}
