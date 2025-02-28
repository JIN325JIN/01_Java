package com.hw1.model.dto;

public class Textbook extends Book{
	private String subject;//과목
	
	public Textbook() {}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	@Override
	public void displayInfo() {
		System.out.print("[전문 서적]");
		super.displayInfo();
		System.out.println("/과목 : "+subject);
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
