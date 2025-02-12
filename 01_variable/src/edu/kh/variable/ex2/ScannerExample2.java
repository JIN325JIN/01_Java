package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	
	
	public static void main(String[] args) {
		
		
		//사칙연산 계산기 만들기
		//두실수를 입력받아 사칙연산 결과출력
		//단 출력된 결과값은 소수점이하 둘째자리 까지만 출력
		
		Scanner sc = new Scanner(System.in);//정해진 구문
		
		System.out.print("실수 1을 입력해주세요 : " );
		double input1 = sc.nextDouble();
		System.out.print("실수 2를 입력해주세요 : " );
		double input2 = sc.nextDouble();
		
		System.out.print("계산을 시작하겠습니다.\n" );
		
		System.out.printf("%.2f + %.2f = %.2f \n",input1,input2,input1+input2);
		System.out.printf("%.2f - %.2f = %.2f \n",input1,input2,input1-input2);
		System.out.printf("%.2f * %.2f = %.2f \n",input1,input2,input1*input2);
		System.out.printf("%.2f / %.2f= %.2f\n",input1,input2,input1/input2);
		
		
		
		
	}

}
