package com.neotech.lesson23;

public class CreditCard {

	double balance, interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}

	public void calculateInterest() {
		interest = 25;
		System.out.println("The interest rate is " + interest + "%");
	}
}

class Visa extends CreditCard {
	public Visa(double balance) {
		super(balance);
	}

	@Override
	public void calculateInterest() {
		if (balance > 10000) {
			interest = 10;
		} else {
			interest = 20;
		}
		System.out.println("The interest rate is " + interest + "%");
	}
}

class AX extends CreditCard {
	public AX(double balance) {
		super(balance);
	}

	@Override
	public void calculateInterest() {
		if (balance > 4000) {
			interest = 8;
		} else {
			interest = 10;
		}
		System.out.println("The interest rate is " + interest + "%");
	}
}
