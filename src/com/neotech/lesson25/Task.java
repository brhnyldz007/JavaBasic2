package com.neotech.lesson25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {
	public static void main(String[] args) {
		Map<String, String> europe = new TreeMap<>(); // order by the key
		europe.put("Germany", "Berlin");
		europe.put("Albania", "Tirana");
		europe.put("Italy", "Rome");
		System.out.println(europe);

		Map<String, String> asia = new LinkedHashMap<>(); // order is preserved
		asia.put("Turkey", "Ankara");
		asia.put("Tajikistan", "Dushanbe");
		asia.put("Uzbekistan", "Tashkent");
		System.out.println(asia);

		Map<String, String> africa = new HashMap<>(); // no order
		africa.put("Egypt", "Cairo");
		africa.put("Moroco", "Rabat");
		africa.put("Ghana", "Accra");
		System.out.println(africa);

		// HW1 iterate europe using the keys --> keySet(); Enhanced for loop
		// HW2 iterate asia using the values --> values(); Iterator

		// This is for next class
		// Storing Maps in a List
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		System.out.println(world);
		System.out.println("==============");
		
		Set<String> m2 = europe.keySet();
		for(String m3:m2) {
			System.out.println(m3);
		}
		System.out.println("==============");
		Collection<String> str2 = europe.values();
		Iterator<String> m3 = str2.iterator();
		
	    while(m3.hasNext()) {
	    	String m4 = m3.next();
	    	System.out.println(m4);
	    }

	}
}


