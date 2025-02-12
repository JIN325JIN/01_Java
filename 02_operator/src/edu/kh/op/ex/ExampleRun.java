package edu.kh.op.ex;

//실행용 클래스 (메인 메서드 존재)

public class ExampleRun {

	public static void main(String[] args) {
		
	//OpExample 생성 
	//->OpExmaple이라는 클래스(설계도)를 이용해서 객체를 생성하는데, 그 객체 이름이 OpEx
	//같은 패키지(edu.kh.op.ex)안에 있는 클래스는 import하지않아도 자유롭게 불러다 쓸 수 있다.
	OpExample opEx = new OpExample();
	
	
	opEx.ex1();//opex가 가지고 있는 기능 (메서드)중 ex1이라는 이름의 메서드를 호출(실행)		
	System.out.println();
	opEx.ex2();
	System.out.println();
	opEx.ex3();
	System.out.println();
	opEx.ex4();
	System.out.println();
	opEx.ex5();
	}
}
