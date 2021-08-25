package com.neotech.lesson04;
import java.util.Scanner;

public class TemperatureCheck {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double temperature;
		
		System.out.print("What is the temperature? ");
		temperature = input.nextDouble();
		if(temperature < 32) {
			System.out.println("Water will freeze with temperature " + temperature);
		}else {
			System.out.println("Water will NOT freeze with temperature " + temperature);
		}
		
		
	}

}
