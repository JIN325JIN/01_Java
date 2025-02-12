package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		
		
		//system.out.println() : 한줄 출력용 메서드(출력후 줄바꿈수행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//system.out.print() :단순 출력용 메서드 (출력후 줄바꿈 X)
		System.out.print("테스트3");
		System.out.println();//개행
		System.out.print("테스트4");
		System.out.println();//개행
		
		
		
		//줄바꿈 여부의 차이는 있지만, ()안의 내용이 출력된다는 점은 같다.
		
		int iNum1=10;
		int iNum2=5;
		
		//10 + 5 =15 출력해보기
		System.out.println(iNum1 +"+" +iNum2+"="+(iNum1+iNum2));
		System.out.printf("%d+%d=%d\n",iNum1,iNum2,iNum1+iNum2);//줄바꿈
		//System.out.printf("패턴",패턴자리에 각각 들어갈 값/변수 나열)
		
		/*
		%d : 정수형, %o : 8진수, %x : 16진수
		%c : 문자, %s : 문자열
		%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		%A : 16진수 실수
		%b : 논리형*/
		
		//이스케이프문자(escape character):특별한 의미를 갖도록 하는 용도로 사용.
		
		//이거 출력해보기 10+10*5/2 =35
		System.out.printf("%d+%d*%d/2=%d\n",iNum1,iNum1,iNum2,(iNum1+iNum1*iNum2/2));
		
		//패턴연습 
		int iNum3 = 3;
		System.out.printf("%d\n",iNum3);
		System.out.printf("%5d\n",iNum3);//5칸 공간 확보를 한후 오른쪽 정렬 후 출력하고파
		System.out.printf("%-5d\n",iNum3);//5칸 공간 확보를 한후 왼쪽 정렬 후 출력하고파

		//소수점 자리 제어(반올림처리)
		System.out.printf("%f\n",10/4.0);//2.500000
		System.out.printf("%.2f\n\n",10/4.0);//소수점 둘째자리까지
		
		//문자,문자열 boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요~!";//참조형
	
		//false 가/안녕하세요 출력하고싶음
		System.out.printf("%b/%c/%s\n",isTrue,ch,str);
		//      \출력하기
		System.out.println("\\");//2개 쳐야지만 출력됨
		//\o/출력해보기
		System.out.println("\\o/");
		//tap : 한공간씩 표현, 한번에 공간차지
		System.out.println("a\tb\tc\td\t");
		
		//유니코드 이스케이프
		System.out.println("\u0041");
		//유니코드(16진수)
		//65를 16진수로 표현
		//65 나누기 15 = 몫 4 나머지 1
	}

}
