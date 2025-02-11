package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder acHolder = new AccountHolder("John", "James", "Doe", "1123456789", 100.00, 1000.00);
		AccountHolder acHolder1 = new AccountHolder("Jane", "Mary", "Doe", "1124468256", 200.00, 500.00);
		
		// Display the account holder's toString() output
		System.out.println(acHolder.toString());
		acHolder.getCheckingAccount().deposit(500.00);
		acHolder.getSavingsAccount().withdraw(800.00);
		
		// Display the checking account's toString() ouput
		System.out.println(acHolder.getCheckingAccount().toString());
		
		// Display the savings account's toString() output
		System.out.println(acHolder.getSavingsAccount().toString());
		acHolder1.getCheckingAccount().deposit(-500.00);
		acHolder1.getSavingsAccount().withdraw(600.00);
		System.out.println(acHolder1.toString());

	}
	
}