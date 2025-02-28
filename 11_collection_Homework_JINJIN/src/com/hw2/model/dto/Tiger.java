package com.hw2.model.dto;

public class Tiger extends Animal{

	public Tiger() {}

	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println(name +"가 어흥 하며 포효 합니다.");
	}
	
	
}
