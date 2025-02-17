package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {//기능제공용 , 메서드만 만들거임
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		//1~10까지 콘솔에 출력하기
		for(int i =1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public void ex2() {
		//영어 알파벳 a~z한줄로
		
		for(int i = 'A' ; i<='Z' ;i++) {
			//char->int로 자동형변환
			//System.out.printf("%c",i);
			//System.out.print(i);//65부터~90까지
			System.out.print((char)i);//강제 형변환	
		}
		System.out.println("\n=========================");
		for(char i ='A';i<='Z';i++) {
			System.out.print(i);			
		}
	}
	public void ex3() {
		//1부터 입력받은수까지 1씩증가하며 출력
		System.out.print("어디 까지 출력할까요? : ");
		int input = sc.nextInt();
		for(int i =1;i <= input;i++) {
			System.out.println(i);
		}
	}
	public void ex4() {
		//정수 5개를 입력받아서 합계 구하기
		int sum = 0;//합계 저장용 변수
		
		for(int i = 1 ; i <=5 ; i++) {
			System.out.printf("입력 %d :",i);
			int input = sc.nextInt();
			
			//sum에 입력 받은 input값 누적
			sum += input;//sum = sum+input
		}
		
		System.out.printf("합계 : %d",sum);
	}
	public void ex5() {
		//1부터 20까지 1씩 증가하면서 출력
		//단 입력 받은 수의 배수는 양쪽에 ()표시 

		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for(int i=1;i<=20;i++) {
			
			if(i%input==0) {//배수
				System.out.printf("(%d) ",i);
			}else {//배수 아닐때
				System.out.print(i+" ");
			}
		}
	}
	public void ex6() {
		System.out.print("2 ~ 9사이의 숫자를 입력해주세요 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 &&dan<=9) {//2~9단
			for(int i =1 ;i<=9;i++) {
				System.out.printf("%d X %d = % d\n",dan,i,dan*i);
			}
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	public void ex7() {
		//1부터 20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 합계 출렵
		//필요한 변수가 뭐뭐 있을까
		//카운트라는 변수의 갯수
		int count =0;//n의 배수의 갯수를 세기위한 변수//count++;
		int sum = 0; //n의 배수의 합계를 구하기 위한 변수
		String result= "";//내가 입력한n의 배수 를 출력할 문자열
	
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for(int i =1;i<=20;i++) {
			
			if(i%input ==0) {//배수일때 
				result += i+" ";//"3"
				count ++;//갯수세기
				sum += i;//합계 누적
			}
		}
		System.out.printf("%s :%d개 \n",result,count);
		System.out.printf("%d의 배수의 합계 : %d",input,sum);
	}
	public void ex8() {
		//구구단 전부 출력
		for(int dan =2; dan<=9;dan++) {//2단~9단
			for(int num= 1;num<=9;num++) {//각단에 곱해질수 1~9
				System.out.printf("%d X %d = %2d ",dan,num,dan*num);
			}
			System.out.println();
		}
	}
	public void ex9() {
		for ( int dan = 9 ; dan >= 2;dan--) {
			for(int num =1;num <=9;num++) {
				System.out.printf("%d X %d = %2d ",dan,num,dan*num);
			}
			System.out.println();
		}
		
	}
	public void ex10() {
			//1부터 20까지 1씩 증가하면서
				//입력받은 수의 배수의 총 개수 출력
				//입력받은 수의 합계 출렵
				//필요한 변수가 뭐뭐 있을까
				//카운트라는 변수의 갯수
		
		System.out.print("숫자를 입력해주세요.");
		int input =sc.nextInt();
		int sum =0;
		int count =0;
		
		
		for(int i =1; i<=20 ;i++) {
			
			if(i%input==0) {
				count ++;
				sum = sum+i;
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.printf("%d의 배수의 갯수는 : %d" ,input,count);
		System.out.println();
		System.out.printf("%d의 배수의 합계 : %d \n",input,sum);
	
	}
	
	
	}	
