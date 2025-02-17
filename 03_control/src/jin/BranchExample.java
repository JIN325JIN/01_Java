package jin;

import java.util.Scanner;

public class BranchExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		for(int i=1;i<=10;i++) {
			System.out.print(i +" ");
			if(i==5) {
				break;
			}
		}
		
	}
	public void ex2() {
		String str = "";//빈문자열
		
		while(true) {
			System.out.println("문자열 입력 : 단 exit@라고 입력시 종료.");
			String input = sc.nextLine();
			
			if(input.equals("exit@")) {
				break;
				//System.out.println(input);
			}
			str += input +"\n";
			
		}
		System.out.println("===================");
		System.out.println(str);
	}
	public void ex3() {
		for(int i =1;i<=10;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public void ex4() {
		for(int i=0;i<=100;i++) {
			
			if(i==40) {
				break;
			}
			
			if(i%5==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public void RSPGAME() {
		System.out.println("가위바위보게임을 시작하겠습니다~");
		System.out.print("몇판을 진행 할까요? : ");
		int round = sc.nextInt();
		
		int win =0;
		int draw =0;
		int lose =0;
		
		
		for(int i=1;i<=round;i++) {
			System.out.printf("%d 번째 라운드 ",i);
			System.out.print("가위 바위 보 중에 하나를 입력하세요.");
			String input = sc.next();
			
			
			
			int random = (int)(Math.random()*3+1);
			
			String com =null;
			
			switch(random){
			case 1: com ="가위";
			break;
			case 2: com ="바위";
			break;
			case 3: com ="보";
			break;
			}
			System.out.printf("컴퓨터는 [%s]를 냈습니다.",com);
			
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			}else {
				boolean win1 =input.equals("가위")&&com.equals("보");
				boolean win2 =input.equals("바위")&&com.equals("가위");
				boolean win3 =input.equals("보")&&com.equals("바위");
				
				if(win1||win2||win3) {
					System.out.println("내가 이김 V_V");
					win++;
				}else {
					System.out.println("내가 지다니 ㅠㅠㅠㅠㅠ");
					lose++;
				}
			}
			System.out.printf("%d승 %d무 %d패\n",win,draw,lose);
		}
	}

}
