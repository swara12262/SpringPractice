package com.spring.di;

public class Student {
	MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void cheating()
	{
		cheat.mathCheat();
	}
	
}
