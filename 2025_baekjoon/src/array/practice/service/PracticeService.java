package array.practice.service;

import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int arr[] = new int[9];
		int sum =0;
		for(int i =0;i<=arr.length;i++) {
			System.out.print(i+" ");
			if(i%2!=0) {
				sum +=i;
			}
		}
		System.out.printf("짝수번째 인덱스의 합 %d\n" ,sum);	
	}

	public void practice2() {
		int arr[] = new int[9];
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			
			System.out.print(arr.length-i+" ");
			
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("홀수번째 인덱스 합: "+ sum);
		
		
		
	}
	
	public void practice3() {
		System.out.print("양의 정수 :");
		int input = sc.nextInt();
		
		for(int i =1; i<=input;i++) {
			System.out.println(i);
		}
	}

	public void practice4() {
		
	}

	public void practice5() {
		
	}
	
	public void practice6() {}
	
	public void practice7() {}
	
	public void practice8() {}
	
	public void practice9() {}
	
	public void practice10() {}
	
	public void practice11() {}
	
	public void practice12() {}
	
	public void practice13() {}

	public void practice14() {}

}
