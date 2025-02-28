package com.hw1.model.vo;

public class Employee extends Person{

	private int salary;//급여
	private String dept;//부서
	
	 //기본생성자
	public Employee() {}
	//매개변수 생성자
	public Employee(String name,int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.salary = salary;
		this.dept = dept;
		this.name = name;//직접 접근 (본인 객체만 가르키는 this인데 protected니까)
		//부모 클래스인 person 에 작성된 필드 중 protected 접근제한자 name
	}
	@Override
	public String information() {
		//return super.information()+"/급여 : "+salary+"/ 부서 : "+dept;
		return super.information()+String.format("/급여 : %d / 부서 : %s ",salary,dept);
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
}
