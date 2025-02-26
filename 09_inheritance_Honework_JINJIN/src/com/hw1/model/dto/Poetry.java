package com.hw1.model.dto;

public class Poetry extends Book{

	private int numberOfPoems;//시 수
	
	public Poetry() {}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}
	
	@Override
	public void displayInfo() {
		System.out.print("[시집]");
		super.displayInfo();
		System.out.print("/시 수 : " + numberOfPoems);
		
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	
}
