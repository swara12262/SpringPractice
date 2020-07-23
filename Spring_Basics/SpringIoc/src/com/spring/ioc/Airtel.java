package com.spring.ioc;

public class Airtel implements Sim {
	
	public Airtel()
	{
		System.out.println("Airtel cons called");
	}
	@Override
	public void calling() {
		System.out.println("Airtel calling");

	}

	@Override
	public void data() {
		System.out.println("Airtel browsing");

	}

}
