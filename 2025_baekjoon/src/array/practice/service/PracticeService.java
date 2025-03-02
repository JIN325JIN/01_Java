package array.practice.service;

import java.util.Arrays;
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
		int arr[]= new int[input];
		
		for(int i =1; i<=arr.length;i++) {
			System.out.print(i+" ");
		}
	}

	public void practice4() {
		
		int[] arr = new int[5];
		boolean flag = true;
		for(int i =0; i<arr.length;i++) {
			
			System.out.printf("입력"+i+" :");
			arr[i]=sc.nextInt();
		}
		System.out.print("검색할 값 :");
		int search = sc.nextInt();
		
		
		for(int i =0; i<arr.length;i++) {
			
			if(arr[i]==search) {
				System.out.print("인덱스 : "+ i);
				flag=false;
			}
			
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
		
	}

	public void practice5() {
		
		int count =0;
		System.out.print("문자열 :");
		String input = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] str = new char[input.length()];
		
		for(int i=0; i<input.length();i++) {
			str[i] = input.charAt(i);
		}
		for(int i =0; i<input.length();i++) {
			if(str[i]==ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : "+count);
		
		
	}
	
	public void practice6() {
		int sum =0;
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int arr[] = new int [input];
		
		for(int i =0 ;i<input;i++) {
			
			System.out.printf("%d번째 인덱스에 넣을 값 :",i);
			arr[i]= sc.nextInt();
			
			
		}
		for(int i =0; i<input;i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총합: "+sum);
	}
	
	/**
	 * 주민등록번호 뒷자리 8출력
	 */
	public void practice7() {
		
		System.out.print("주민등록 번호 (-포함) :");
		String input = sc.next();
		char[] arr = new char[input.length()];
		
		for(int i =0;i <input.length();i++) {
			
			arr[i]=input.charAt(i);
			
		}
		for(int i =0; i<input.length();i++) {
			
			if(i>=8) {
				arr[i]= '*';
			}
		}
		System.out.println(arr);
	}
	
	public void practice8() {}
	
	/**
	 * 1~10사이의 난수 출력
	 */
	public void practice9() {
		int[] arr= new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			
			System.out.print(arr[i] +" ");
		}
	}
	
	/**
	 * 난수 생성기 최대값 최소값
	 */
	public void practice10() {
		
		int [] arr = new int[10];
		int min=0; 
		int max=10;
		
		System.out.print("발생한 난수 : ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		System.out.println(Arrays.toString(arr));
		
		
		for(int i =0; i<arr.length;i++) {
			
			arr[i]=min;
			
			if(min>arr[i]) {
				System.out.println("최소값 : "+ min);
			}
		}
		
	}
	
	public void practice11() {}
	
	public void practice12() {}
	
	public void practice13() {}

	public void practice14() {}

}
