package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		//형변환 : casting 값의 자료형을 변환 하는것 (단, boolean제외)
		/* 형 변환은 왜 필요한가? 
		 * 컴퓨터는 기본적으로 같은 자료형 끼리만 연산이 가능함
		 * 다른 자료형과 연산 시 오류 발생
		 * ->이런 상황을 해결하기 위해서 필요한 기술이 형변환.
		 * 
		 * 자동 형변환 / 강제 형변환
		*/
		
		//자동형변환예제
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1+num2));//13.5
		//원래는 에러가 발생해야하는데,int가 값의 범위가 적기 때문에 10.0으로 
		//double형으로 자동형변환이 되어서 
		
		//int->long 형변환 해보기
		int i2 = 2_10_000_000;//21억 //i2를 롱타입으로 변경 
		long l2 = 10_000_000_000L; //100억
		
		long result = i2 +l2;//long +long 
		
		System.out.println("int -> long 자동 형변환 결과 : " + result);
		
		
		//char ->int 형변환
		//char 자료형은 문자형이지만 실제 저장하는 값은 0~65000사이에 있는 숫자(정수형)
	
		char ch3= 'V';
		int i3 = ch3;
		System.out.println("char -> int 자동 형변환 결과 : "+ i3);//대문자V의 유니코드표
		
		
		char ch4= '각';
		int i4 = ch4; //long인지 int인지 모르겠다
		System.out.println("char -> int 자동 형변환 결과 : "+ i4);
	
	}

}
