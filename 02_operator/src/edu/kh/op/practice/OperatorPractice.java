package edu.kh.op.practice;

import java.util.Scanner;
//연산자 실습문제 1
//기능제공용
public class OperatorPractice {

	public void practice1(){
		
	Scanner sc = new Scanner(System.in);
	System.out.print("인원수 : ");
	int stu =sc.nextInt();
	System.out.print("사탕 개수 : ");
	int candy =sc.nextInt();
	
	System.out.println("1인당 사탕 개수 : "+ (candy / stu));
	System.out.println("남은 사탕 갯수 : "+ (candy%stu) );
	
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int num = sc.nextInt();
		System.out.print("반 : ");
		int room = sc.nextInt();
		System.out.print("번호 : ");
		int snum = sc.nextInt();
		System.out.print("성별 : ");
		String sex = sc.next();//입력할때 약간이상함
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
				num,room,snum,sex,name,score);
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (korean+english+math); 
		double average = (double)sum / 3.0 ;
		
		System.out.printf("합계 : %d \n",sum);
		System.out.printf("평균 : %.1f ",average);//%.1f가 소수1째자리
	
	}
	
}
