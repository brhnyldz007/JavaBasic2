package com.neotech.lesson15;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("======= First Task ========");
		System.out.println();
		String sentence = "I love you";
		
		String name = sentence.replace(" ","");
		
		System.out.println(name);
		System.out.println();
		
		System.out.println("========== Second Task ========");
		System.out.println();
		
		String mila = "idfdksfsfsds122324*&***";
		
		String lillian = mila.replaceAll("[^a-zA-z0-9]","");
		String yildiz = lillian.replaceAll("[^a-zA-Z]","");
		
		int ivonne = yildiz.length();
		
		System.out.println(ivonne);
		System.out.println();
		System.out.println("=========== Third Task ===========");
		
		System.out.print("Mom's first name? ");
		
		String mom = input.next();
		System.out.println(mom);
		int mom1 = mom.length();
		
		System.out.print("Father's first name? ");
		
		String father = input.next();
		System.out.println(father);
		int father1 = father.length();
		
		System.out.println("Boy or Girl? ");
		String gender = input.next();
		
		if(gender.equals("boy"))
		{
			System.out.println("Suggested baby name: " + father.subSequence(0, (father1/2)) + mom.substring(mom1/2,mom1));
		}else if(gender.equals("girl")) 
		{
			System.out.println("Suggested baby name: " +  mom.substring(0, mom1/2) + father.substring(father1/2, father1));
		}
		
		
		
		
	}
}
