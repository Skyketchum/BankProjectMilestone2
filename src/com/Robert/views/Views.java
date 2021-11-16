package com.Robert.views;

import java.util.Scanner;
import com.Robert.models.*;


public class Views {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static void displayWelcome() {
		
		System.out.println("==============================" + " \n Welcome To Davis and Davis Banking Application \n \n");
	}
	
	public static int displayStart() {
		System.out.println("\n"
				+ "1) Create an Account: \n"
				+ "2) Login to Existing Account \n");
		
		 
		
		return Integer.parseInt(scanner.nextLine());
	}
	
public static boolean displayLogin() {
	
	System.out.println("Username: ");
	
	 String username = scanner.nextLine();
	
	//if(username.equals(customer1.getUserName()){
	//	System.out.println("username exists now enter password");
		
		//System.out.println("Password: ");
		//scanner.nextLine();
		
	//}
        
	
	System.out.println("Password: ");
	scanner.nextLine();
	System.out.println("Welcome back, " + username + "\n");
	return true;
}



public static int displayTopMenu() {
	
	//Scanner scanner2 = new Scanner(System.in);
	
	System.out.println("\n"
			+ "1) Make a Deposit \n" 
			+ "2) Make a Withdrawal \n" 
			+ "3) Check Balance \n"
			+ "4) Make a Transfer \n"
			+ "5) Log Out\n");
	
	return Integer.parseInt(scanner.nextLine());
}

public static void displayGoodbye() {
	System.out.print("\n Logging out and exiting systen. \n");
}

}
