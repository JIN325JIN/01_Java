package com.hw1.model.dto;

public class Book {

	private String title;//제목
	private String author;//저자
	
	
	public Book() {}


	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.print("제목 : "+title +"/ 저자 : "+author);
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
