package com.neotech.lesson12;

public class Task12 {

	public static void main(String[] args) {

		String[][] countries = new String[][] {

				{ "Mexico", "ABD", "Canada" }, { "Guatemala", "Brasil", "Paraguay" }, { "France", "Italy", "Spain" },
				{ "Japan", "China", "India" }, { "Nigeria", "Gana", "Kenya" } };

		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int sum = 0;
		int rows = countries.length;
		int col = countries[1].length;
		sum = (col * rows);
		System.out.println(sum);

		System.out.println();
		System.out.println();

		int[][] numbers = { { 25, 130, 2456 }, { 20, 50, 35, -10 }, { 68, 73, 76 } };

		int largest = numbers[0][0];
		int Slargest = numbers[0][0];
		

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > largest) {
					Slargest = largest;
					largest = numbers[i][j];
				}else if(numbers[i][j]>Slargest) 
				{
					Slargest = numbers[i][j];
					
				}

			}
		}
		System.out.println("The second largest number is: " + Slargest);

	}

}
