package com.Robert.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Robert.models.Customer;

public class CustomerDAOIMPL implements CustomerDAO {
	
	
	private Connection connection;
	private PreparedStatement statement;

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateCustomerAccountBalance(double accountBalance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCustomer(int id) {
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
