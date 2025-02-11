package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {

		/*자바의 기본 자료형 8가지
		 * 논리형 boolean (1바이트) 
		 * 정수형 byte(1바이트) short(2바이트) int (4바이트) long(8바이트)
		 * 실수형 float(4바이트) double (8바이트)
		 * 문자형 char (2바이트,유니코드 문자 체계) 
		 * 
		 * 참조형 - 문자형 String 
		 */
		
		//변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당 하는것.
		//변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		
		boolean booleanData;//변수 선언 ,메모리에 논리값 (true , fals)e를
							//저장할 공간을 1바이트로 할당하고 할당된 공간의 이름을 
							//booleanData라는 이름으로 부르겠다.
		booleanData = true ;//booleanData변수에 논리값 (true) 대입
		
		System.out.println("booleanData : " + booleanData);
		
		
		
		byte byteNumber = 127;//메모리에 정수값을 저장할 공간을 1바이트 할당하고 
							 //할당된공간을 byteNumber로 부르겠다.
							// 선언된 byteNumber 변수에 처음으로 (초기값) 127을 넣음
							//=> 초기화 : 처음 변수에 값을 대입
		System.out.println("byteNumber: " + byteNumber);
		
		short shortNumber = 32767;
		System.out.println("shortNumber: " + shortNumber);
		
		int intNumber = 2147483647;
		System.out.println("intNumber : "+intNumber);
		/*리터럴 : 변수에 대입되거나 작성되어지는 값 자체
		 *   자료형에 따라 리터럴 표기법이 다름.
		 */
		
		long longNumber = 100000000;//L or l
		System.out.println("longNumber : " + longNumber);
		//the literal 10000000 of type int is out of range
		//100억 이라는 값은 int의 범위를 벗어났다.
		//리터럴값 자체를 int로 인식하고 있다.
		//뒤에 L을 붙여줌으로써 long 자료형
		
		float floatNumber = 1.2345F;
		System.out.println("floatNumber : "+ floatNumber);
		//1.2345만 쓰면 double자료형으로 인식하기 때문에 변수타입인 float과 일치하지않아
		//type mismatch라는 에러 발생.
		
		double doubleNumber = 3.141592;
		System.out.println("doubleNumber : "+ doubleNumber);
		//double이 실수형중에 기본
		//리터럴 표기법 없는 실수는 double로 인식
		
		
		//문자형 (char) 리터럴 표기법 : '홑따옴표'
		//->문자하나
		char ch = 'A';
		System.out.println("ch : "+ch);
		char ch2 = 66;
		System.out.println("ch2 : " +ch2);
		
		/*char 자료형의 숫자가 대입될수 있는 이유 
		 * -컴퓨터에는 문자표가 존재 하고 있음
		 * 숫자에 따라 지정된 문자 모양이 각각 매핑이 되고
		 * 'B'문자 그대로 대입이 되면 변수에 숫자 66으로 변환되어 저장
		 * ->반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것도 가능하다.
		 * */
		
		int 정수1번 = 10;
		double 실수2번 = 3.14;
		
		System.out.println("정수1번:"+ 정수1번);
		System.out.println("실수2번:"+ 실수2번);//한글도 리터럴 가능하다.
		
		
		//-------------------------------------
		
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.33;//에러 final은 재대입 불가
		System.out.println(PI_VALUE);
	}
}
