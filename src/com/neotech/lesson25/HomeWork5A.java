package com.neotech.lesson25;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork5A {

	public static void main(String[] args) {
		/*
		 * Create a Set collection in which you need to add names of the countries. 
		 * In this set we want all objects to be sorted in alphabetical order. 
		 * Using 2 different ways retrieve all elements from set.
		 * 
		 */
		
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Italy");
		countries.add("Russia");
		countries.add("France");
		countries.add("Poland");
		
		System.out.println(countries);
		
		

		
		for(int i = 0; i< countries.size();i++)
		{

		}
		
		

		for (String country: countries)
		{
			System.out.println(country);
		}
		
		System.out.println("----------------------------------");
		

		Iterator<String> it = countries.iterator();
		
		
		while(it.hasNext())
		{

			String country = it.next();
			System.out.println(country);
			

			
		}
		
		
		

	}

}
