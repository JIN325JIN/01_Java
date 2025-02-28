package com.hw3.model.dto;

public class Book {

	private int num;//도서 번호
	private String name;//도서 이름
	private String author;//도서 제목
	private int price;//저자
	private String publisher;//가격
	
	public Book() {}//기본 생성자

	public Book(int num, String name, String author, int price, String publisher) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return num + "번 도서 :" + "[도서제목 : " + name + "/ 도서 저자 :" + author + "/ 도서가격 :" + price + "/ 출판사 :"
				+ publisher + "]";
	}
	
	
	
}
