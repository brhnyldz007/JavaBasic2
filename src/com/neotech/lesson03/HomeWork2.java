package com.neotech.lesson03;
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//java program to display the area and perimeter
		double radius = 5.0;
		double pi = 3.0;
		//perimeter
		double perimeter = 2*pi*radius;
		System.out.println("Circle perimeter: " + perimeter);
		//area
		double area = (radius*radius)*pi;
		System.out.println("Circle area: " + area);
		
		System.out.println();
		
		//java program that converts mile to km and km to miles.
		final double MILES_TO_KILOMETER = 1.609344;
		double mile = 1;
		//mile to kilometer
		double convert = mile * MILES_TO_KILOMETER;
		System.out.println("Mile to kilometer: " + convert);
		System.out.println();
		//kilometer to mile
		System.out.print("Please enter km: ");
		double kilometer = input.nextDouble();
		double convert1 = kilometer/MILES_TO_KILOMETER;
		System.out.println("Kilometer to mile: " + convert1);
		
		
	}

}
