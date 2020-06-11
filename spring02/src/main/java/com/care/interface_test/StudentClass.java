package com.care.interface_test;

import java.util.ArrayList;

public class StudentClass implements Student {
	private PrintClass pc;
	private String name;
	private ArrayList<String> food;
	
	@Override
	public void execute() {
		pc.print(name, food);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getFood() {
		return food;
	}

	public void setFood(ArrayList<String> food) {
		this.food = food;
	}

	public PrintClass getPc() {
		return pc;
	}

	public void setPc(PrintClass pc) {
		this.pc = pc;
	}

}
