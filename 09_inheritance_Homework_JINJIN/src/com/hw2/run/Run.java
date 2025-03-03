package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {

		//company의 생성자를 이용하여 10칸짜리 employee객체배열 생성하는 컴패니 객체 생성
		//매니지먼트 시스템 자료형의 company에 주소를 저장
		ManagementSystem company = new Company(10);
		
		//prison의 생성자를 이용하여 10칸 짜리 prisoner 객체 배열 생성하는 prison객체 생성후
		//매니지먼트시스템 자료형의 프리즌에 주소를 저장
		ManagementSystem prison = new Prison(5);
	
		//2명정도 직원 새로 등록하기
		company.addPerson(new Employee("EMP001", "유재석", "기획팀")); // 다형성 업캐스팅 사용
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀")); // 다형성 업캐스팅 사용
		
		//등록된 전체 직원 조회
		company.displayAllPersons(); // 동적바인딩
		
		System.out.println("=========================================");
		
		//2명정도 수감자 새로 등록하기
		prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		prison.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		
		//등록된 전체 수감자 조회
		prison.displayAllPersons();
		
		//emp001 id를 가진직원 삭제
		company.removePerson("EMP001");
		//1205 id를 가진 수감자 삭제
		prison.removePerson("1205");
		
		System.out.println("=========================================");
		//현재 남은직원 모두 조회
		company.displayAllPersons(); // 동적바인딩
		
		//현재 남은 수감자 모두 조회
		prison.displayAllPersons(); // 동적바인딩
	}

}
