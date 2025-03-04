package com.yoonjin.model.dto;

import java.util.Objects;



public class Boyfriend implements Comparable<Boyfriend>{

	//이윤진이 그동안 사귄 남자 정보 프로그램
	
	//필드
	
	private String name;//이름
	private int age;//나이
	private int height;//키
	private String place;//만난곳
	private String year; //사귄 기간
	
	public Boyfriend() {}

	public Boyfriend(String name, int age, int height, String place, String year) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.place = place;
		this.year = year;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Boyfriend [name=" + name + ", age=" + age + ", height=" + height + ", place=" + place + ", year=" + year
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, height, name, place, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boyfriend other = (Boyfriend) obj;
		return age == other.age && height == other.height && Objects.equals(name, other.name)
				&& Objects.equals(place, other.place) && Objects.equals(year, other.year);
	}

	@Override
	public int compareTo(Boyfriend o) {
	//compare 재정의 해야지만 사용할수 있는데
		
		return this.height-o.height;
	}
	

}
