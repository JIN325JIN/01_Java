package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {
	//필드 6개
	//장난감 이름, 사용가능 연령, 가격, 색상,제조일 (string 20250304).재료 set <string> ->중복되지않는 값으로 저장
	
	private String name;
	private int age;
	private int price;
	private String color;
	private String year;
	private Set<String> materials;
	
	public Toy() {
		
	}


	public Toy(String name, int age, int price, String color, String year, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.year = year;
		this.materials = materials;
	}



	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", year=" + year
				+ ", materials=" + materials + "]";
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


	public Set<String> getMaterials() {
		return materials;
	}


	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, color, materials, name, price, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price && Objects.equals(year, other.year);
	}


	

}
