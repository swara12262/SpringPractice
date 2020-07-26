package com.spring.beanlifecycle;

import java.sql.Connection;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String url;
	private String username;
	private String password;
	private String driver;
	
	Connection con;
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		System.out.println("Setting url");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("Setting username");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("Setting password");
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("Setting driver");
		this.driver = driver;
	}
	
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("Inside custom init method");
		createConnection();
	}

	
	public void createConnection() throws Exception 
	{
		System.out.println("creating connection");
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);		
	}
	
	public void selectAllRows() throws Exception {
		
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("Select * from photo_app.users");

		while (rs.next()) {
			int id = rs.getInt(1);
			String email = rs.getString(2);
			String firstName = rs.getString(6);
			String lastName = rs.getString(6);

			System.out.println("id" + "- " + id + " " + "email " + "- " + email + " " + "firsname" + "- " + firstName
					+ " " + "latName" + "- " + lastName);
		}
	}

	public void deleteUserRecord(int userID) throws Exception {
		
		Statement st = con.createStatement();

		st.executeUpdate("Delete from photo_app.users where id=" + userID);

		System.out.println("Record deleted with id=" + userID);
	}
	
	@PreDestroy
	public void closeConnection() throws SQLException
	{
		System.out.println("cleaning up");
		//to perform clean up job
		con.close();
	}
	
}
