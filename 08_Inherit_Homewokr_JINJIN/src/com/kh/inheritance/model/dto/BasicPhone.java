package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{

	
	private boolean hashPhysicalKeyboard;//물리적 키보드 유무
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hashPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hashPhysicalKeyboard = hashPhysicalKeyboard;
	}
	public void checkKeyboard() {
		System.out.println("이 제품은 물리적 키보드가 있습니다.");
	}
	public boolean isHashPhysicalKeyboard() {
		return hashPhysicalKeyboard;
	}
	public void setHashPhysicalKeyboard(boolean hashPhysicalKeyboard) {
		this.hashPhysicalKeyboard = hashPhysicalKeyboard;
	}

}
