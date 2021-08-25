package com.neotech.lesson10;
import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int age =0; age<21;age++) 
		{
		
			if(age ==13) {
				continue;
				
			}
			System.out.println(age);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("Please enter an positive integer!");
		int k = input.nextInt();
		int sum = 0;
		//int count = 0;
		while(k>0) 
		{
			System.out.println("Please enter an positive integer!");
			 k = input.nextInt();
			
			
			if(k<0) {
				System.out.println("that's it!");
			break;	
			 //continue;
			}
			 sum += k;
			System.out.println(sum);
			 k++;
		
		}
	}

}
