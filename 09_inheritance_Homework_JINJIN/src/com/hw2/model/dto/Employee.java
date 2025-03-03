package com.hw2.model.dto;

public class Employee extends Person {
	
	private String position;//직책

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getInfo() {//오버라이딩하여 객체정보를 문자열로 반환
		return "ID : "+id+", 이름 :"+name+", 직책 :"+position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
