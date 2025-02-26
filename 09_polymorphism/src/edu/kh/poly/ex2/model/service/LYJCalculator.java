package edu.kh.poly.ex2.model.service;

public class LYJCalculator implements Calculator,TestInterface /* , 다른클래스명 */{

	//extends : 확장 하다,  implements : 구현하다.
	//(부모)클래스 -(자식)클래스 : extends 사용
	//(부모)인터페이스 - (자식)인터페이스 : extends
	//(부모)인터페이스 - (자식)클래스 : implements 
	//(부모)클래스 - (자식)인터페이스 : 상속 불가 
	
	@Override
	public int plus(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int minus(int num1, int num2) {
		return num1-num2;
	}
	@Override
	public int multiple(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	
	
	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}
	//자바 8버전 이후부터 구현부있는 메서드가 추가되었는데, 양쪽 에 메서드 겹치면 반드시 오버라이딩 해야함
	//다중 상속중인 인터페이스들에 같은 디폴트 메서드가 겹치면 오류 발생!
	//=> 상속받아서 구현하는 구현클래스에서 오버라이딩 반드시 해주면 됨!
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Calculator.super.display();
	}
	
	
}
