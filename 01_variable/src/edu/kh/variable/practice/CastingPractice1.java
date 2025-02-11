package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1%iNum2 ); // 2 나누기 해도 되고 나머지 해도 되나
		
		System.out.println( (int)dNum ); // 2 double->int 강제형변환
		
		System.out.println( iNum2 * dNum ); // 10.0 //자동형변환
		
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (float)iNum1 /iNum2 ); // 2.5 ///float든 double이든 형변환
		
		System.out.println( dNum ); // 2.5
		
		System.out.println( (int)fNum ); // 3 //강제 형변환
		
		System.out.println( iNum1 /(int)fNum ); // 3
		
		System.out.println( iNum1/fNum );// 3.3333333
		//float : 소수점 아래 8번째 까지 연산 후 반올림
		//float : 23비트 까지만 저장할 수 있어서 근사값이 빨리 끊어지고 반올림 된다.
		//정밀도가 낮아서 마지막 값이 3으로 출력됨
		//float의 총 비트수 : 32비트 
		//->저장 방식 : 23비트 (가수) + 8비트 (지수) + 비트(부호)=32비트
		
		System.out.println( iNum1/(double)fNum ); // 3.3333333333333335
		//double : 소수점 아래 16번째 까지 연산 후 반올림(정밀도가 높다)
		//double은 52비트 까지 저장할 수 있어서 더 많은 자리수를 정확히 표현할 수 있다.
		//정밀도가 높다.
		//double 의 총 비트수 : 64비트
		//저장 방식 :52비트(가수) +11비트(지수) +1비트(부호)=64비트
		
		
		System.out.println( "'"+ch+"'" ); // 'A'
		
		System.out.println( (int)ch ); // 65-> int형으로 강제 형변환
		
		System.out.println( ch + iNum1 ); // 75 //자동형변환
		
		System.out.println( "'"+(char)(ch + iNum1)+"'"); // 'K'
		
	}
}
