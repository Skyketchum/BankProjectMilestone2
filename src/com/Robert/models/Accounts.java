package com.Robert.models;

public class Accounts {
	
	//private int account_id;
	
	private double accountBalance;
	
    private double currentBalance;
    
    //private String currentUser;
    
    private double withdrawalAmount;
    
    private double depositAmount;
    
  

    
    
    public void withdrawal(int amount) {
    	
    	if(withdrawalAmount <= currentBalance) {
    	
    		withdrawalAmount -= currentBalance  = accountBalance;
    	}
    	
    	System.out.println("has made a withdrawal of: $" + withdrawalAmount );
    }
	
    
 public void deposit(int amount) {
    	
    	currentBalance += depositAmount = accountBalance;
    	
    	System.out.println("has made a deposit of: $" + depositAmount );
    }
	
	
}