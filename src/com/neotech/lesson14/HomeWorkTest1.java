package com.neotech.lesson14;
import java.util.Scanner;

public class HomeWorkTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your first name!");
		String fName = scan.next();

		System.out.println("Please enter your last name!");
		String lName = scan.next();

		System.out.println("Please enter your email type!");
		String emailType = scan.next();

		HomeWork1 hw = new HomeWork1();
		String fullEmail = hw.createEmail(fName, lName, emailType);
		System.out.println("The email is " + fullEmail);

	}
}
