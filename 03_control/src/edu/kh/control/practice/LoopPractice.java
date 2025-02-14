package edu.kh.control.practice;
import java.util.Scanner;
//기능제공용
public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		//String result = ""; //스트링으로 쓸때 
		if(1 >input) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		else {
			for(int i=1;i<=input;i++) {
			//	result = result + i+" ";
				System.out.print(i +" ");
				
			}
			//System.out.println(result);
		}
	}
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
			for(int i = input ; i>=1 ;i--) {
				System.out.printf("%d ",i);
			}
		}
}
	public void practice3() {
		System.out.print("정수를 하나 입력 하세요. :");
		int input = sc.nextInt();
		String result = "";
		int sum =0;//합계용 변수 
		for(int i=1;i<=input;i++) {
			sum+=i;
			if(i==input) {//마지막 턴
				result =result +i;
				//System.out.print(i+"="+sum);//선생님코드
			}else {//이전 턴들
				result = result + i + "+"; 
				//System.out.print(i+"+");//선생님코드
			}
		 }
		System.out.print(result + "=" +sum);
	}
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		String result= " " ;
		
		if(input1<1 ||input2<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
				if(input1>input2) {
					for(int i=input1;i<=input2;i++) {
						result= input1+result;
						System.out.println(result);
					}
			}
		}
	}
	public void practice5() {
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.printf("====%d단====\n",dan);
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
								}
	}
	public void practice6() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<2||dan>9) {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		}else {//정상범위
			for(int i= dan ; i<=9;i++) {
				System.out.printf("====%d단====\n",i);
				for(int j=1 ;j<=9;j++) {
					System.out.printf("%d X %d = %d \n",i,j,i*j);
				}
			}
		}
	}
	public void practice7() {
		System.out.print("정수입력 :");
		int input = sc.nextInt();
		String result = "*";
		for(int i =1 ; i<=input;i++) {
			System.out.println(result);
			result+= "*";
		}
	}
	public void practice8() {
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		//안쪽포문이 바깥쪽 포문만큼 진행??
		
		for(int i=input;i>=1;i--) {
			
			for(int j =i ; i>=input ;j++) {
				System.out.println("*");
			}
		}
		
		
	}
	public void practice9() {
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		//int space = 0;
		
		for(int i =1 ;i<=num;i++) {
			System.out.println("1");
			for(int j =1 ; j<=num ;j++) {
				//System.out.println(" ");
				System.out.print("*");
			}
		}
		
		
		
	}
	public void practice10() {
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		String result = "*";
		
		for(int i = 1; i<=input ;i++) {
			System.out.println(result);
			result += "*";
			for(int j =1; j<=input ;j--) {
				System.out.println(result);
				result = "*";
			}
		}
	}
	public void practice11() {
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=1;i <=num;i++) {//열
			System.out.print("1");
			for(int j=1;j <=(2*num-1);i++) {
			System.out.println("2");
			}
		}
	}
	public void practice12() {}
	public void practice13() {}
	public void practice14() {
		
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if(num1<1 ||num2<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {//정상인경우
				
			//일단 start에 첫번째 숫자, end에 두번째 숫자 대입.
			int start = num1;
			int end = num2;
			
			if(num1>num2) {
				start =num2;
				end=num1;
			}
			for(int i = start ;i<=end;i++) {
				System.out.print(i +" ");
			}
			
			
			
			
			
			
		//	if(input1>input2) {
				//	for(int i=input1;i<=input2;i++) {
			//			result= input1+result;
				//		System.out.println(result);
				//	}
			//	}
		}
		
	}
	
}//제일 바깥 닫기