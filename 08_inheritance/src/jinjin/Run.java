package jinjin;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의 사용데이터를 참고하여 3명의 학생 객체
		//생성 후 반복문을 통해 출력
		Student[] str = new Student[3];
		str[0] = new Student ("홍길동",20,178.2,70.0,1,"정보통신공학부");
		str[1]= new Student ("김말똥",21,187.3,80.0,2,"경영학과");
		str[2]= new Student ("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i =0; i<str.length;i++) {
			System.out.println(str[i].information());
		}
		System.out.println("===============================================================");
		//2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복문을 사용하여 키보드로 사원 정보를 입력
		//받도록 구현 2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된사원들의 정보 출력
		Employee[] arr = new Employee[10];
		int count =0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여: ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept =sc.next();
			
			arr[count]= new Employee(name,age,height,weight,salary,dept);
			count++;
			
			if(arr.length==count) {
				break;
			}
			System.out.print("계속추가할래?( Y/N : ");
			String input = sc.next().toUpperCase();//소문자를 대문자로 치환
			
			if(input.equals("N")) {
				break;
			}
			
		}
		for(Employee emp :arr) {
			if(emp==null) {
				break;
			}
			System.out.println(emp.information());
		}
		
		
	}

}
