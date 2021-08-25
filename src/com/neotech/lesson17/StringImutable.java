package com.neotech.lesson17;

public class StringImutable {

	public static void main(String[] args) {
		// String are immutable - not changeable!!!

		String str = "Hello";
		String aps = str.concat(" World");
		System.out.println(aps);
		
		str.toUpperCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
	}
}
