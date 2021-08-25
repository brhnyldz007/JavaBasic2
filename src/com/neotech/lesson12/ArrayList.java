package com.neotech.lesson12;

public class ArrayList {
	public static void main(String[] args) {
		 
		
		String[] countries =new String[]{"turkey", "fransa", "russia"};  
		
		for(int i=0;i<countries.length;i++) {
			System.out.println(countries[i].toUpperCase().charAt(0) + countries[i].substring(1,6));
			
			
			
		}

	}

}
