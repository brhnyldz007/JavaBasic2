package com.neotech.lesson25;
import java.util.*;

public class HomeWork1A {
	public static void main(String[] args) {
		// Create an arrayList of drinks. If any drink has letter āaā or āeā replace it
		// with water.

		List<String> drinkList = new ArrayList<>();
		drinkList.add("water");
		drinkList.add("milk");
		drinkList.add("tea");
		drinkList.add("salgam");
		drinkList.add("coke");
		drinkList.add("beer");

		System.out.println(drinkList);

		for (String drink : drinkList) {

			if (drink.contains("e") || drink.contains("a")) {
				// This does NOT replace the ArrayList
				drink = "water";
			}

			System.out.print(drink + " - ");

		}

		System.out.println();
		System.out.println(drinkList);

		System.out.println("===================================");

		for (int i = 0; i < drinkList.size(); i++) {

			if (drinkList.get(i).contains("e") || drinkList.get(i).contains("a")) {
				// You are updating an element at a specific index/position
				drinkList.set(i, "water");
			}

		}

		System.out.println(drinkList);

	}


}
