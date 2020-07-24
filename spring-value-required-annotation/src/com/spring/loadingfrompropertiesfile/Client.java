package com.spring.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//Student stu = context.getBean("student", Student.class);
		//stu.displayStudentInfo();
		
		JdbcConnection con=context.getBean("jdbcconn", JdbcConnection.class);
		con.getConnection();
		
	}

}
