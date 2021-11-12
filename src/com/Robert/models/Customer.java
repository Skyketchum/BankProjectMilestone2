package com.Robert.models;

public class Customer extends Person {
	
	private String userName;
	private String userPassWord;
	private boolean doesQualifyForLoan;
	private double accountBalance;
	
	//list of transactions
	
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String userName, String userPassWord, boolean doesQualifyForLoan, double accountBalance) {
		super(id, firstName, lastName);
		this.userName = userName;
		this.userPassWord = userPassWord;
		this.doesQualifyForLoan = doesQualifyForLoan;
		this.accountBalance = accountBalance;
		
	}
	

	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}
	public String getUserPassWord() {
		return this.userPassWord;
	}
	
	public void setUserPassWord(String userPassWord) {
		
		this.userPassWord = userPassWord;
		
	}
	
	public boolean getDoesQualifyForLoan() {
		return this.doesQualifyForLoan;
	}

	public void setDoesQualifyForLoan(boolean doesQualifyForLoan) {
		this.doesQualifyForLoan = doesQualifyForLoan;
	}
	
	public double getAccountBalance() {
		return this.accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}