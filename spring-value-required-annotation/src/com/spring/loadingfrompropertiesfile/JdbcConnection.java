package com.spring.loadingfrompropertiesfile;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

import com.mysql.cj.jdbc.ConnectionImpl;

public class JdbcConnection {

	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Value("${jdbc.driver}")
	private String driver;
	
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		ConnectionImpl con= (ConnectionImpl) DriverManager.getConnection(url, username, password);
		System.out.println("Connection successful"+ con);
	}
	
}
