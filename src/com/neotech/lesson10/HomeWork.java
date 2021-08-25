package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an interger! ");
		int f = input.nextInt();

		for (int i = 0; i < f; i++) {

			for (int k = 0; k <= i; k++) {
				System.out.print(" ");

			}

			for (int j = f; j > i; j--) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println();

		System.out.println("------------ TASK 2 -------------");
		System.out.println("Please enter an integer! ");
		int m = input.nextInt();

		int l = 1;

		for (int i = 0; i <= m; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= m; i++) {

			for (int j = m-1; j >= i; j--) {
				System.out.print(l + " ");

				l++;
			}
		        l = 1;

			System.out.println();
		}
		System.out.println("==========================");
	}
}
