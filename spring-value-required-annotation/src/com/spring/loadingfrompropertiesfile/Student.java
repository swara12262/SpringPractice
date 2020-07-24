package com.spring.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}") //setter method is not required for this field as it is using field dependency injection
	private String name;
	private String course;
	private String hobby;

	public String getCourse() {
		return course;
	}

	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
	}

	public String getHobby() {
		return hobby;
	}

	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Name : "+ name);
		System.out.println("Course : "+ course);
		System.out.println("Hobby : "+ hobby);
		
	}

}
