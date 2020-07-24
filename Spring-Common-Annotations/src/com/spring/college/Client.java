package com.spring.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("colBean", College.class);
		college.test();
		System.out.println("Object created");
	}

}
