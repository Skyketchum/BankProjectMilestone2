package com.Robert.models;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	
	
	
	public Person() {
		
	}
	
	
	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id =id;
	}
	
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.firstName = lastName;
	}
}