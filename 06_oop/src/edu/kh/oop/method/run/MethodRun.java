package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {

		
//		new MethodExample().method1();
//		MethodExample methodEx = new MethodExample();//8출력
//		
//		methodEx.method1();
		
		//메서드2 메서드 호출 LIFO
		//메서드1 메서드 호출
		//메인메서드 실행

		MemberService service = new MemberService();//회원가입 프로그램
		service.displayMenu();
	}

}
