package edu.kh.oop.method.model.service;

public class MethodExample {

	
	//메서드가 호출될 때 마다 stack에 메서드를 실행한 이력이 쌓인다.
	//=> 메서드를 호출한 순서대로 쌓임.
	// main -> method1 -> method2
	//그리고 제일 마지막에 쌓인 순서대로 스택에서 나감
	//->Last Input Firtst Out : 후입선출
	//method2-> method1->main 순서로 나감
	
	
	public void method1() {
		int result = method2(3,5);//메서드2 함수호출
		System.out.println(result);
		return ;//이 생략된 상태
		//호출한 곳으로 되돌아감 (가져갈게 없으니까)
	}
	public int method2(int a, int b) {
		int sum= a+b;
		return sum;
		
		//return 값;(반환)
		//method2를 호출한쪽으로 sum (8)을 가지고 
		//코드의 흐름이되돌아감.
	}
}
