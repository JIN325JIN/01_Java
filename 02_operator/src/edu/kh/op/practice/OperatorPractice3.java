package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice5() {
		
		/*마트에서 고객에게 할인 혜택을 제공하려고 한다
		물건의 총 가격과 회원 여부를 입력받아,회원이라면 10% 할인을 적용하고,
		그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true/ 없으면 false 입력 ): ");
		boolean membership = sc.nextBoolean();
		
		double total = (membership == true) ? price * 0.90 : price*0.95;
		//할인율 : 가격 - 할인가로 계산 
		//discount = ismember ? totalprice*0.10: totalprice*0.05
		//최종가격 = totalprice - discount
		
		System.out.println("할인을 포함한 최종금액 : " + total +"원");
		
		
	}
	
	public void practice6() {
		
		/* ATM에서 사용자가 원하는 금액을 입력하면,
		 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
		ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 
		5천원 지폐 0장, 1천원 지폐 3장이 필요함 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력: ");
		int price = sc.nextInt();
		
		System.out.println("50000원 :" +price/50000 );
		
		
		System.out.println("10000원 :"+ (price%50000 )/10000);
		
		int fifty =(price%50000)%10000; 
		
		System.out.println("5000원 : " + fifty/5000);//모르겟다
		
		System.out.println("1000원 :" + ((price %10000)%5000)/1000);
		
		
		
		/* 선생님 코드
		int fiftyTh = price/50000;//오만원 짜리 갯수
		price = price % 50000;//오만원짜리 지폐 거르고 난뒤 나머지 금액//나머지값을 재대입해야 아대다음지폐에서 재사용
		price %= 50000;//복합대입 연산자
		
		int tenTh = price/10000 //만원짜리 갯수 
		price %= 10000;
		
		int fiveTh = price / 5000;
		price %= 5000;
		
		int oneTh = price /1000;
		아랫단위가 없어서 %모듈러는 여기서 멈춤
		돈 더있으면 그때는 더 나눠야햄
			System.out.println("50000원 :" +fiftyTh);	
			System.out.println("10000원 :" +tenTh);	
			System.out.println("5000원 :" +fiveTh);	
			System.out.println("1000원 :" +oneTh);	
		 */
		
		
	}
	
	public void practice7() {
		/*사용자로부터 두 개의 정수를 입력받아, 
		첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
		만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 :");
		int num2 = sc.nextInt();
		
		//첫번째수가 두번째 수로 나누어 떨어진다는 뜻
		//나머지가 0이라는 뜻
		String result =num1%num2==0 ?"배수입니다.":"배수가 아닙니다.";
		System.out.println(result);//첫번째수가 두번째수의 배수인지 확인하는
		
	}
	
	
}
