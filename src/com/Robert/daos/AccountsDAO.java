package com.Robert.daos;

import java.util.ArrayList;

import com.Robert.models.Accounts;


public interface AccountsDAO {
	//create
		public boolean addAccount(Accounts account);
		
		//read
		public ArrayList<Accounts> getAllAccounts();
		public ArrayList<Accounts> getAllAccountsofCustomer(int id);
		public Accounts getAccount(int id);
		
		//update
		
		public boolean updateAccountBalance(double accountBalance);
		
		
		//delete
		
		public boolean removeAccount(int id);

}
