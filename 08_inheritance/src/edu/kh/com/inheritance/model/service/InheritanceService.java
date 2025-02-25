package edu.kh.com.inheritance.model.service;

import edu.kh.com.inheritance.model.dto.Employee;
import edu.kh.com.inheritance.model.dto.Person;
import edu.kh.com.inheritance.model.dto.Student;

public class InheritanceService {

	//상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		
		System.out.println("========================");
		
		//person을 상속받은 student가 정말로 person의 필드, 메서드를 사용할수 있는가?
		//student 객체 생성
		Student std = new Student();
		//student만의 고유한 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println("========================");
		
		//person클래스로부터 상속받은 멤버
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println("========================");
		//employee의 고유멤버
		Employee emp = new Employee();
		
		emp.setCompany("kh정보교육원");
		System.out.println(emp.getCompany());
		System.out.println("========================");
		
		//person 클래스로부터 상속받은 멤버
		emp.setName("이윤진");
		emp.setAge(25);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		
		std.breath();
		std.move();
		
		emp.breath();
		emp.move();
		
		//상속의 특징
		//코드 길이 감소 및 중복 제거 효과!
		
		
		
		
	}
	
	//super 생성자 이용해보기
	public void ex2() {
		
		//Student 객체 생성
		Student std = new Student("홍길동",17,"대한민국",1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println("========================");
		
		//employee객체 생성(매개변수 생성자) (이름,나이,국적,회사)
		Employee emp = new Employee("김노동",30,"한국","kh정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
	}
	
	//오버라이딩 확인 예제
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();//오버라이딩 x ->person 부모의 메서드 수행
		//사람은 움직일수 있다.
		emp.move();//오버라이딩 O ->employee 에서 재정의한 메서드 move 수행
		//효율적으로 일하고 빨리 퇴근한다.
	}

	//오버라이딩 to string 예제
	public void ex4() {
		Person p = new Person("김철수",17,"한국");
		
		
		System.out.println(p);//김철수/17/한국
		System.out.println(p.toString());//김철수/17/한국
		//print 구문 수행시, 참조변수명을 작성하면 자동으로 tostring메서드를 호출해서 출력해준다.
	
		System.out.println("===================================");
		
		Student std = new Student("강호동",18,"미국",2,6);//student객체 생성
		
		System.out.println(std.toString());
		
		
		
		System.out.println("===================================");
		Employee emp = new Employee("김노동",36,"한국","kh정보교육원");
		System.out.println(emp);
		System.out.println(emp.toString());
		
		emp.onlyEmployee();
		
	}

	
}
