package com.kh.inheritance.model.dto;

public class Phone {

	private String brand;
	private String model;
	private int year;
	private int price;
	
	public Phone() {}

	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("Brand :"+brand+"\n"+"Model :"+model+"\n"+"Year :"
	+year+"\n"+"Price :"+price+"원");
	}
	
}
