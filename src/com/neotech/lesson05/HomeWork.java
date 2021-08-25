package com.neotech.lesson05;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        //declare and initialized name
		String name = "Burhan";
		String input_name = " ";
		 
		
		//declare and initialized password
		String password = "1234";
		String input_password = " ";
		
		boolean password_out = false;
		int password_attempt = 1;
		
		while (!name.equals(input_name)) {
			System.out.println("Please enter username! ");
			input_name = input.next();
			while (name.equals(input_name) && !password.equals(input_password) && !password_out) {
				if(password_attempt <= 3) {
				System.out.println("Please enter password! ");
				input_password = input.next();
				}else {
					password_out = true;
				}
				password_attempt = password_attempt + 1;
			}
		}
		if(password_out) {
			System.out.println("Account is locked! ");
		}else {
		System.out.println("Hello World! ");
		}
	}

}
