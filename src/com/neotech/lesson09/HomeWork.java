package com.neotech.lesson09;
import java.util.Scanner;

public class HomeWork {

	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 for(int i =1; i <= 50; i++) {
			 if(i%3 == 0) {
				 continue;
			 }
			 System.out.println(i);
		 }
		 
		 System.out.println("-------TASK 2---------");
		 
		 //2nd task 
		 
		System.out.println("Please apply to new credit card! ");
		for(int attempt = 1; attempt<=10; attempt++) {
			
			String answer = input.next();
			if(answer.equals("yes")) {
				System.out.println("Thank you for application! ");
				break;
			}else {
				System.out.println("Please apply to new credir card! ");
			}
		}
		
		
		 
		
	}
}
