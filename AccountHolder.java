package com.meritamerica.assignment1;

public class AccountHolder {
	
	//instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    double checkingAccountOpeningBalance;
    double savingsAccountOpeningBalance;
    
    //default constructor
    public AccountHolder() {
    	
    }
    //special constructor
    public AccountHolder(
    String firstName,
    String middleName,
    String lastName,
    String ssn,
    double checkingAccountOpeningBalance,
    double savingsAccountOpeningBalance)
    
    {
    	this.firstName = firstName;
    	this.middleName = middleName;
    	this.lastName = lastName;
    	this.ssn = ssn;
    	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
    	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
    	
    }
  
	// getter/setter methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(double checkingAccount) {
		checkingAccount = new CheckingAccount();
	}
	public double getSavingsAccount() {
		return savingsAccountOpeningBalance;
	}
	public void setSavingsAccount(double savingsAccount) {
		savingsAccountOpeningBalance = savingsAccount;
	}
	  @Override
		public String toString() {
			return "AccountHolder [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
					+ ", ssn=" + ssn + ", checkingAccountOpeningBalance=" + checkingAccountOpeningBalance
					+ ", savingsAccountOpeningBalance=" + savingsAccountOpeningBalance + "]";
		}


}