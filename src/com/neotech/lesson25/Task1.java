package com.neotech.lesson25;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). - If any city
		 * name is more than 7 characters remove that city .
		 * 
		 * 
		 */
		
		String[] cities = {"Paris", "Ankara","London","Garfield"};
		
		
		Map<String, Integer> map = new TreeMap<>();
		
		for(String str : cities)
		{
			map.put(str, str.length());
		}
		
		
		System.out.println(map);
		
		//1st way
		//we save the set first 
		//then we create an iterator of the set
	//	Set<Entry<String,Integer>> set = map.entrySet();
	//	Iterator<Entry<String, Integer>> it = set.iterator();
		
		//2nd way
		//from map get the set of entries and create an iterator out of it.
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String, Integer> en = it.next();	
			
			if(en.getValue() > 7 )
			{
				it.remove();
			}
			
		}
		
		System.out.println(map);
		
		//try to solve this using enhanced for and debug, step by step

	}

}
