package com.Robert.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Robert.models.Accounts;
import com.Robert.utils.DAOUtility;

public class AccountsDAOIMPL implements AccountsDAO{

	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public boolean addAccount(Accounts account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Accounts> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Accounts> getAllAccountsofCustomer(int id) {
		ArrayList<Accounts> accounts = new ArrayList<>();
	
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT (ac.customer_user_id, a.current_balance) FROM account a, account_customer ac where ac.customer_user_id = ? AND ac.customer_user_id = a.customer_account_user_id;";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				int account_id = rs.getInt("id");
				double currentBalance = rs.getDouble("current_balance");
				double accountBalance = rs.getDouble("account_balance");
				double withdrawalAmount = rs.getDouble("withdrawal_amount");
				double depositAmount = rs.getDouble("deposit_amount");
			
				accounts.add(new Accounts(account_id, currentBalance));
			
			}} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return accounts;
	}
	
	@Override
	public Accounts getAccount(int id) {
	  Accounts account = new Accounts();
	
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT (ac.customer_user_id, a.current_balance) FROM account a, account_customer ac where ac.customer_user_id = ? AND ac.customer_user_id = a.customer_account_user_id;";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				int account_id = rs.getInt("id");
				double currentBalance = rs.getDouble("current_balance");
			
				account = new Accounts(account_id, currentBalance);
			
			}} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return account;
	}

	@Override
	public boolean updateAccountBalance(double accountBalance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void closeResources() {
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
			
		}catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
			}
		}

	
	}


