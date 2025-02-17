package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	
	Scanner sc = new Scanner(System.in);
	
	/* while 문
	 * 별도의 초기식 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * 
	 * 확실히 얼마만큼 반복후에 끝날지는 모르지만
	 * 언젠가 반복 조건이 false가 되는 경우 반복 종료.*/
	
	public void ex1() {
	
		int input = 9;
		
		while(input != 0) {//input이 0이 아니면 무한반복,0이되면 반복멈춤
			
			System.out.println("====메뉴 선택====");
			System.out.println("1.떡볶이");
			System.out.println("2.쫄면");
			System.out.println("3.김밥");
			System.out.println("0:종료");
			
			System.out.print("메뉴선택 : >>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문하셨습니다.");
			break;
			case 2: System.out.println("쫄면을 주문하셨습니다.");
			break;
			case 3: System.out.println("김밥을 주문하셨습니다.");
			break;
			case 0: System.out.println("프로그램을 종료합니다.");
			break;
			default:System.out.println("메뉴를 잘못 고르셨습니다. 0~3번 까지의 숫자만 입력 가능합니다.");
			}
			
		}
	}
	public void ex2() {
		//입력되는 정수의 합 구하기
		//단 0이 되면 반복 종료후 결과 출력
		//0이 입력되지 않으면 무한 반복
		
		int input = 0;//입력받은 값을 저장할 변수
		int sum =0;//합계 저장
		
		do {
			
			System.out.print("정수를 입력 : ");
			input = sc.nextInt();
		
			sum += input;//sum = sum+input;
			
		}while(input!=0);
		System.out.println("입력된 정수의 합은 :" +sum);
		
		
		
		
		
	}

}
