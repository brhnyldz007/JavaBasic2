package com.neotech.lesson25;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldMap {

	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>(); 
		countries.put("France", "Paris");
		countries.put("Kosova", "Prishtina");
		countries.put("Italy", "Rome");
		countries.put("Turkey", "Ankara");
		System.out.println(countries);

		if(countries.containsKey("France") && countries.containsKey("Turkey")) {
			System.out.println("We have those countries on the list.");
		}else {
			System.out.println("We don't have.");
		}
	
		if(countries.containsValue("Paris") && countries.containsValue("Ankara")) {
			System.out.println("We have those capitals on the list.");
		}else {
			System.out.println("We don't have.");
		}
		Set<String> str1 = countries.keySet();
		for(String m:str1) {
			System.out.println(m);
		}
		
		System.out.println("================");
		
		Collection<String> str2 = countries.values();
		Iterator<String> m2 = str2.iterator();
		while(m2.hasNext()) {
			String m3 = m2.next();
			System.out.println(m3);
		}
		
	}
}