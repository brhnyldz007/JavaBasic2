package com.neotech.lesson04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What time is it? ");
		double hour = input.nextDouble();
		if (hour < 12) {
			System.out.println("Good morning!");
		} else if (hour >= 12.00 && hour < 15.00) {
			System.out.println("Good afternoon!");
		} else if (hour >= 15.00) {
			System.out.println("Good evening!");
		} else {
			System.out.println("Have a good day!");
		}

	}

}
