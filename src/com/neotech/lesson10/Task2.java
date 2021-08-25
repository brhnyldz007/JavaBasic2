package com.neotech.lesson10;

public class Task2 {

	public static void main(String[] args) {

//		Print the following pattern:
//        1
//        22
//        333
//        4444
//        55555

		for (int i = 2; i <= 5; i++)
		{
			// in the first loop, when i is 1, the inner loop must execute only once
			// in the second loop, when i is 2, the inner loop must loop two time and print
			// 2 at each time
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
