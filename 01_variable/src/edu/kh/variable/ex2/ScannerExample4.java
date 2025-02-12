package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//nextInt() 사용한 후 nextline사용시 문제점
		
		System.out.println( "nextInt() 입력 : ");
		int intNum = sc.nextInt();//정수값 입력->정수값과 엔터(\n)가 입력버퍼에 들어갑니다
		//->nextInt()는 정수값만을(공백) 수집 -> 입력버퍼에는 \n만 덩그러니 남음
		
		sc.nextLine();//입력버퍼에 남은 개행문자 제거용
		
		System.out.println( "nextLine() 입력 : ");
		String word = sc.nextLine();//공백,개행 까지 읽을수 있음
		//입력버퍼에 남아있는 \n을 수집하고 끝.
		
		
	}

}
