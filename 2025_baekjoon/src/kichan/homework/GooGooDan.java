package kichan.homework;

import java.util.Scanner;

public class GooGooDan {

	
	public void googoodan() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 =0;
		int num2 =0;
		
		
		System.out.println("숫자 두개를 입력해주세요.");
		num1 = sc.nextInt();//몇단까지
		num2 = sc.nextInt();//한줄에 몇개?
			
		//겉 포문
		//안에 포문 num2까지 개행
		//그안에 포문
		
		
		for(int i =1 ;i<=9;i++) {
			
			for(int k = 1; k <= num2;k++) {
				
				for(int j = 1;j<=9;j++) {
				
				System.out.printf("%d * %d = %d     ",i,j,i*j);
			}
				for(int j = 1;j<=num2;j++) {
				System.out.printf("%d * %d = %d     ",i,j,i*j);
				}
			
			System.out.println("\n");
		
			}
	}
	}
	
	
}
