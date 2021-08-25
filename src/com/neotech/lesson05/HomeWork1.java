package com.neotech.lesson05;

public class HomeWork1 {
	public static void main(String[] args) {
		
	

	boolean allergie = false;
	boolean peanut = true;
	boolean lactose = true;
	boolean seafood = true;

	if(!allergie)
	{
		if(peanut) {
			System.out.println("Don't eat peanut");
		} if (lactose) {
			System.out.println("Don't eat lactose");
		} if (seafood) {
			System.out.println("Don't eat seafood");
		}
	}else
	{
       System.out.println("You are healthy");
	}
 }
}
