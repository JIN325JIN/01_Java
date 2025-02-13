package edu.kh.op.practice;

import java.util.Scanner;
//연산자 실습문제 1
//기능제공용
public class OperatorPractice {

	public void practice1(){
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 인원 수와 사탕 개수를 키보드로 입력 받고
         1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.*/
		
	Scanner sc = new Scanner(System.in);
	System.out.print("인원수 : ");
	int stu =sc.nextInt();
	System.out.print("사탕 개수 : ");
	int candy =sc.nextInt();
	
	System.out.println("1인당 사탕 개수 : "+ (candy / stu));
	System.out.println("남은 사탕 갯수 : "+ (candy % stu) );
	
	}
	
	public void practice2() {
		/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을
		화면에 출력하여 확인하세요.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int num = sc.nextInt();
		
		System.out.print("반 : ");
		int room = sc.nextInt();
		
		System.out.print("번호 : ");
		int snum = sc.nextInt();
		
		sc.nextLine();//입력버퍼 비우는 일 (개행문자 비우기)
		
		System.out.print("성별(남학생/여학생) : ");
		String sex = sc.nextLine();//nextLine 쓰려면 개행문자비우기 필요
									//아니면 그냥 sc.next()사용
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",
				num,room,snum,sex,name,score);
		
	}
	
	public void practice3() {
		
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
         세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (korean+english+math); 
		double average = sum / 3.0 ;//자동 형병환
		
		System.out.printf("합계 : %d \n",sum);
		System.out.printf("평균 : %.1f \n",average);//%.1f가 소수1째자리
		
		
		/*각과목이 40점 이상이고 평균 60점 이상이어야 합격 그외 불합격*/
		
		Boolean result = (korean>=40) && (english>=40) && (math>=40) &&(average)>=60;
		System.out.println(result ? "합격" : "불합격") ;
		
	}
	
}
