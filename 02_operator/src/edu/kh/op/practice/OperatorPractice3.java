package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		System.out.print("멤버십 있으세요? (있으면 true/ 없으면 false 입력 ): ");
		boolean membership = sc.nextBoolean();
		
		double total = (membership == true) ? price * 0.90 : price*0.95;
		System.out.println("할인을 포함한 최종금액 : " + total +"원");
		System.out.println();
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력: ");
		int price = sc.nextInt();
		
		System.out.println("50000원 :" +price/50000 );
		System.out.println("10000원 :"+ (price%50000 )/10000);
		int fifty =(price%50000)%10000; 
		System.out.println("5000원 : " + fifty/5000);//모르겟다
		System.out.println("1000원 :" + ((price %10000)%5000)/1000);
		System.out.println();
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 :");
		int num2 = sc.nextInt();
		
		System.out.println((num1%num2==0)?"배수입니다.":"배수가 아닙니다.");
		System.out.println();
		
	}
	
	
}
