package com.Robert.daos;

import java.util.ArrayList;

import com.Robert.models.Customer;

public interface CustomerDAO {
	
	//create
	public boolean addCustomer(Customer customer);
	
	//read
	public ArrayList<Customer> getAllCustomers();
	public Customer getCustomer(int id);
	
	//update
	
	public boolean updateCustomerAccountBalance(double accountBalance);
	
	
	//delete
	
	public boolean removeCustomer(int id);

	

}
