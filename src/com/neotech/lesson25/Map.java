package com.neotech.lesson25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map {
	public static void main(String[] args) {

		HashMap<String, Integer> models = new LinkedHashMap<String,Integer>();

		models.put("BMW", 2);
		models.put("Mercedes", 3);
		models.put("Audi", 3);
		models.put("Ferrari", 1);

		System.out.println("We have " + models.size() + " entries.");
		models.replace("Audi", 5);

		System.out.println(models);

		models.put("Chevrolet", 6);
		System.out.println(models);
		
		System.out.println("hey " + models.get("Ferrari"));
	    
	    models.remove("Mercedes");
	    System.out.println(models);
	    
	    
	    if(models.containsKey("Honda")) {
	    	System.out.println("We have Honda model car in our map.");
	    }else {
	    	System.out.println("We dont have that car.");
	    }
	    
	    Set<String> allKeys  = models.keySet();
	    System.out.println("All the models are " + allKeys);
     
	}

}
