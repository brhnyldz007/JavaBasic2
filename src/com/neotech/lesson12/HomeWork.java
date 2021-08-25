package com.neotech.lesson12;
import java.util.Scanner;

public class HomeWork {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//cars array
		String[] cars =new String[]{"mercedes", "ferrari", "toyota","kia","chevrolet", "porche"};  
		
		for(int i=0;i < cars.length;i++) {
		System.out.println(cars[i].toUpperCase());
		}
		
		System.out.println();
		System.out.println("---second way-----");
		System.out.println();
		
		String[] car ;
		car = new String[6];
		
		car[0] = "mercedes";
		car[1] = "ferrari";
		car[2] = "toyota";
		car[3] = "kia";
		car[4] = "chevrolet";
		car[5] = "porche";
		
		for(int i=0;i < car.length;i++) {
		System.out.println(car[i].toUpperCase());
		}
		
		System.out.println("====================== task 2 =============");
		
		System.out.println("Please enter an integer! ");
		int length = input.nextInt();
		
		int[] nums = new int[length];
		
		System.out.println("Please enter numbers! ");
		
		
		int sum = 0;
		
		for(int i = 0; i < length;i++) {
			
			nums[i] =input.nextInt();
		}
	
		for(int i= 0; i<nums.length;i++) {
			 
			sum += nums[i];
		}
		System.out.println("Sum is : " +  sum);
		
		System.out.println();
		System.out.println("========= task 3 ===============");
		
		String[] countries =new String[] {"Turkey","Italy","France","Usa"};
		String[] capitals =new String[] {"Ankara","Rome","Paris","Washington"};
		
		int size = countries.length;
		
		for(int i = 0; i<size;i++) 
		{
			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
		}

	}

}
