package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] aths)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
	}

}
