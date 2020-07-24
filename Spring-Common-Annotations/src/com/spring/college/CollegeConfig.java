package com.spring.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean(name = "colBean")//method name is going to be id of bean
	public College collegeBean()
	{
		College college=new College();
		return college;
	}
}
