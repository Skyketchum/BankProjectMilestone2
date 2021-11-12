package com.Robert.models;

public class Employees extends Person {
	
	private String employeeUserName;
	private String employeePassWord;
	
	public Employees(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	public String getEmployeeUserName() {
		return this.employeeUserName;
	}
	
	public void setEmployeeUserName(String employeeUserName) {
		
		this.employeeUserName = employeeUserName;
		
	}
	public String getEmployeePassWord() {
		return this.employeePassWord;
	}
	
	public void setEmployeePassWord(String employeePassWord) {
		
		this.employeePassWord = employeePassWord;
		
	}
	

	

}