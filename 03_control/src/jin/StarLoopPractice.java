package jin;

import java.util.Scanner;

public class StarLoopPractice {

	Scanner sc = new Scanner(System.in);
	public void ex1() {
		for(int i=0;i<5;i++) {
			
			for(int j =0;j<5;j++) {
				System.out.print("*");					
			}
			System.out.println();
		}
	}
	public void ex2() {
		
			for(int i=1;i<=5;i++) {
				for(int j =0;j<5;j++) {
					System.out.print(i);					
				}
			System.out.println();
		}
		
	}
	public void ex3() {
		for(int i = 1; i<=5;i++) {
			for(int j =i; j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex4() {
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex5() {
		
		System.out.print("* 몇개? ");
		int input = sc.nextInt();
		
		for(int i =1;i<=input;i++) {//줄
			
			for(int j = 1;j<=input-i;j++) {//스페이스
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {//별
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public void ex6() {
		System.out.print("별을 몇개 찍을거니 한샘아.");
		int input = sc.nextInt();
		
		
		for(int i=1;i<=input;i++) {
			
			for(int j = 1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int k= 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
}
