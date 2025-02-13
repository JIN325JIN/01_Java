package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	Scanner sc = new Scanner(System.in);// 변수선언//필드영역=멤버변수
	// 생성자영역
	// 메서드영역

	public void ex1() {
		// if문
		// 조건식이 true일때만 내부코드 수행
		// 입력받은 수가 정수인지 양수인지 검사 양수라면 "양수입니다."
		System.out.print("정수 입력 :");
		int input = sc.nextInt();

		if (input > 0) { // 단일 if문
			System.out.println("양수 입니다.");
		}
		if (input < 0) {
			System.out.println("음수 입니다.");
		}

	}

	public void ex2() {
		// if - else 문
		// 조건식 결과가 true면 if구문,false면 else구문
		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if ((input % 2) != 0) {
			System.out.println("홀수 입니다.");
		} else {// 짝수 또는 0
				// 중첩 if문
			if (input == 0) {
				System.out.println("0 입니다.");
			} else
				System.out.println("짝수 입니다.");
		}

	}

	public void ex3() {
		// if 조건식 - else if(조건식) - else
		// 양수인지 음수인지 영인지
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	}

	public void ex4() {
		// 달 입력 받아서 해달달의 맞는 계절 출력
		// 1,2,12 겨울 (-15도이하"한파경보",-12도이하 한파주의보)
		// 3-5 봄
		// 6-8여름 35이상 폭염경보,33도 이상 폭염주의보
		// 9-11가을
		// 1-12사이가 아닐땐 해당하는 계절 없다

		System.out.println("달을 입력해주세요 :");
		int month = sc.nextInt();
		// String season = null ;

		if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
			System.out.println("온도를 입력해주세요 : ");
			int temperature = sc.nextInt();

			if (temperature <= -15) {
				System.out.println("한파경보");
			} else if (temperature <= -12) {
				System.out.println("한파주의보");
			}
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");

			System.out.println("온도를 입력해주세요 : ");
			int temperature = sc.nextInt();

			if (temperature >= 35) {
				System.out.println("여름 폭염 경보");
			} else if (temperature > 33) {
				System.out.println("여름 폭염 주의보");
			}
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}

	public void ex5() {
		// 나이를 입력받아 13세 이하면 "어린이입니다"
		// 13초과 19이하 "청소년 입니다."
		// 19세 초과시 "성인입니다 출력"

		System.out.print("나이를 입력해주세요. :");
		int age = sc.nextInt();

		String result;// 결과감 담을 변수

		if (age <= 13) {
			result = "어린이입니다.";
		} else if (age <= 19) {
			result = "청소년입니다.";
		} else {
			result = "성인입니다.";
		}

		System.out.println(result);
	}

	public void ex6() {
		// 점수를 입력받아
		// 90점 이상 : A
		// 80점이상 90점 미만 B
		// 70점 이상 80점 미만 C
		// 60점이상70점미만 D
		// 60점 미만 F
		// 0점 미만 100점 초과 :잘못입력하였습니다.출력
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String result;

		if (score < 0 || score > 100) {
			result= "잘못입력하였습니다.";
		} else if (score >= 90) {
			result = "A";
		} else if (score >= 80 && score < 90) {
			result = "B";
		} else if (score >= 70 && score < 80) {
			result = "c";
		} else if (score >= 60 && score < 70) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println(result);

	}

	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0이상일 경우에만 탑승가능
		// 12세 미만 적정연령이 아니다
		// 140.0미만 적정키 아닙니다
		// 나이가 0세 미만 ,100세 초과시 잘못입력하셨습니다.

		System.out.print("나이 입력 :");
		int age = sc.nextInt();

		if (age < 0 || age > 100) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.print("키 입력 :");
			double height = sc.nextDouble();

			if (age < 12) {
				System.out.println("적정연령이 아닙니다.");
			} else if (height < 140.0) {
				System.out.println("적정키 아닙니다.");
			} else {
				System.out.println("탑승가능");
			}
		}
	}

	public void ex8() {
		// 놀이기구 탑승 제한 프로그램
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		if (0 > age || age > 100) {
			System.out.println("나이를 잘못 입력하셨습니다.");
		} else {// 나이를 잘 입력한 경우
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();

			if (height <= 0 || height >= 250.0) {
				System.out.println("키를 잘못 입력하였습니다.");
			} else {// 키가 정상 범주
				if (age < 12) {
					if (height > 140.0) {
						System.out.println("키는 적절하나,나이가 적절치 않음");
					} else {
						System.out.println("나이와 키 모두 적절치 않음");
					}
				} else {
					if (height < 140.0) {
						System.out.println("나이는 적절하나 키가 적절치 않음");
					} else {
						System.out.println("탑승 가능!");
					}
				}
			}
		}
	}

	public void ex9() {
		// switch
		// 여러케이스중 하나를 선택하여 수행하는 조건문
		// 요일 번호를 입력 (1-7):3->수요일

		System.out.print("요일 번호 입력 :");
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void ex10() {
		// 점수 입력 (0~100)
		// 학점 B
		// 점수 범위 벗어난건 생각 안함

		System.out.print("점수 입력 :");
		int score = sc.nextInt();

		switch (score / 10) {

		case 10:
		case 9:
			System.out.println("학점 : A ");
			break;
		case 8:
			System.out.println("학점 : B ");
			break;
		case 7:
			System.out.println("학점 : C ");
			break;
		case 6:
			System.out.println("학점 : D ");
			break;
		default:
			System.out.println("학점 : F ");

		}

	}
}
