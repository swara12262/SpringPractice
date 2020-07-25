package com.spring.college;

import org.springframework.stereotype.Component;

public class College {
	private Principal principal;
	
	private Teacher teacher;
	
	
	/*public College(Principal principal) {
		this.principal = principal;
	}*/

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void setPrincipal(Principal principal) {
		System.out.println("Using Setter for principal");
		this.principal = principal;
	}


	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("College test");
	}
}
