package com.spring.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("After properties set ie. init method");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside detsroy method");
		
	}

}
