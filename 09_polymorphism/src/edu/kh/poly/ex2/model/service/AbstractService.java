package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {
	
	public void ex1() {
		
		//Animal 객체 생성 
		//Animal a1 = new Animal();//Cannot instantiate the type Animal: Animal 타입은 객체화 할수 없음.
		//그러나 참조변수의 역할은 가능. 
		//추상 클래스와 다형성 함께 이용하기
		
		
		//부모타입 참조 변수 로서의 역할은 가능하기 때문에 Animal을 상속받아 미완성 부분을 구체적으로 구현한 자식 클래스를 이용해 객체 생성
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setType("척추 동물 중 인간 ");
		p1.setEatType("잡식");
		
		Fish f1 = new Fish();
		f1.setType("척추 동물 중 어류");
		f1.setEatType("잡식");
		
		
		System.out.println(p1.toString());
		System.out.println(f1.toString());
		
		Animal a1 = new Person();//다형성 중 업캐스팅
		Animal a2 = new Fish();//다형성 중 업캐스팅
		
		a1.ex();
		a1.breath();
		a1.eat();
		a1.move();
		
		//이론상 Animal에 정의된 move가 구현되어야 하는데 사실 move는 정의 된적이 없음.
		//동적 바인딩에 의해 people에 있는 메서드가 실행됨
		
		a2.ex();
		a2.breath();
		a2.eat();
		a2.move();
	}
}
