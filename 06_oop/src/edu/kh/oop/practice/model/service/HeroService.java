package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	//메서드
	public void practice() {
		
		//1.매개변수 생성자를 이용하여 첫번재 히어로 객체 생성
		Hero hero1= new Hero();
		
		hero1.setNickname("이구역짱");
		hero1.setJob("전사");
		hero1.setHp(200);
		hero1.setMp(20);
		hero1.setLevel(1);
		hero1.setExp(0);
		
		//2.매개변수 생성자를 이용하여 두번째 히어로 객체 생성
		Hero hero2= new Hero("zi존위자드","마법사",100,100,1,0);
		
		//3.객체가 가진 필드 값을 매개변수 생성자를 이용하여 객체 생성시 출력
		
		//4.각 객체가 가진 method를 적절히 호출하여 출력결과 같이 출력
		
		System.out.println("========이구역짱 시점========");
		hero1.attack(100);
		hero1.attack(50.5);
		hero1.attack(49.5);
		hero1.dash();
		hero1.dash();
		hero1.dash();
		
		System.out.println(hero1.toString());
		
		
		System.out.println("========zi존 위자드 시점========");
		hero2.attack(300);
		hero2.dash();
		hero2.attack(300);
		hero2.attack(300);
		System.out.println(hero2.toString());
	}
}
