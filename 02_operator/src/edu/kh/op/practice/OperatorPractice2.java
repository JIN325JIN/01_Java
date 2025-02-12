package edu.kh.op.practice;

import java.util.Scanner;
//연산자 실습문제2
public class OperatorPractice2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는? :");
		int age = sc.nextInt();
		System.out.println(age >=20 ?"저는 성인입니다.":"저는 미성년 입니다.");
		System.out.print(((age >= 13) && (age <= 19))?"청소년입니까?true\n" :"청소년입니까?false\n");
		System.out.print(((age < 12) || (age >= 65) )?"노인이거나 어린이 입니까? true\n ":"노인이거나 어린이 입니까? false\n");
	
	}

}
