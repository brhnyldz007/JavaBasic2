package com.neotech.lesson23;

public class CredirCardTest {
	public static void main(String[] args) {
		// Create a class CreditCard and define variable balance and interest.
		// Create an instance method that will calculate interest based on the given
		// balance.
		// Create 2 subclasses: Visa and AX. In AX class override method calculate
		// interest.
		// Call the method by creating an object of each of the three classes.

		CreditCard cc1 = new CreditCard(32000);
		cc1.calculateInterest();
		
		CreditCard cc2 = new Visa(42000);
		cc2.calculateInterest();
		
		CreditCard cc3 = new AX(42000);
		cc3.calculateInterest();
		
		System.out.println("------------");
		CreditCard[] cc = new CreditCard[3];
		cc[0] = new CreditCard(1000);
		cc[1] = new Visa(3000);
		cc[2] = new AX(5000);
		
		for (CreditCard card : cc) {
			card.calculateInterest();
		}
		
	}

}
