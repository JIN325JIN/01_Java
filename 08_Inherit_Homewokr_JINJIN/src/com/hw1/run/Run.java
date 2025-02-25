package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고
		//아래의사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력
		
		//3명의 학생 정보를 기록할수 있게 객체 배열 할당
		//위의 사용 데이터 참고하여 3명의 학생 정보 초기화 학생 정보 모두 출력
		Student [] srr = new Student[3];

		srr[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		srr[1] = new Student("김말똥",22,187.3,80.0,2,"경영학과");
		srr[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i=0;i<srr.length;i++) {
			System.out.println(srr[i].information());
		}
		System.out.println("===향상된포문===");
		for(Student std : srr) {
			System.out.println(std.information());
		}
		//향상된 포문 : 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할수 있는 구조를 제공하는 포문
		//일반적인 포문보다 코드가 더 간결하고 가독성이 좋아서 반복작업을 더 쉽게 작성할수 있다.
		/*
		 * for(데이터 타입 변수명 : 배열  또는 컬렉션 ){
		 * 
		 *반복해서 실행할 코드
		 *}
		 * */
		System.out.println("=======================================================================================");
		
		//2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 
		//반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현 
		//2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된 사원들의 정보 출력
		
		//최대 10명의 사원 정보를 기록할수 있게 배열 할당
		Employee[] arr = new Employee[10];
		
		//사원들의 정보를 키보드로 계속 입력 받고
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		// ->while (true)무한 반복문을 통해
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();
			
			arr[count] = new Employee(name,age,height,weight,salary,dept);
			count++;
			
			//배열이 꽉찼으면 반복종료
			if(arr.length==count) {
				break;
			}
			//계속 추가할 것인지 물어보고
			System.out.print("계속 추가할래?(y/n) :");
			//char ch = sc.next().charAt(0);
			String str = sc.next().toUpperCase();//소문자 -> 대문자 치환해주는 
			//String.to.lowerCase() : 대문자 -> 소문자
			
			if(str.equals("N")) {
				break;
			}
		}	
		for( Employee emp : arr) {
			//[첫번째 emp객체에 대한 주소 , 두번째 emp객체에 대한 주소, null,null 등등등...]가정 
			//만약에 emp 가 null이면 반복 종료!
			if(emp==null) break;//nullpointerexception방지
			System.out.println(emp.information());
		}
	}
}