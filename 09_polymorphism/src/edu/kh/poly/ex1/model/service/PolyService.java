package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	
	//다형성 확인예제
	public void ex1() {
		
		//car 객체 생성
		Car car = new Car();//부모타입 참조변수 = 부모객체 주소
		
		//테슬라 객체 생성
		Tesla tesla = new Tesla();//자식타입 참조변수 = 자식 객체 주소
		
		//=> 여기까지 당연한것
		//여기서 부터 ===다형성 코드====
		//부모 타입 참조 변수 = 자식 객체 (업캐스팅)
		
		Car car2 = new Tesla();//오류 발생 안함
		//tesla 객체를 참조하는 변수(car2)의 타입이 car(부모타입)이기 때문
		//tesla 객체가 car(부모)타입 객체로 변화함.//
		//-> 다형성 중 업캐스팅 : 마치 부모인척.
		//대신 내 고유의 배터리 캐퍼시터 못씀
		
		
		Car car3 = new Spark();//spark객체를 참조하는 변수(car3)의 타입이 Car이기 때문에.
		//spark객체가 car객체로 변화함.
		//업캐스팅
		//카 인척 하느라 스파크 고유의 할인율 못씀.
		
	
		//1. 자식객체가 부모 객체로 변하였기 때문에 자식 만의 고유한 필드와 메서드를 사용할 수 없다.
		//1-1)car(부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		//car는 본인의 메서드 모두 사용 가능
		
		
		//1-2)tesla(자식=자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		//테슬라 부모, 본인의 메서드 모두 사용 가능.
		
		
		//1-3)car2= tesla(부모 = 자식)
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity(1000);//카타입에 정의되지않았다는 에러
		
		
		//1-4)car3= spark(부모 =자식)
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		//car3.setDiscountOffer(0.5);//카타입에 정의되지 않았다는 에러 뜸
		
		//=>car2,car3는 부모타입 참조변수 CAR이기 때문에 tesla,spark와 같은 자식객체의 고유필드, 메서드 사용불가.
		
		//===================================================================
		//2.다형성을 이용한 객체 배열
		//객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것 
		//다형성을 이용한 객체 배열 : 
		//부모타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		Car [] arr = new Car[3];//부모타입 참조변수 배열 선언 및 할당
		//각 요소 car 타입 참조변수
		
		arr[0] = car;//Car타입 주소
		arr[1] = car2;//부모인척 하는 테슬라//Tesla 주소
		arr[2] = car3;//부모인척 하는 스파크//Spark 주소
		
		
		for (int i =0; i< arr.length; i++) {
			System.out.println(i +"번째 인덱스의 엔진 :" + arr[i].getEngine());
		}
		//상속 + 다형성
		//상속 특징 : car 상속 클래스는 모두 getEngine()을 가지고 있다.
		//다형성(업캐스팅) : 부모타입 참조 변수 arr[i] 로 자식 객체를 참조 할 수 있다.
		
	}
	//전달 받은 car또는 자식객체 (tesla,spark)의 엔진,연료 바퀴갯루를 출력하는 메서드
	public void printCar(Car temp) {
		
		//car temp = c
		//car temp =s :상속관계 이니까
		//car temp = t : 상속관계이니까
		//부모타입 참조 변수인 temp에 자식타입 객체 : 다형성의 업캐스팅 모양과 똑같다
		//-> temp라는 car타입 매개변수 에는 Car,Tesla,Spark의 주소가 참조 되어도 된다.
		System.out.println("엔진 :" + temp.getEngine());
		System.out.println("연료 :" + temp.getFuel());
		System.out.println("바퀴 :" + temp.getWheel()+ "개" );
		System.out.println();
	}
	
	//매개변수로 전달 받은 정수 값에 따라 Car,Tesla,Spark객체를 만들어 반환하는 메서드
	public Car createCar(int num) {
		
		Car result = null;
		switch(num){
			case 1: result = new Car();
			break;  
			case 2: result = new Tesla();
			break;	
			case 3: result = new Spark();
			break;
		}
		return result; 
	}
	
	//다형성 (업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {
		Tesla t = new Tesla("전기모터","전기",4,1000000);
		Spark s = new Spark("경차엔진","휘발유",4,0.5);
		Car c = new Car("경유엔진","경유",12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		
		System.out.println("===========================");
		//다형성을 이용한 반환형 사용법
		//Car [] arr = {new Car(), new Tesla(), new Spark()};
		
		
		Car[] arr  = {createCar(1),createCar(2),createCar(3)};
						//Car        Car(tesla)    Car(Spark)
		
		
		//객체가 어떤 타입 자료형인지 검사 
		//instance of 연산자 : 객체의자료형을 검사하는 연산자
		//-> 참조하는 객체가 특정 자료형이거나 상속관계 인지 확인 
		System.out.println(arr[1] instanceof Tesla); //true (자기 본인 맞음)
		System.out.println(arr[1] instanceof Spark); //false(카 타입 테슬라 객체와 스파크는 관계 없음)
		System.out.println(arr[1] instanceof Car); //true (테슬라 객체와 카타입은 상속관계)
		
	}
	
	//다형성 중 다운캐스팅 확인 예제
	public void ex3() {
		//다운캐스팅 이란?
		//부모타입 참조변수가 자식 객체를 참조하는 기술 (업캐스팅) 적용된 상태에서만 진행 할 수 있다.
		//부모타입을 자식타입으로 "강제 형변환" 해서 자식 객체의 본래 필드, 메서드를 사용 가능하게 한다.

		Car c1 = new Tesla("전기모터","전기",4,50000);//업캐스팅 상태
		//테슬라 타입인 자식객체가 마치 car타입인 부모인척 하는 중임.
		
		System.out.println(((Tesla)c1).getBatteryCapacity());
		//주의: "."연산자 Tesla 형변환 하는 연산자보다 우선순위 높음
		//그래서 형변환 하는 부분을 () 로 한번 묶어주고 나서 . 연산을 진행해야 Tesla객체의 getBatteryCapacity 이용 가능
		
		Tesla t1 = (Tesla)c1;//강제 형변환
		System.out.println(t1.getBatteryCapacity());//위에랑 똑같음
	}
	//다운 캐스팅 주의사항!!!!
	public void ex4() {
		Car c1 = new Tesla();
		//tesla객체를 만들어 car 타입 참조변수 c1에 담음

		//Spark s1 = (Spark)c1;//c1을 관계없는 spark로 다운 캐스팅 하려고 함
		//다운 캐스팅 잘못해도 컴파일 에러 발생 안함
		//-> 실행시 발생 (런타임 에러)
		//ClassCastException : 형변환 예외. 에러.
		
		//해결방법 : instanceof 연산자와 같이 사용하면 된다.
		//예외 처리 
		if( c1 instanceof Spark) {// c1이 spark이거나 상속관계 인가?
			//맞다
			Spark s1 = (Spark)c1;
			System.out.println("다운 캐스팅 성공!");
			
		}else {
			//아님
			System.out.println("실패 ! Spark 타입 / 상속 관계 아님");
		}
	}
	//바인딩 확인 예제
	public void ex5() {
		//바인딩 (binding): 실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것 
		
		Car c1 = new Car("경유엔진","경유",8);//평범한 car 객체
		System.out.println(c1.toString());
		//Car 객체에 있는 tostring() 메서드를 호출
		//프로그램 "실행 전"
		//컴파일러는 to String() 메서드가 car에 있는 걸로 인식해서 c1.tostring호출 코드와 메서드가 정의된 코드를 연결하는 행위
		//-> 정적 바인딩 
		
		
		//***다형성 적용시 바인딩***
		Car c2 = new Spark("경차엔진","휘발유",4,0.5);//업 캐스팅 적용된 상태
		System.out.println(c2.toString());// edu.kh.poly.ex1.model.dto.Car.toString ()로 인식
		//참조 변수 c2가 car 타입이므로 toString 호출코드와 car의 tostring메소드 코드를 연결
		//=> 정적 바인딩
		
		//실행해보면 자식인 Spark의 toString()이 호출되는것을 확인
		//경차엔진/ 휘발유 / 4/0.5
		//->컴파일 시에는 부모타입인 CAR와 바인딩 == 정적 바인딩
		//-> "실행시 "에는 정적 바인딩 보다 자식 (spark)에서 오버라이딩된 to String()메서드가 우선시 되어 spark 메서드와 바인딩 ==동적 바인딩
		
	}
}
