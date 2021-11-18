package com.Robert.controllers;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.Robert.views.Views; 
import com.Robert.models.Accounts;
import com.Robert.models.Customer;
import com.Robert.daos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	private static final Logger LOG = LogManager.getLogger(Controller.class);
	
	private double amount;

public static void init() {
	
	Views.displayWelcome();
	
	//Views.displayStart(); 
	
	
	
	boolean isLoggedIn = Views.displayLogin();
	
	Accounts account = new Accounts();
	
	
	//create list of accounts
	ArrayList<Accounts> accounts = new ArrayList<>();
	
	
	AccountsDAOIMPL accDAO = new AccountsDAOIMPL();
	
	accounts = accDAO.getAllAccountsofCustomer(1);
	
	account = accDAO.getAccount(1);
	
	
	
	
	while(isLoggedIn) {
		
		LOG.trace("Inside top menu loop");
		
		int choice = Views.displayTopMenu();
		
		
		switch (choice) {
		
		case 1 :
			System.out.println("----------------");
			System.out.println("Enter an amount to deposit: ");
			System.out.println("----------------");
			Scanner scanner = new Scanner(System.in);
			double amount = scanner.nextDouble();
			account.setCurrentBalance(account.getCurrentBalance() +amount);
			System.out.println("You have made a deposit of: $" +amount +(" this is your new balance: $"+account.getCurrentBalance()) );
			
			break;
			//make a deposit
			
		case 2: //make a withdrawal
			System.out.println("----------------");
			System.out.println("Enter an amount to withdraw: ");
			System.out.println("----------------");
			Scanner scanner2 = new Scanner(System.in);
			double amount2 = scanner2.nextDouble();
			if(amount2 <= account.getCurrentBalance()) {
				account.setCurrentBalance(account.getCurrentBalance() -amount2);
			}
			System.out.println("You have made a withdrawal of: $" +amount2 +(" this is your new balance: $"+account.getCurrentBalance()) );
			
			
			
			break;
			
		case 3 : // check balance
			System.out.println("----------------");
			System.out.println("This is your current balance: " + account.getCurrentBalance());
			System.out.println("----------------");
			
		break;
			
		case 4: 
			//make a transfer
			break;
			
		case 5: //log out	
			isLoggedIn = false;
			break;
			
			
			default: System.out.println("Bad Input!");
		}
		
		LOG.debug("is user still logged in: " + isLoggedIn);
		LOG.trace("exit top menu loop");
	}
	
	Views.displayGoodbye();
	
	LOG.trace("Ended init()");
	
	
}


}
