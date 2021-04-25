package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance;
	private double interestRate = 0.01;
	
	public SavingsAccount(double openingBalance) {
		balance = openingBalance;
	}
	public void deposit(double ammount) {
	}
	public double withdraw(double ammount) {
	}
		public double futureValue(int years) {
			double principal = 1000.00;
			double factor = 1.01;
			return Math.pow(factor,  3) * principal;
		}
	}
	
