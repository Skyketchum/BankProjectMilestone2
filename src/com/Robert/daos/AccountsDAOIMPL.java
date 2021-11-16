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
			String sql = "SELECT (a.*) FROM account a, account_customer ac where ac.customer_id = ? AND ac.account_id = a.id;";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				
				int account_id = rs.getInt("id");
			//	String firstName = rs.getString("first_name");
			//	String lastName = rs.getString("last_name");
				double accountBalance = rs.getDouble("account_balance");
			
				accounts.add(new Accounts());
			
			}} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return accounts;
	}
	@Override
	public Accounts getAccount(int id) {
		// TODO Auto-generated method stub
		return null;
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


