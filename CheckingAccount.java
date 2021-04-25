package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate = 0.0001;
	

	
	public CheckingAccount(double balance) {
		super();
		this.balance = balance;
	}
	 
	
	public double getBalance() {
		return balance;
	}



	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount < 0.0 || amount > balance) {
			return false;
		} else { 
			return true;
		}
	}


	public double futureValue(int years) {
		double principal = 1000.00;
		double factor = 1.01;
		return Math.pow(factor,  3) * principal;
	}
	
	public boolean withdraw1 (double amount) {
		if (amount<balance) {
			System.out.println(balance-amount);
			balance -= amount;
			return true;
			
		} else return false;
	}
	
	public boolean deposit (double amount) {
		if (amount>0) {
			System.out.println(balance+amount);
			balance += amount;
			return true;
		} else return false;
	}
	public class SavingsAccount {
		private double balance;
		private double interestRate = 0.01;
		
		public SavingsAccount(double openingBalance ) {
		}
		public void deposit(double ammount) {
		}
		public double withdraw(double ammount) {
			return ammount;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	}
		
	
	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate + "]" 
	+ "Future Value = " + futureValue(3) + "]";
	}


	
	
}