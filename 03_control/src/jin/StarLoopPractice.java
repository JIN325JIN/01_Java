package jin;

import java.util.Scanner;

public class StarLoopPractice {

	Scanner sc = new Scanner(System.in);
	public void ex1() {
		for(int i=0;i<5;i++) {
			
			for(int j =0;j<5;j++) {
				System.out.print("*");					
			}
			System.out.println();
		}
	}
	public void ex2() {
		
			for(int i=1;i<=5;i++) {
				for(int j =0;j<5;j++) {
					System.out.print(i);					
				}
			System.out.println();
		}
		
	}
	public void ex3() {
		for(int i = 1; i<=5;i++) {
			for(int j =i; j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex4() {
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex5() {
		
		System.out.print("* 몇개? ");
		int input = sc.nextInt();
		
		for(int i =1;i<=input;i++) {//줄
			
			for(int j = 1;j<=input-i;j++) {//스페이스
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {//별
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public void ex6() {
		System.out.print("별을 몇개 찍을거니 한샘아.");
		int input = sc.nextInt();
		
		
		for(int i=1;i<=input;i++) {
			
			for(int j = 1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int k= 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
	public void ex7() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ;i<=input;i++) {
			for(int j=1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex8() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int i =1 ;i<=input;i++) {
			for(int j =i;j<=input;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex9() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<=input;i++) {//몇줄
			
			
			for(int j=i-1;j<input-1;j++) {
				System.out.print(" ");//공백삼각형
			}
			
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");//별 삼각형
			}
			
			System.out.println();
		}
	}
	public void ex10() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		
		for(int i =1 ;i<=input;i++) {//위에 삼각
			
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=input-1;i++) {//아래 삼각
			
			for(int j =i; j<=input-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
	public void ex11() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<=input;i++) {
			for(int j=i;j<=input-1;j++) {//왼쪽 공백삼각
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {//정삼각
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void ex12() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input-2 ;i++) {
			System.out.print("*");//위에뚜껑
			for(int j = 1;j<=input-2;j++) {
				System.out.print(" ");//안에 상자
			}
			System.out.print("*");//아래뚜껑
			System.out.println();
		}
		
		
	}
	public void ex13() {
		System.out.print("자연수 하나를 입력하세요.");
		int input = sc.nextInt();
		int count =0;
		for(int i=1;i<=input;i++) 
		{
			if(i%2==0||i%3==0) {
				
				System.out.print(i+" ");
				if(i%2==0&&i%3==0) {
					count ++;
				}
			
			}
			
		}
		System.out.println();
		System.out.println("count :" +count);
	}
}





