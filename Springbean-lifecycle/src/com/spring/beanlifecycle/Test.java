package com.spring.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/*StudentDAO st=context.getBean("studentDao", StudentDAO.class);
		
		st.selectAllRows();
		st.deleteUserRecord(15);*/
		
		((AbstractApplicationContext) context).close();
		
	}
	
}
