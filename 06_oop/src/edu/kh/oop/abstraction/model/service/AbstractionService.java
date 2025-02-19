package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//service :특정 기능 (비즈니스 로직)을 제공하는 패키지 or 서비스
//비밀번호 -> 암호화,파일 ->유효한 파일 걸러내는 작업
public class AbstractionService {
	//속성 
	
	//기능
	public void ex1() {
		//people이라는 클래스를 이용해서 국민 객체 만들기

		People p1 = new People();
		//people p1: people객체의 주소를 저장하여 참조하는 변수 P1
		//P1 == 참조변수
		//new People() : 새로운 People객체를 heap영역에 생성
		//메서드 안에서 생성된 변수는 스택에 생성됨
		
		//클래스 이름이 마치 자료형처럼 사용된다.
		//그래서 클래스를 사용자 정의 자료형이라고 부른다!
		/*
		//int[]arr = new int[5];
		System.out.println("===대입 전===");
		System.out.println("p1의 name :" +p1.name);
		System.out.println("p1의 gender :" +p1.gender);
		System.out.println("p1의 gender :" +(int)p1.gender);
		//char 타입 jvm기본값은 0
		//유니코드 문자체계에서 0은 공백을 나타냄
		//눈으로 보려면 int형으로 강제형변환
		System.out.println("p1의 pno :" +p1.pNo);
		System.out.println("p1의 address :" +p1.address);
		System.out.println("p1의 phone :" +p1.phone);
		System.out.println("p1의 age :" +p1.age);
		
		//직접 접근: 캡슐화를 어김
		p1.name ="홍길동";
		p1.gender ='남';
		p1.pNo = "123456-1234567";
		p1.address ="서울시 중구 남대문로 120";
		p1.phone="010-1234-5678";
		p1.age =20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("===대입 후===");
		System.out.println("p1의 name :" +p1.name);
		System.out.println("p1의 gender :" +p1.gender);
		System.out.println("p1의 pno :" +p1.pNo);
		System.out.println("p1의 address :" +p1.address);
		System.out.println("p1의 phone :" +p1.phone);
		System.out.println("p1의 age :" +p1.age);
		*/
		
		//전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		p1.setGender('남');
		System.out.println(p1.getGender());
	
		p1.setPno("123456-1234567");
		System.out.println(p1.getPno());
		
		p1.setAddress("서울시 중구");
		System.out.println(p1.getAddress());
		
		p1.setPhone("010-1234-5678");
		System.out.println(p1.getPhone());
		
		p1.setAge(20);
		System.out.println(p1.getAge());
	}
	public void ex2() {
		People yoonjin = new People();
				
		yoonjin.setName("이윤진");
		System.out.println(yoonjin.getName());
		
		yoonjin.setGender('여');
		System.out.println(yoonjin.getGender());
	
		yoonjin.setPno("960325-8808180");
		System.out.println(yoonjin.getPno());
		
		yoonjin.setAddress("서울시 도봉구");
		System.out.println(yoonjin.getAddress());
		
		yoonjin.setPhone("010-2841-6685");
		System.out.println(yoonjin.getPhone());
		
		yoonjin.setAge(30);
		System.out.println(yoonjin.getAge());
	}
}
