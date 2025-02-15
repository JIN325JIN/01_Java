package jin;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

//구현하는곳
public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		else {
			for(int i =1;i<=input;i++) {
				System.out.print(i+" " );
			}
		}
	
	}	
	public void ex2() {
		System.out.print("1이상의 숫자를 입력하세요:");
		int input = sc.nextInt();
		
		if(input>=1) {
			for(int i =1;i<=input;input--) {
				System.out.print(input +" ");
			}
		}
		else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
		
		
		//if(input>1) {
			//for(int i=input;i<=1;i--) {
				//System.out.print( i);
				//}}
		//else{
			//System.out.println("1이상의 숫자를 입력해주세요.");
		//	}
		
	}
	public void ex3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input>1) {
			for(int i=input;i>=1;i--) {
				System.out.print( i +" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력헤주세요.");
		}
	}
	public void ex4() {
		System.out.print("정수를 하나 입력하세요 :");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i<=input ;i++) {
			sum += i;
			if(i==input) {
				System.out.print(i+"=");
			}
			else {
				System.out.print(i+ "+");
			}
		}System.out.print(sum);
	}
	public void ex5() {
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		if(num1>1 &&num2>1) {
			if(num1>num2) {
				for(int i = num2 ;i<=num1;i++) {
					System.out.print(i+" ");
				}
			}else if(num2>num1) {
				for(int i = num1; i<=num2;i++) {
					System.out.print(i+" ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
		
	}
	public void ex6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("====%d====\n",dan);
		for(int i =1 ;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	public void ex7() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan>9||dan<2) {
			System.out.println("2~9사이의 숫자만 출력해주세요.");
		}else {
			for(int i =dan ;i<=9;i++) {
				System.out.printf("====%d단====\n",i);
				for(int j = 1;j<=9;j++) {
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
			}
		}
	}
	public void ex8() {
		System.out.print(" *을 몇단까지 찍을까요? : ");
		int input = sc.nextInt();
		
		for(int haeng = 1; haeng<=input;haeng++) {
			for(int yeol= 1 ; yeol<=haeng; yeol++ ) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	public void ex9() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int haeng = 1; haeng<=input;haeng++) {//행4개
			for(int yeol =1;yeol<=input ;yeol--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex10() {
		System.out.print("몇을 몇단 까지 찍을까요 ? : ");
		int input = sc.nextInt();
		for(int i =1; i<=input;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=input;j++) {
			System.out.print("*");
			}
			
			System.out.println();
		}
	
	}
	public void ex11() {
		System.out.print("몇개 찍나요");
		int input = sc.nextInt();
		
		for(int i =1 ;i <=input-1;i++) {
			for(int j = 1; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1; i <=input;i++) {
			for(int j=1; j<=input-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public void ex12() {
		System.out.print("정삼각형 만들기");
		int input = sc.nextInt();
	
		for(int i = 1; i<=input ; i++) {
			
			for(int j = 1; j<=input-i ;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ex13() {
		System.out.print("직사각형어쩌구 입력 : ");
		int input = sc.nextInt();
		
		
		for(int i = 1;i<=input;i++) {//위에 뚜껑
			System.out.print("*");
		}
		System.out.println();
		for(int i = 1 ; i<=input-2 ; i++) {//안에 사각형
			System.out.print("*");
			for( int j =1 ; j<=input-2;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i = 1;i<=input;i++) {//아래뚜껑
			System.out.print("*");
		}
		System.out.println();
	}
	public void ex14() {
		System.out.print("자연수 하나를 입력하세요.");
		int input = sc.nextInt();
		int count =0;
		for(int i = 1; i<=input;i++) {
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
				if(i%2==0&&i%3==0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count : "+count);
	}
}
