package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//1~~10까지 1씩 증가하며 출력하는 반복문 작성
		//5를 출력하면 반복문 출력
		//1.2.3.4.5
		
		
		for(int i = 1;i<=10;i++) {
			
			
			System.out.print(i +" ");
			
			if(i==5) {
				break;
			}
			//System.out.print(i +" ");//이자리에 있으면 1234만출력
		}
	}
	public void ex2() {
		//입력받은 모든 문자열을 누적해라
		//단 exit@입력시 문자열 누적을 종료하고 결과 출력
		//횟수가 정해진게 아님
		
		//System.out.print("입력하실 문자를 입력해주세요.");
		String str = "";//빈 문자열 
	
		while(true) {
			
			System.out.print("문자열 입력(exit@라고입력시 종료.) :");
			String input = sc.nextLine();
			
			//next() : 다음 한 단어(공백포함 X)
			//nextLine() :다음 한 줄(공백 포함 O)
			
			//자바에서 문자열(string) 비교는 ==연산자 사용불가!
			//비교연산자(==)는 보통 기본자료형 끼리의 연산에서만 사용가능하다.
			//String은 기본 자료형이 아닌 참조형!!
			//문자열 1.exquals(문자열2)
			//문자열1과 문자열2가 서로 같으면 true/다르면 false반환
			
			if(input.equals("exit@")) {
				break;
			}
			str+= input +"\n";
		}
		System.out.println("========================");
		System.out.println(str);
	}
	public void ex3() {
		//다음 반복으로 넘어간다
		//1~10까지 1씩 증가하면서 출력
		//단 3의 배수는 제외하고 출력
		//1 2 4 5 7 8 10
		for(int i =1;i <=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public void ex4() {
		//1~100까지 1씩 증가 하며 출력하는 반복문 (for문)
		//단 5의 배수는 건너 뛰고 ( continue )
		//증가하는 값이 40이 되었을때 반복 멈춤
		for(int i =1 ;i<=100;i++) {		
			if(i==40) {
				break;
			}
			if(i%5==0) {//얘가 위에있으면 40도 5의 배수라서 계속함.
				continue;
			}
			System.out.print(i +" ");
		}
	}
	public void RSPGame() {
		//가위바위보 게임
		//몇판할지 입력받고 입력한 판수만큼 반복
		//math.random은 난수 생성 메서드: 0.0~1.0사이
		//1~3사이의 난수 생성.
		//1-가위 .2 바위 3보
		//컴퓨터와 플레이어 가위바위보를 판별
		//플레이가 이겼으면 플레이어 승!
		//지면 졌습니다 ㅠㅠ//비겼습니다
		//매판 마다 현재기록 -: 2승: 1무 : 0패 보여주기
		
		System.out.println("가위 바위 보 게임~!!");
		System.out.print("이승환 몇 판 하실 ㅋㅋ: ");
		int round = sc.nextInt();
		
		//승패 기록용 변수 
		int win = 0;
		int draw= 0;
		int lose =0;
		
		for(int i =1; i<=round;i++) {//몇판할지에 for문
			System.out.printf("\n%d번째 게임\n",i);
			System.out.print("가위 바위 보 중에 하나 입력 하삼: ");
			String input =sc.next();
			
			int random = (int)(Math.random()*3+1);//1<= x< 4=>1~3중에 하나 랜덤
			
			
			//switch 로 random값을 문자로 바꾸기
			String com = null;
			//null 은 아무것도 참조하고 있지않음.
			
			switch(random) {
			case 1 :com ="가위";
			break;
			case 2: com="바위";
			break;
			case 3: com ="보";
			break;
			}
			System.out.printf("윤진냥이는 [%s]를 선택했습니다.\n",com);
			
			//컴퓨터와 플레이어 가위바위보 판별
			//비긴경우
			if(input.equals(com)) {//비긴경우
				System.out.println("흥 비겼습니다.");
				draw++;
			}else{//이긴경우
				boolean win1=input.equals("가위")&&com.equals("보");
				boolean win2=input.equals("바위")&&com.equals("가위");
				boolean win3=input.equals("보")&&com.equals("바위");
				
				
				if(win1||win2||win3) {
					System.out.println("이승환 승!");
					win++;
				}
				else {//진경우
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			}	
			System.out.printf("%d승 : %d 무 : %d 패\n",win,draw,lose);
		}
	}
	public void ex5() {
		
		System.out.println("가위 바위 보 게임~~!!");
		System.out.print("몇판 하실 라우 :");
		int round = sc.nextInt();
		
		int win =0;
		int draw =0;
		int lose = 0;
		
		for(int i =1; i<=round;i++) {
			
			System.out.printf("%d번째 게임",i);
			System.out.println("가위 바위 보 중에 하나 입력하삼 :");
			String input = sc.next();
			
			int random = (int)(Math.random()*3+1);//1~3난수
			String com = null;
			
			switch(random) {
			
			case 1 : com = "가위";break;
			case 2 : com = "바위";break;
			case 3 : com = "보";break;
			
		//	System.out.printf("컴퓨터는 %s를 선택했습니다람쥐.",com);
			
			
			}
			
						
			
			System.out.printf("%d승 : %d 무 :%d 패\n",win,draw,lose);

			
			
		}
		
		
		
		
	}

}
