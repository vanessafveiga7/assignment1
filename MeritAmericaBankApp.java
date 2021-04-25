package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder acHolder = new AccountHolder("John", " ", "Doe", "1123456789", 100.0, 10.0);
		System.out.println(acHolder);
		acHolder.getCheckingAccount().deposit(500.00);
		
		acHolder.getSavingsAccount().withdraw(800.00);
	}
	
}