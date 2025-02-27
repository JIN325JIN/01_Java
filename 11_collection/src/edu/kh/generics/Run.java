package edu.kh.generics;

public class Run {
	
	public static void main(String [] args) {

		//String 타입으로 객체 생성

		Box <String> stringBox = new Box<String>();//박스 객체를 만들때 String 으로 제네릭 제한.
		//T가 String 으로 대체 됨.
		//->필드도 String 타입.
		//getter.setter에서 사용되는 타입도 string
		
		stringBox.setItem("안녕제네릭?");
		System.out.println(stringBox.getItem());
		
		
		Box<Integer> intBox = new Box<>();
		//자바 7버전 이상에서는 우변타입 생략 가능.
		//다이아몬드 연산자 : 컴파일러가 좌편을 보고 우변의 타입을 추론.
		
		
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		

		//제네릭은 객체(Reference Type)만 허용
		//-> 제네릭은 기본 자료형(primitive type)인 int,double,char 같은 타입은 사용할수 없다.
		//-> 대신 Wrapper 클래스를 사용 
		
		//byte의 Wrapper class는 Byte
		//short의 Wrapper class는 Short
		//long Long
		//float Float
		//char Character
		//boolean Boolean
		//int Integer : 인트랑 char만 다름!!!
		
		
		Integer num1 = 10;//int 10이 인티져라는 객체에 들어감// 오토박싱 (auto - boxing) 
															//기본형 -> wrapper 클래스로 자동변환
		
		int num2 = num1;//오토 언박싱 (auto unboxing)
						//래퍼 클래스 -> 기본형 자동변환
		
		int number = Integer.parseInt("100");//실제 정수값 100저장. (문자열을 숫자로 변환)
				
		
		
		
		
		
		
		
		
	}
}
