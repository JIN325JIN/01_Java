package jin;

import java.util.Scanner;

public class ConditionPractice {
//여기서는 메서드를 만들더라
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice2() {
		System.out.print("국어점수 :");
		int korean = sc.nextInt();
		System.out.print("수학점수 :");
		int math = sc.nextInt();
		System.out.print("영어점수 :");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double average = sum/3.0;
		
		
		if(korean>=40 && math >=40 && english>=40&&average>=60) {
			System.out.println("국어 :" +korean);
			System.out.println("수학 :" +math);
			System.out.println("영어 :" +english);
			System.out.println("합계 :" +sum);
			System.out.println("평균 :" +average);
			System.out.println("축하합니다.합격입니다!");
		}else {
			System.out.println("불합격 입니다.");
		}
		
		
	}

	public void practice3() {
		System.out.print("1~12사이의 정수입력 :");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3: case 5:case 7: case 8: case 10: case 12: 
			System.out.printf(" %d월은 31일 까지 있습니다.",month);
		break;
		case 2:System.out.printf(" %d월은 28일 까지 있습니다.",month);
		break;
		case 4: case 6: case 9: case 11:
			System.out.printf(" %d월은 30일 까지 있습니다.",month);
		break;
		default:System.out.printf(" %d월은 잘못입력된 달입니다.",month);
		}
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해 주세요. :");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요.");
		double weight = sc.nextDouble();
		
		double bmi = weight /(height*height);
		
		String result = null;
		if(bmi>=30) {
			result = "고도비만";
		}else if (bmi>=25&&bmi<30) {
			result = "비만";
		}else if (bmi>=23&&bmi<25) {
			result = "과체중";
		}else if (bmi>=18.5&&bmi<23) {
			result = "정상체중";
		}else if (bmi<18.5) {
			result = "저체중";
		}
		System.out.printf("BMI 지수 : %.14f \n",bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		System.out.print("중간 고사 점수 :");
		double midterm = sc.nextDouble();
		System.out.print("기말 고사 점수 :");
		double finalterm = sc.nextDouble();
		System.out.print("과제 점수 :");
		double homework = sc.nextDouble();
		System.out.print("출석 점수  :");
		double attend = sc.nextDouble();

		
	/*	중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을
		*/
		
		midterm *= 0.2;
		finalterm *= 0.3;
		homework *= 0.3;
		double total = midterm +finalterm +homework +attend;
		
		System.out.println("====결과====");
		if(attend>=14) {//출석조건 => 20일중에 30%결석 = 14일 이상 나와야해
					System.out.printf("중간고사 점수(20) : %.1f \n",midterm);
					System.out.printf("기말고사 점수(30) : %.1f \n",finalterm);
					System.out.printf("과제 점수(20) : %.1f \n",homework);
					System.out.printf("출석 점수(20) : %.1f \n",attend);
					System.out.printf("총점 : %.1f \n",total);
				if(total>70) {
					System.out.println("PASS");
				}else {
					System.out.println("FAIL [점수미달]");
				}
		}else {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]",(int)attend);
			}
	}
	
	public void practice6() {
		// 달 입력 받아서 해달달의 맞는 계절 출력
				// 1,2,12 겨울 (-15도이하"한파경보",-12도이하 한파주의보)
				// 3-5 봄
				// 6-8여름 35이상 폭염경보,33도 이상 폭염주의보
				// 9-11가을
				// 1-12사이가 아닐땐 해당하는 계절 없다
		System.out.print("달을 입력해주세요.");
		int month = sc.nextInt();
		
		String season ;
		
		if(month==1||month==2||month==12) {
			season = "겨울";
			
			System.out.print("온도를 입력해주세요.:");
			int temp = sc.nextInt();
			
				if(temp<=-15) {
					season += "한파경보";
				}else if(temp<=-12) {
					season += "한파주의보";
				}
		}else if (month==3||month==4||month==5) {
			 season ="봄";
		}else if (month==6||month==7||month==8) {
			 	season ="여름";
			 	System.out.print("온도를 입력해주세요.:");
			 	int temp = sc.nextInt();
			 	if(temp>=35) {
			 		season+="폭염경보";
			 	}else if (temp>=33) {
			 		season += "폭염 주의보";
			 	}
		else if(month==9&&month==10&&month==11) {
			 	season = "가을";
		}else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		System.out.println(season);
	}
}
			
}
