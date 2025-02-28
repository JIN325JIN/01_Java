package homework;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
			
			
	public void practice1() {
		
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		
		if(input<=0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
		for (int i =1; i<=input;i++) {
			System.out.print(i+" ");
		}
	}

	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		
		if(input<=0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
		for(int i = 0; i<input;i++) {
			System.out.print(input-i +" ");
		}
		
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i =1; i<=input;i++) {
			
			if(i==input) {
				System.out.print(i);
			}
			else {
			System.out.print(i +"+");
			}
			sum = sum+i;
		}
		System.out.print("="+sum);
	}
	
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
	
		if(num1>0&&num2>0) {
			if(num1>num2) {
				for(int i =num2 ;i<=num1;i++) {
					System.out.print(i+" ");
					}
			}else if(num2>num1) {
				for(int i =num1; i<=num2;i++ ) {
					System.out.print(i+ " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	
	}
	public void practice5() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		
		for(int i=1 ;i<=9;i++) {
			System.out.println(input+"*"+i+ "="+ input*i);
		}
		
		
	}






}
