package jin;

import java.util.Scanner;

public class WhileExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input =9;
		
		while(input!=0) {
			
			System.out.println("====메뉴선택====");
			System.out.println("1.떡볶이");
			System.out.println("2.쫄면");
			System.out.println("3.김밥");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : >> ");
			 input = sc.nextInt();
			
			switch(input) {
			case 1: System.out.println("떡볶이를 주문하셨습니다.");
			break;
			case 2: System.out.println("쫄면을 주문하셨습니다.");
			break;
			case 3: System.out.println("김밥을 주문하셨습니다.");
			break;
			case 0 : System.out.println("프로그램을 종료합니다.");
			break;
			default: System.out.println("메류를 다시 골라주세요 .0~3까지의 숫자만 입력해주세요.");
			}
		}
	}
	public void ex2() {
		int input =0;
		int sum = 0;
		do{
			System.out.println("0이 되면 멈추지만 그외 정수는 합을 출력해드립니다 : ");
			input = sc.nextInt();
			sum+=input;
		}while(input!=0);
		System.out.println("입력된 정수의 합은 "+sum);
	}
}
