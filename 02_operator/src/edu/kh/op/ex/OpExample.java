package edu.kh.op.ex;

import java.util.Scanner;

//예제코드 작성용 클래스 (기능용,메서드용)

public class OpExample {

	//ex1() method : opExample이라는 클래스에 포함된 메서드가 된다
	public void ex1() {
		
		//증감(증가,감소) 연산자 : ++ ,--
		//1을 더하거나 감소시키는 연산자
		
		int iNum1 =10;
		int iNum2= 10;
		
		iNum1++;
		iNum2--;
		System.out.println(" iNum 1 : "+ iNum1);
		System.out.println(" iNum 2 : "+ iNum2);
		
		
		//전위 연산 
		int temp1 = 5;
		System.out.println("전위연산 : " + ((++temp1) + 5));//6+5
		
		
		//후위 연산
		int temp2 = 3;
		System.out.println("후위연산을 할건데요 :" +((temp2--) + 2));//3+2=5 -> 그다음에 안보이는곳에서 temp2가 2가됨
		System.out.println("temp2는 현재 : "+temp2);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//전위연산이 가장먼저 
		//3++ + --5
		//3++ + 4(b)
		//c=7
		//3++->4(a)
		
		//최종적으로 abc는 얼마로 출력되나요
		System.out.printf("%d / %d / %d \n" ,a,b,c);//4 4 7
		
	}
	public void ex2() {
		
		//비교 연산자 : > < >= <= == !=
		// - 비교 연산자의 결과는 항상 논리값이다 (true,false)
		
		int a = 10;
		int b = 20;
		
		System.out.println((a==b)== false);//(false) == false =>true
		
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c!=d));
		//                   5 != 5  =>c=5   4!= 5
		//                   false   ==     true
		//                            false
		
		System.out.println(100 > 99);//true
		System.out.println(100 >= 99);//true
		System.out.println(99 < 64 );//false
		System.out.println(99 <= 100);//true
	}
	public void ex3() {
		//논리 연산자 :  &&(AND), ||(OR)
		//&& (AND) :둘다 true 면 true 나머지는 false
		//와 ,그리고,~면서,~부터,~까지,~사이
		
		//ex)a는 100이상이면서 짝수인가? => ~이면서 
		int a=101;
		System.out.println((a>=100) && (a%2 ==0));
		//true && false 
		//false도출
		
		int b= 5;
		//b는 1~10까지 숫자 범위에 포함되어 있는가?
		//-> 1보다 크거나 같으면서 10보다 크거나같다
		System.out.println((b>=1)&&(b<=10));//true
		
		
		//||(OR) : 둘 다 false 면 false ,나머지 true
		//~또는,혹은,~거나
		
		int c = 10;
		//c는 10을 초과하거나 짝수인가?
		System.out.println((c>10)||(c%2==0));
		
		
	}
	public void ex4() {
	
	//삼항 연산자 : 조건식 ?true 일때 실행될값 :false일때 실행될 값
	//조건식 : 연산 결과가가 true/false 인 식
	
	int num = 30;
	
	//num이 30보다 크면 "num은 30보다 큰 수 이다."
	//아니면 "num은 30이하의 수이다 "출력
	
	String result =num>30 ?"num은 30보다 큰 수 이다.":"num은 30이하의 수이다 ";
	
	System.out.println(result);
		
	}
	public void ex5() {
		//입력받은 정수가 음수인지 양수인지 구분해라,
		//단 0은 양수로 처리해라
		//입력받은 -> scanner 생성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : \n");
		
		int input = sc.nextInt();
		String result2 = input >= 0 ?"양수입니다." : "음수입니다." ;
		System.out.println(result2);
		
	}
	
}
