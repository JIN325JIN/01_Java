package com.hw1.model.vo;

public class Person {
	
	//필드
	protected String name;
	//상속 받은 후손 클래스에서 protected 직접 접근 가능
	//마치 원래 본인것 이였던것 처럼 사용가능.
	private int age;
	private double height;
	private double weight;
	
	//private 필드는 상속을 통해 자식클래스가 부모클래스의 필드를 물려받더라도 getter,setter 이용해서 간접접근.
	
	
	//기본생성자
	public Person() {}
	
	//매개변수생성자
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String information() {
		//return "이름 :"+name +"/ 나이 :"+age +"/신장 :"+height+"/ 몸무게 : "+weight;
		return String.format("이름 : %s /나이 %d /신장 : %.1f / 몸무게 : %.1f",name,age,height,weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}	
}
