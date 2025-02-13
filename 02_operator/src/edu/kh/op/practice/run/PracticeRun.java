package edu.kh.op.practice.run;

import edu.kh.op.practice.OperatorPractice;
import edu.kh.op.practice.OperatorPractice2;
import edu.kh.op.practice.OperatorPractice3;


//연산자 실습문제1
//실행용클래스

public class PracticeRun {

	public static void main(String[] args) {
		

		OperatorPractice op = new OperatorPractice();
		
		op.practice1();//사탕문제
		
		op.practice2();//학생정보
		
		op.practice3();//과목 평균
		
		OperatorPractice2 op2 = new OperatorPractice2();
		
		op2.practice4();//op2에서 참조한 practice4//노인미성년문제
		
		OperatorPractice3 op3 = new OperatorPractice3();
		
		op3.practice5();//마트 멤버쉽
		op3.practice6();//ATM 지폐 종류
		op3.practice7();//배수인지 아닌지 구분
		
	}

}
