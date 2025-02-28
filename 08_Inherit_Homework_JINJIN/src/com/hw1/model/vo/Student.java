package com.hw1.model.vo;

public class Student extends Person {

	private int grade;//학년
	private String major;//전공
	//기본생성자
	public Student() {}
	
	//매개변수생성자
	
	public Student(String name,int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
		this.name= name;
	}
	
	@Override
	public String information() {
		//return super.information()+"/학년 : "+grade +"/ 전공 : "+major;
		return super.information()+String.format("/학년 : %d / 전공 : %s ",grade,major);
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
