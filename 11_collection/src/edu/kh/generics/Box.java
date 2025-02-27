package edu.kh.generics;


	//제네릭 클래스 선언
public class Box <T>{
	//T는 타입 파라미터, 실제 사용시 구체적 타입(string,int등 )으로 변환됨.
	
	
	private T item ;// T라는 타입의 변수 선언

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
