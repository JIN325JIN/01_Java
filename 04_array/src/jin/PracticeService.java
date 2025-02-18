package jin;

import java.util.Scanner;

public class PracticeService {
	
	Scanner sc=new Scanner(System.in);
	
	public void ex1() {
		
		int[]  arr= new int[9];
		int sum = 0;
		
		for(int i =0; i<arr.length;i++) {
			
			arr[i]=i+1;
			
			System.out.print(arr[i]+" ");
			
			if(i%2==0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수번째 인덱스의 합: "+sum);
	}
	public void ex2(){
		int[]arr = new int[9];
		int sum=0;
		
		for(int i =0; i<arr.length;i++) {
			
				arr[i]=arr.length-i;
				
				System.out.print(arr[i]+" ");
				
				if(i%2==1) {
					sum += arr[i];
				}
						
		}
		System.out.println();
		System.out.println("홀수번째 인덱스 합 :"+sum);
		
	}
	public void ex3() {
		System.out.print("양의 정수: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	public void ex4() {
		
		int [] arr= new int[5];
		for(int i =0;i<arr.length;i++) {
			System.out.print(i +"입력 : ");
			arr[i] =sc.nextInt();
		}
		System.out.print("검색할 값 :");
		int search = sc.nextInt();
		boolean flag=true;
		
		for(int i =0; i<arr.length;i++) {
			
			if(search==arr[i]) {
				System.out.print("인덱스" +i);
				flag=false;
			}
			
		}
		if(flag){
			System.out.println("일치하는 값이 존재하지 않습니다.");
			 
		}
		
		
	}
	public void ex5() {
		System.out.print("문자열 :");
		String text = sc.nextLine();
		
		char[] arr =new char[text.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=text.charAt(i);
		}
		System.out.print("찾으려는 문자: ");
		char ch = sc.nextLine().charAt(0);
		int count =0;
		for(int i =0; i<arr.length;i++) {
			
			if(arr[i]==ch) {
				System.out.print(i+" ");
				count ++;
			}
		}
		System.out.println();
		System.out.printf("내가 찾고싶은 %c 개수: %d ",ch,count);
	
	
	}
	public void ex6() {
		System.out.print("정수:");
		int input =sc.nextInt();
		
		int[] arr = new int[input];
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			System.out.print("배열"+i+"번째에 넣을 값 :");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum =sum+arr[i];
		}
	System.out.println();
	System.out.println("총합 : "+sum);
	}
	public void ex7() {
		System.out.print("주민등록번호 (-포함) :");
		String serial = sc.nextLine();
		char []str = new char[serial.length()];
		
		for(int i=0; i<str.length;i++) {
			
			
			if(i<=7) {
				str[i]=serial.charAt(i);
			}
			else {
				str[i]='*';
			}
			System.out.print(str[i]);
			
		}
		
		
	}
}
