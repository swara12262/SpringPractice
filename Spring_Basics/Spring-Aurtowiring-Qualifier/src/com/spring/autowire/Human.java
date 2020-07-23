package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	public Human() {
		this.heart = null;
	}
	
	public Human(Heart heart) {
		this.heart = heart;
	}
	
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}
	public void startPumping()
	{
		if(heart==null)
			System.out.println("You are dead");
		else
			heart.pump();
	}
}
