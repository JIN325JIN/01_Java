package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//3개의 생성자를 사용하여 3명의 사원 정보를 배열로 생성한 후 출력 해보고
		//값이 없는필드에 각각 값을 입력해 넣어 출력
		//직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고 
		//총 직원 연봉의 평균을 구하여 출력
		
		//객체 배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성후 출력
		Employee[] emp =new Employee[3];
		
		//할당 한뒤 3개의 생성자를 각각 이용하여 객체 생성후 출력
		
		emp [0] = new Employee();
		emp [1]= new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		emp [2]= new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		
		for(int i =0; i<emp.length;i++) {
			System.out.print("emp ["+ i +"] : "+emp[i].information()+"\n");
		}
		
		//3개의 객체중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		System.out.println("=================================================================");
		
		
		//2.3개의 객체중 값이 없는 필드에 각각 값을 넣고 출력
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		
		System.out.print("emp ["+ emp[0].getEmpNo()+"] : "+ emp[0].information()+"\n");
		System.out.print("emp ["+ emp[1].getEmpNo() +"] : "+ emp[1].information()+"\n");
		
		System.out.println("=================================================");
	
		//직원 각각의 보너스가 적용된 1년연봉을 계산하여 출력
		//연봉 = (급여+(급여*보너스포인트))*12
			
		int sum =0;//모두 연봉 합
		
		for(int i =0; i<emp.length;i++) {
			int sumSalary = (int)(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
			System.out.printf("%s의 연봉 : %d원 \n",emp[0].getEmpName(),sumSalary);
			sum = sum + sumSalary;
		}
		
		//3명의 직원의 연봉 평균
		System.out.println("=================================================");
		System.out.printf("직원들의 연봉의 평균 %d 원",sum/emp.length);
		
		
	}

}
