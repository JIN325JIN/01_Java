package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		//sc.next() :  다음 입력된 한 단어를 읽음 공백(탭,스페이스)만나면
		//입력을 중단함
		//sc.nextLine() :다음 입력된 한 줄을 읽어옴, 공백과 함께 입력된 모든 내용을 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 1을 입력해주세요 : " );
		String input1 = sc.nextLine();
		System.out.print("문자열 2를 입력해주세요 : " );
		String input2 = sc.nextLine();
		System.out.print("문자열 3을 입력해주세요 : " );
		String input3 = sc.nextLine();
		
		
		System.out.printf("%s %s %s \n",input1,input2,input3);
			
	}

}
