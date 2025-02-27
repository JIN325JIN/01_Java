package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExceptionService {

	// 예외: Exception :소스 코드의 수정으로 해결 가능한 오류
	// 런타임에러 , 컴파일 에러

	// 예외는 두종류로 구분

	// 1. Unchecked Exception : 선택적으로 예외처리 (ex.Runtime Exception)

	// 2. Checked Exception : 필수적으로 예외처리 (ex.IOException,나머지..)

	private Scanner sc = new Scanner(System.in);
	// if문 예외처리 +try catch

	public void ex1() {
		// 두 정수를 입력 받아 나누기한 몫 출력
		System.out.print("첫번째 정수 입력 : ");
		int input1 = sc.nextInt();// InputMismatchException
		// int형이 아닌 다른 자료형을 대입 했을때

		System.out.print("두번째 정수 입력 : ");
		int input2 = sc.nextInt();// InputMismatchException

		if (input2 != 0) {

			System.out.println("결과 :" + input1 / input2);// ArithmeticException: / by zero
			// input2에 0이 들어왔을때 0으로 나눌수 없다. //산술적 예외 발생

		} else {
			System.out.println("infinity");
		}
		// ----------------------------------------------------------------------------------------
		try {
			// 예외가 발생 할것같은 코드

			System.out.println("결과 :" + input1 / input2);

		} catch (ArithmeticException e) {
			// try에서 던져진 예외를 catch문에 매개변수 e로 잡았다 라는 의미.
			// e를 사용하여 예외 추적 코드 작성 할 수도 있음.
			System.out.println("infinity");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력.
			// 예외 발생 지점 추적 메서드

		}

		// 발생하는 예외 중 일부 예외 try-catch 사용 안해도
		// if - else 예외 상황 방지 가능
		// 일부 예외 == 대부분 Unchecked Exception

	}

	// try - catch 여러개
	public void ex2() {
		try {
			System.out.print("첫번째 정수 입력 : ");
			int input1 = sc.nextInt();// InputMismatchException
			// int형이 아닌 다른 자료형을 대입 했을때

			System.out.print("두번째 정수 입력 : ");
			int input2 = sc.nextInt();// InputMismatchException

			System.out.println("결과 :" + input1 / input2);// ArithmeticException: / by zero
			// input2에 0이 들어왔을때 0으로 나눌수 없다. //산술적 예외 발생

			String str = null;
			System.out.println(str.charAt(0));

			// InputMismatchException,ArithmeticException 둘다 RuntimeException의 후손
			// RuntimeException은 Exception 후손
			// Exception
			// ㄴ RuntimeException
			// ㄴ InputMismatchException,ArithmeticException

		} catch (InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (RuntimeException e) {
			System.out.println("잡았다.");

		} catch (Exception e) {

			// Exception 클래스 : 모든 예외의 최상위 부모.
			// 다형성 - 업캐스팅 : 모든 예외를 다 캐치할수 있음.
			// 부모 타입 참조 변수로 자식 객체 참조

			// Exception e = new RuntimeException();같은거임

			// 상위 타입의 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모두 잡아서 처리 가능 !!
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함..");
			e.printStackTrace();// 알고싶으면 추적해라.
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력.
		}

	}

	// try-catch-finally
	public void ex3() {
		// try - catch - finally
		// finally : try catch :구문에서 예외가 발생 하든 말든 무조건 마지막에 수행

		try {

			System.out.print("첫번째 정수 입력 : ");
			int input1 = sc.nextInt();// InputMismatchException
			// int형이 아닌 다른 자료형을 대입 했을때

			System.out.print("두번째 정수 입력 : ");
			int input2 = sc.nextInt();// InputMismatchException

			System.out.println("결과 :" + input1 / input2);// ArithmeticException: / by zero
			// input2에 0이 들어왔을때 0으로 나눌수 없다. //산술적 예외 발생

		} catch (ArithmeticException e) {
			System.out.println("산술 적 예외가 처리가 됨");
			// 매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			System.out.println(e.getClass());// 어떤 예외 클래스 인가?

			System.out.println(e.getMessage());// error와 exception의 부모님
			// 에러 메세지 출력 (예외 발생시 출력된 내용)

			System.out.println(e);// e.toString

			e.printStackTrace();// 종합적으로 다 보여줌
		} catch (InputMismatchException e) {
			System.out.println("숫자만 넣어라.");
		} finally {
			System.out.println("무조건 수행됨");
			sc.close();// 스캐너 통로 닫기 : 메모리 누수 방지
		}

	}

	// throw 사용
	public void ex4() {

		try {
			methodA();

		} catch (IOException e) {// 부모님인 exception으로 해도 됨.
			System.out.println("method C에서 부터 발생한 예외를 ex4에서 잡아 처리함");
		}

	}

	public void methodA() throws IOException {
		methodB();
	}

	public void methodB() throws IOException {// Exception이여도 됨
		methodC();
	}

	public void methodC() throws IOException {// c가 b한테 던짐
		// throws :호출한 메서드에게 예외를 던진다.
		// ->호출한 메서드에게 예외 처리를 하라고 위임하는 행위

		// throw : 예외 강제 발생 구문
		throw new FileNotFoundException();// 체크드 익셉션이라서 꼭 예외처리 해주어야함
	}

	public void ex5() throws UserException {
		// 사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("짠!");// checked exception : 반드시 예외처리를 해야함
	}

}
