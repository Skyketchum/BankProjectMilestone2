package com.Robert.controllers;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.Robert.views.Views; 
import com.Robert.models.Accounts;
import java.util.Scanner;

public class Controller {

	private static final Logger LOG = LogManager.getLogger(Controller.class);
	

public static void init() {
	
	Views.displayWelcome();
	
	//Views.displayStart(); 
	
	
	
	boolean isLoggedIn = Views.displayLogin();
	
	while(isLoggedIn) {
		
		LOG.trace("Inside top menu loop");
		
		int choice = Views.displayTopMenu();
		
		switch (choice) {
		
		case 1 :
			System.out.println("----------------");
			System.out.println("Enter an amount to deposit: ");
			System.out.println("----------------");
			//double amount = scanner.nextDouble();
			//deposit(amount);
			
			//make a deposit
			
		case 2: //make a withdrawal
			
		case 3 : // check balance
			
		case 4: //make a transfer
			
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
