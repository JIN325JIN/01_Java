package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	public Person() {}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	//중복 데이터 제거 : 같은 객체를 제거한다. 
	//객체가 같다 = 동일하냐 vs 동등하냐 
	//어떻게 비교하지?
	//동일 : 가리키고 있는 것이 같다.
	//동등 : 값이 같음.

	//동일 객체 : 메모리 주소가 완전히 같음.
	//HashCode()는 주로 이런 객체를 식별하는데 사용
	
	//동등 객체 : 메모리 주소가 다르더라도 , 각 객체의 내부 값들이 같다면 동일한 객체로 간주하는 경우를 말함
	//equals() : 이러한 동등객체를 식별하는데 사용
	
	
	
	
	//동일 비교 : Object.hashcode() 메서드 오버라이딩
	
	@Override
	public int hashCode() {
		//필드에 저장된 값을 이용해서 hashCode 생성
		//값이 같으면 해쉬코드도 같다.
		//hashcode : 객체별 식별 코드
		
		return Objects.hash(age, gender, name);
	}

	
	
	//동등 비교 : Object.equals() 메서드 오버라이딩 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	// 왼쪽== 오른쪽: 주소를 비교 
	//equals() :값 비교


}
