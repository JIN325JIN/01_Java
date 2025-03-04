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
	
	/**
	 * 3이상 홀수 입력받아 오름차 내림차순으로 출력
	 */
	public void practice8() {
		
		System.out.print("정수 : ");		
		int input = sc.nextInt();
		
		if(input<3 && input%3!=0) {
			
			System.out.println("다시 입력하세요.");
			
		}
		else {
			int[] arr = new int[input+(input/2)];

			//for(int i = 0; i<input+(input/2;)i++) {
			//	arr[i] = i+1;
				//System.out.println(arr[i]);
			//}
		}
		
		
		
		
	}
	
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
			
			min = arr[i];
			max = arr[i];
			if(min<=arr[i]) {
				System.out.println("최소값 : "+ min);
			}
			else if(max>arr[i]) {
				System.out.println("최대값 : "+ max );
			}
		}
	}
	
	public void practice11() {}
	
	public void practice12() {}
	
	public void practice13() {
		//문자 배열에 문자열 넣은 후에 제외하고 출력하기
		System.out.print("문자열 : ");
		String input = sc.next();
		
		int count = 0;
		char[] ch = new char[input.length()];
		
		for(int i = 0; i<ch.length;i++) {
			ch[i]=input.charAt(i);
		}

		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i<ch.length;i++) {
			
			boolean flag=true;
			for(int j=0;j<i;j++) {
				
				if(ch[j]==ch[i]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				count++;
				System.out.print(ch[i]);
			}
			
		}
		System.out.println("\n"+count);
		
/*
		if(input.charAt(i)==ch[i]) {
				count++;
			}
			
			if(i==ch.length-1) {
				System.out.println(ch[i]);
			}
			else {
				System.out.print(ch[i] +",");
			}
		}
		System.out.print("문자 개수 :"+count);//중복제거 안한 문자갯수
 */
	}

	public void practice132() {
		//애초에 문자 배열에 중복 제거후 저장하는 방법
		System.out.print("문자열 : ");
		String input = sc.next();
		
		
		char[] ch = new char[input.length()];
		
		int count = 0;//저장해야할 배열의 크기
		
		for(int i =0;i<input.length();i++) {
			char tempChar = input.charAt(i);
			boolean flag = false;
			for(int j = 0; j <count;j++) {

				if(ch[j]==input.charAt(i)) {//중복
					flag= true;
					break;
				}
			}			
			if(!flag) {
				ch[count]=tempChar;
				count++;
			}
			
		}
		
		for(int i =0; i<count;i++) {
			System.out.printf("%c ",ch[i]);
		}
		System.out.print("\n문자개수 : "+count);
			
			
		
	}
	
	
	
	
	
	public void practice14() {
		System.out.print("배열의 크기를 입력하세요 .");
		int input = sc.nextInt();
		String[] arr = new String [input];
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.printf("%d번째 문자열 :",i+1);
			
			arr[i] = sc.next();
		}
		sc.nextLine();
		System.out.print("더 값을 입력 하시겠습니까? (y/n)");
		char answer = sc.next().charAt(0);
		
		do {
			System.out.print("더 입력하고 싶은 갯수 : ");
			int input2 = sc.nextInt(); 
			
			String[] arr2= new String[input+input2];
			
			for(int i =0; i<arr2.length;i++) {
				arr[i]=arr2[i];
			}
			System.out.println(Arrays.toString(arr2));
		
			
		}while(answer=='y'||answer=='Y'); 
			
	}	

}
