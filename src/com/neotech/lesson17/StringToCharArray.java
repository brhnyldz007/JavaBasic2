package com.neotech.lesson17;

public class StringToCharArray {
	
	public static void main(String[] args) {
		// toCharArray()
		String str = "Today is Thursday and I have Java class";
		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			System.out.print(c + "|");
		}
		System.out.println();
		
		System.out.println("The length of the string is " + str.length());
		System.out.println("The length of the char array is " + charArray.length);
		System.out.println();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		

	   

		// Homework
		// yadoT si yadsruhT dna I evah avaJ ssalc
	}


}
