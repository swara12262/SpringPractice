package com.spring.college;

import org.springframework.stereotype.Component;

public class College {
	private Principal principal;
	
	public College(Principal principal) {
		this.principal = principal;
	}

	public void test()
	{
		principal.principalInfo();
		System.out.println("College test");
	}
}
