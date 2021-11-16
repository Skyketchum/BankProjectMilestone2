package com.Robert.models;

public class Accounts {
	
	private int account_id;
	
	private double accountBalance;
	
    private double currentBalance;
    
    //private String currentUser;
    
    private double withdrawalAmount;
    
    private double depositAmount;
    
  
 public Accounts() {
	 
 }
 
 
    
    
  
  public int getAccountId() {
	return account_id;
  }


   public void setAccountId(int account_id) {
	this.account_id = account_id;
  }

   
   public double getAccountBalance() {
	   return accountBalance;
   }
   
   public void setAccountBalance(double accountBalance) {
	   this.accountBalance = accountBalance;
	   
   }
   
   public double getCurrentBalance() {
	   return currentBalance;
   }
   
   public void setCurrentBalance(double currentBalance) {
	   this.currentBalance = currentBalance;
	   
   }
   
   public double getWithdrawalAmount() {
	   return withdrawalAmount;
   }
   
   public void setWithdrawalAmount(double withdrawalAmount) {
	   this.withdrawalAmount = withdrawalAmount;
	   
   }
   
   public double getDepositAmount() {
	   return depositAmount;
   }
   
   public void setDepositAmount(double depositAmount) {
	   this.depositAmount = depositAmount;
	   
   }
   
   
   public void withdrawal(double amount) {
	
	if(withdrawalAmount <= currentBalance) {
	
		withdrawalAmount -= currentBalance  = accountBalance;
	}
	
	System.out.println("has made a withdrawal of: $" + withdrawalAmount );
   }


    public void deposit(double amount) {
	
	currentBalance += depositAmount = accountBalance;
	
	System.out.println("has made a deposit of: $" + depositAmount );
   }


	
	
   }