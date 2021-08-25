package com.neotech.lesson13;

public class SecondLargest {
	public static void main(String[] args) {
		int[] numbers = { 32, 61, 16, 89, 74, 25 };
	
		int[] numbers2 = { 1, 110, -1, 90, 16, 89, 74, 89, 25, 100};
		int smallest = numbers[0];
		int largest = 0;
		int largest2 = 0;
		for (int i = 0; i < numbers2.length; i++) {
			int element = numbers2[i];
			// check if it is bigger than the largest
			if (element > largest) {
				largest2 = largest;
				largest = element;
			} else if (element > largest2 && element!=largest) { // check if it is bigger than second largest
				largest2 = element;
			}
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Biggest " + largest);
		System.out.println("Second Largest " + largest2);
	}

}
