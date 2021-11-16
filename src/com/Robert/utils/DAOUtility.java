package com.Robert.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOUtility {
	
	
	private static String CONNECTION_USERNAME;
	
	private static String CONNECTION_PASSWORD;
	
	private static String CONNECTION_URL;
	
	private static Connection connection;
	
   //data base url	"jdbc:postgresql://localhost:5432/Bank-Setup"
	
	
	static {
		try { 
			//SAVE properties (key/value pairs) into an object
			InputStream input = ClassLoader.getSystemResourceAsStream("application.properties");
			Properties properties = new Properties();
			properties.load(input);
			
			//get the system variable name from the properties file
			String SYSTEM_VARIABLE_USERNAME = properties.getProperty("USERNAME_PROPERTY");
			String SYSTEM_VARIABLE_PASSWORD = properties.getProperty("PASSWORD_PROPERTY");
			String SYSTEM_VARIABLE_URL = properties.getProperty("URL_PROPERTY");
			
			
			//get the value from the system variable 
			CONNECTION_USERNAME = System.getenv(SYSTEM_VARIABLE_USERNAME);
			CONNECTION_PASSWORD = System.getenv(SYSTEM_VARIABLE_PASSWORD);
			CONNECTION_URL = System.getenv(SYSTEM_VARIABLE_URL);
			
			input.close();
			
		} catch(IOException ex) {
			ex.printStackTrace();
			
		}
		
		
	}
	
	
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Could not register driver!");
		}
		
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			
		}
		return connection;
		
}
	
	
}
