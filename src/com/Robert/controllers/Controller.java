package com.Robert.controllers;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.Robert.views.Views; 
import com.Robert.models.Accounts;
import com.Robert.models.Customer;
import java.util.Scanner;

public class Controller {

	private static final Logger LOG = LogManager.getLogger(Controller.class);
	

public static void init() {
	
	Views.displayWelcome();
	
	//Views.displayStart(); 
	
	
	
	boolean isLoggedIn = Views.displayLogin();
	
	Accounts account = new Accounts();
	
	while(isLoggedIn) {
		
		LOG.trace("Inside top menu loop");
		
		int choice = Views.displayTopMenu();
		
		
		switch (choice) {
		
		case 1 :
			System.out.println("----------------");
			System.out.println("Enter an amount to deposit: ");
			System.out.println("----------------");
			Scanner scanner = new Scanner(System.in);
			account.deposit(scanner.nextDouble());
			
			break;
			//make a deposit
			
		case 2: //make a withdrawal
			System.out.println("----------------");
			System.out.println("Enter an amount to withdraw: ");
			System.out.println("----------------");
			Scanner scanner2 = new Scanner(System.in);
			account.withdrawal(scanner2.nextDouble());
			
			
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
