package com.neotech.lesson02;

public class DeclareVariables {
	public static void main(String[] args) {
		
		//Declaring and initializing variables
		byte a = -12;
		short a1 = -32767;
		int a2 = 10000;
		long a3 = 100000000;
		float a4 = 32.3434f;
		double a5 = 1.232332323232;
		boolean a6 = true;
		char a7 = '$';
		
		
		
		//print out the initialized variables
		System.out.println("Byte stores whole numbers from -128 to 127. " + "--->" + " I initialized it " + a);
		System.out.println("Short stores whole numbers from -32,768 to 32,767. " + "--->" + " I initialized it " + a1);
		System.out.println("Int stores whole numbers from -2,147,483,648 to 2,147,483,647. " + "--->" + " I initialized it " + a2);
		System.out.println("Long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. " + "--->" + " I initialized it " + a3);
		System.out.println("Float stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. " + "--->" + " I initialized it " + a4);
		System.out.println("Double stores fractional numbers. Sufficient for storing 15 decimal digits. " + "--->" + " I initialized it " + a5);
		System.out.println("Boolean stores true or false values. " + "--->" + " I initialized it " + a6);
		System.out.println("Char stores a single character/letter or ASCII values. " + "--->" + " I initialized it " + a7);

		
		
	}

}
