package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Student[] std= new Student[3];
		std[0] = new Student ("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		std[1] = new Student ("김말똥",21,187.3,80.0,2,"경영학과");
		std[2] = new Student ("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i =0; i<std.length;i++) {
			System.out.println(std[i].information());
		}
		System.out.println("=============================================================");
		
		Employee[] arr = new Employee[10];
		int count=0 ;
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 :");
			int age = sc.nextInt();
			System.out.print("신장 :");
			double height =sc.nextDouble();
			System.out.print("몸무게 :");
			double weight = sc.nextDouble();
			System.out.print("급여 :");
			int salary = sc.nextInt();
			System.out.print("부서 :");
			String dept =sc.next();
			
			arr[count]= new Employee(name,age,height,weight,salary,dept);
			
			System.out.print("계속 추가하겠습니까 ? y/n");
			char input = sc.next().charAt(0);
			
			if(input=='y') {
				count =count+1;
				System.out.println(count);
			}
			if(input !='y') {
				for(int i =0; i<=count;i++) {
					System.out.println(arr[i].information());				
				}
				break;
			}
		}
	}
}
