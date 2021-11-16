package com.Robert;

import com.Robert.controllers.Controller;
import com.Robert.models.*;

import java.util.*;

public class Driver {

	public static void main( String [] args){
		
		//call first controller
		
		
		// TODO Auto-generated method stub
		
    Scanner userInput = new Scanner(System.in);
       
     System.out.println(" Welcome to Davis and Davis Bank Application!");
     
     System.out.println(" Create an account if you are a new customer, Enter a username below: ");
     
     Customer customer1 = new Customer();
     
     customer1.setUserName(userInput.next());
     
     System.out.println("Now select a password");
     
     customer1.setUserPassWord(userInput.next());
     
     System.out.println("Your username is: " +customer1.getUserName()+ "and password is: " +customer1.getUserName());
     
    // userInput.close();
     
     Controller.init();
     
     
	}

}
