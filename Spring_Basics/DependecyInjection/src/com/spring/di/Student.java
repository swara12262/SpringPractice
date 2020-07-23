package com.spring.di;

public class Student {
	private int id;
	private String studentName;

	public Student(String studentName) {
	
		this.studentName = studentName;
	}

	/*
	 * public Student(int id) { this.id = id; }
	 */

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	/*public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
*/
	public void displayStudentInfo() {
		System.out.println("Student name is " + studentName+ " with id = "+id);
	}

}
