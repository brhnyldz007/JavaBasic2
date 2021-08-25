package com.neotech.lesson17;

public class splitClass {

	public static void main(String[] args) {

		String subject = "I? love? java? and i want? to learn more?";

		String[] splittedSub = subject.split(" ");

		System.out.println();
		System.out.println("===================");
		System.out.println();

		for (int i = 0; i < splittedSub.length; i++) {
			System.out.println(splittedSub[i]);

		}
		System.out.println();
		System.out.println("======================");
		System.out.println();

		String testString = "This is testing";

		char[] stringToCharArray = testString.toCharArray();

		for (char output : stringToCharArray) {
			System.out.print(output);
		}
		for(int i=stringToCharArray.length-1;i>=0;i--) {
			
		}
	}
}
