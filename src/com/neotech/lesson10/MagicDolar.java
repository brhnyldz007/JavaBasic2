package com.neotech.lesson10;

public class MagicDolar {

	public static void main(String[] args) {
		// Task1

		// $$$$$
		// $$$$$
		// $$$$$
		// $$$$$

		// for (int i = 1; i <= 4; i++) {
		// for (int j = 1; j <= 5; j++) {
		// System.out.print("$");
		// }
		// System.out.println();
		// }

		// Task (make some changes on task1)
		// $$$$$
		// $   $
		// $   $
		// $$$$$

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
