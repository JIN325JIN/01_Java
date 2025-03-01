package homework;

import java.util.Scanner;
//스터디 과제 
public class LoopPractice {

	Scanner sc = new Scanner(System.in);
			
			
	/**
	 * 1부터 입력까지의 숫자 출력
	 */
	public void practice1() {
		
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input<=0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		for (int i =1; i<=input;i++) {
			System.out.print(i+" ");
		}
	}

	/**
	 * 1부터 입력까지의 숫자를 거꾸로 출력
	 */
	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input<=0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		for(int i = 0; i<input;i++) {
			System.out.print(input-i +" ");
		}
	}
	
	/**
	 * 1부터 입력까지의 합 출력
	 */
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i =1; i<=input;i++) {
			if(i==input) {
				System.out.print(i);
			}
			else {
			System.out.print(i +"+");
			}
			sum = sum+i;
		}
		System.out.print("="+sum);
	}
	
	/**
	 * 숫자 두개 입력받아서 중간수 출력
	 */
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
	
		if(num1>0&&num2>0) {
			if(num1>num2) {
				for(int i =num2 ;i<=num1;i++) {
					System.out.print(i+" ");
					}
			}else if(num2>num1) {
				for(int i =num1; i<=num2;i++ ) {
					System.out.print(i+ " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	
	}
	
	/**
	 * 입력받은 구구단 출력
	 */
	public void practice5() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.printf("====%d단====\n",input);
		for(int i=1 ;i<=9;i++) {
			System.out.println(input+"*"+i+ "="+ input*i);
		}
	}
	
	/**
	 * 입력받은 단부터 9단까지 출력
	 */
	public void practice6() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		if(input<2&&input>9) {
			System.out.println("2~9사이 숫자만 입력해주세요.");
		}else {
			for(int i =input;i<=9;i++) {
				System.out.printf("====%d단====\n",i);
					
					for(int j=1;j<=9;j++) {
				
						System.out.printf("%d * %d = %d\n" ,i,j,i*j);
					}
				}
			}
	}
	
	/**
	 * 별찍기 기본
	 */
	public void practice7() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		for(int i =0; i<input;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 별찍기 거꾸로
	 */
	public void practice8() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		for(int i=0 ;i<input;i++) {
			for(int j =0 ;j< input-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 별찍기 오른정렬
	 */
	public void practice9() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");//공백 삼각
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 별찍기 다이아몬드 절반
	 */
	public void practice10() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
			for(int i= 1;i<=input;i++) {//최대로 넓어지는 위에삼각
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}	
				System.out.println(" ");
			}
			for(int i=1;i<input;i++) {//아래삼각은 하나 적어서 =이 없음
				for(int j= 1;j<=input-i;j++) {
					System.out.print("*");
				}
				System.out.println(" ");
				}
	}

	/**
	 * 별찍기 피라미드
	 */
	public void practice11() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		for(int i = 1;i<=input;i++) {
			for(int j =1;j <=input-i;j++) {//공백 삼각
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {//2n+-1이라는 규칙 발견
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 별찍기 사각형
	 */
	public void practice12() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		//윗줄
		for(int i =1; i<=input;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i =1;i<=input-2;i++) {
			for(int j =1;j<=1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=input-2;j++) {//공백
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++) {
				System.out.println("*");
			}
		}
		//아랫줄
		for(int i =1; i<=input;i++) {
			System.out.print("*");
		}
	}
	
	/**
	 * 공배수
	 */
	public void practice13() {
		System.out.print("자연수를 하나 입력하세요 :");
		int input = sc.nextInt();
		int count=0;
		for(int i =1; i<=input;i++) {
			if(i%2==0||i%3==0) {//그냥 배수
				System.out.print(i+" ");
			}
			if((i%2==0)&&(i%3==0)) {
				count =count+1;//공배수일때 카운트+1
			}
			
		}
		System.out.println();
		System.out.println("count :"+count);
		
		
	}
}
