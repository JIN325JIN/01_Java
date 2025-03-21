package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Company implements ManagementSystem {

	private Employee[] employees;//전체 직원 저장용
	private int employeeCount;//직원수
	
	//매개변수로 전달받은 size를 이용하여
	//Employee 객체배열을 size 크기로 생성한다.
	//employeeCount는 0으로 초기화한다.
	public Company(int size) {
		employees = new Employee[size];
		employeeCount=0;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	@Override
	public void addPerson(Person person) {
		//매개변수로 전달받은 Person 객체가 Employee 클래스의 인스턴스이며,배열에 공간이 있다면, 
		if(person instanceof Employee && employeeCount<employees.length) {
			
			//해당 객체를 employees 배열에 추가 후 추가된 객체의 정보를 출력.
			
			employees[employeeCount++] = (Employee) person; // 다운캐스팅
			System.out.print("직원이 추가되었습니다 - ");
			System.out.println(person.getInfo());
		}else {
			//만약 배열에 더 이상 공간이 없다면, 인원이 모두 충원되었다는 메시지 출력
			System.out.println("모두 충원되었습니다.");
		}
	}
	@Override
	public void removePerson(String id) {
		//매개변수로 전달받은 id와 일치하는 직원을 찾으면, 해당 직원을 삭제하고 관련 정보를 출력. 일치하는 id가
		//없다면 해당 id를 가진 직원을 찾을 수 없다는 메시지를 출력
		
		for(int i =0; i<employeeCount;i++) {
			
			if(employees[i].getId().equals(id)) {
				
				System.out.println("직원이 삭제되었습니다. "+employees[i].getInfo());
				employees[i] = null;
				
				for (int j = i; j < employeeCount - 1; j++) {
					employees[j] = employees[j + 1];
				}

				employees[--employeeCount] = null;
				return;
			}
		}
		System.out.println("일치하는 직원을 찾을수 없습니다.");
	}
	@Override
	public void displayAllPersons() {
		//전체 직원 명단을 출력하는 기능
		System.out.println("전체 직원 명단 : ");
		for (int i =0; i<employeeCount;i++) {
			System.out.println(employees[i].getInfo());
		}
	}
}
