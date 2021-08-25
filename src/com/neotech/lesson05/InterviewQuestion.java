package com.neotech.lesson05;
import java.util.Scanner;

public class InterviewQuestion {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int whether;
		
		System.out.print("What is the temperature? ");
		whether = input.nextInt();
		
		if(whether % 2 == 0) {
			System.out.println("Number is even.");
			
		}else {
			System.out.println("Number is odd.");
		}
		
	}

}
