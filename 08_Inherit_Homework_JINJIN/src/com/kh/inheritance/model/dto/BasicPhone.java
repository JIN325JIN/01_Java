package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{

	
	private boolean hasPhysicalKeyboard;//물리적 키보드 유무
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hashPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hashPhysicalKeyboard;
	}
	public void checkKeyboard() {
		
		if(hasPhysicalKeyboard) {
			System.out.println("이 제품은 물리적 키보드가 있습니다.");
		}
		
		else {
			System.out.println("이 제품은 물리적 키보드가 없습니다.");
		}
	}
	public boolean isHashPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}
	public void setHashPhysicalKeyboard(boolean hashPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hashPhysicalKeyboard;
	}

}
