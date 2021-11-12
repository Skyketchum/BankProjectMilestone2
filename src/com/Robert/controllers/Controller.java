package com.Robert.controllers;


import com.Robert.views.Views;
import com.Robert.models.Accounts;
import java.util.Scanner;

public class Controller {


public static void init() {
	
	Views.displayWelcome();
	
	//Views.displayStart();
	
	
	
	boolean isLoggedIn = Views.displayLogin();
	
	while(isLoggedIn) {
		
		int choice = Views.displayTopMenu();
		
		switch (choice) {
		
		case 1 :
			System.out.println("----------------");
			System.out.println("Enter an amount to deposit: ");
			System.out.println("----------------");
			//int amount = scanner.nextInt();
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
	}
	
	Views.displayGoodbye();
	
	
}
}
