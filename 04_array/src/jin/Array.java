package jin;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	Scanner sc = new Scanner(System.in);
	public void ex1() {
		int[] arr = new int [4];
		
		arr[0]=100;
		arr[1] =200;
		arr[2]=500;
		arr[3]=1000;
		
		System.out.println("배열의 크기는 " +arr.length);
		for(int i =0 ;i<arr.length;i++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
			
		}
		int [] arr2 = {1,2,3,4,5};
		System.out.println("주소값 "+arr2);//주소값 출력
		System.out.println(Arrays.toString(arr2));//한번에 배열값 출력
		
	}
	public void ex2() {
		System.out.println("키(cm)를 입력해 주세요.");
		
		double[] height= new double [5];
		double sum =0;
		for(int i=0;i<height.length;i++) {
			System.out.printf("%d의 키를 입력해주세요.",i+1);
			height[i] = sc.nextDouble();
		}
		for(int i=0;i<height.length;i++) {
			sum = sum+height[i];
		}
		System.out.println("입력하신 키의 합은 :"+sum);
		System.out.println("입력하신 키의 평균은 :"+sum/height.length);
		
	}
	public void ex3() {
		System.out.print("입력 받을 인원의 점수 : ");
		int input = sc.nextInt();
		int sum =0;
	
		
		int [] score = new int[input];
		
		for(int i =0;i<score.length;i++) {
			System.out.printf("%d번 점수 입력 : ",i+1);
			score[i]=sc.nextInt();
			sum += score[i];
		}
		int max =score[0];
		int min =score[0];
		
		for(int i =0;i <score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}
			if(score[i]<min) {
				min=score[i];
			}
		}
				System.out.println("합계는 :"+sum);
		System.out.println("평균은 :"+sum/score.length);
		System.out.println("최대점수 :"+max);
		System.out.println("최소점수 :"+min);

	}
	public void ex4() {
		String arr[] = {"김밥","써브웨이","국밥","백반","떡볶이","빵"};
		System.out.println("오늘 점심 메뉴 : " + arr[(int)Math.random()*6]);
	}
	public void ex5() {
		int arr[] = {100,200,300,400,500,600,700,800,900,1000};
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		boolean flag =false;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==input) {
				System.out.printf("%d번째 인덱스에 존재합니다.\n",i);
				flag = true;
			}
			
		}
		if(flag!=true) {
			System.out.println("존재하지않음.");
		}
		
	}
	public void ex6() {
		String arr[]= {"사과","딸기","포도","배","키위","바나나"};
		System.out.print("찾으시는 과일을 입력해주세요.");
		String fruit =sc.next();
		boolean flag = true;
		
		for(int i =0;i <arr.length;i++) {
			if(arr[i].equals(fruit)) {
				System.out.printf("찾으시는 과일이 %d번 인덱스에 존재합니다.\n",i);
				flag=false;
			}
			
		}
		if(flag) {
			System.out.println("찾으시는 과일이 없습니다.");
		}
	}
	public void ex7() {
		
		String str1 = "가나다";
		String str2 =new String("가나다");
		
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : " + str2);
		System.out.println("str1.toString(): "+ str1.toString());
		System.out.println("str2.toString(): "+ str2.toString());
		
		System.out.println("주소값 : " +System.identityHashCode(str1));//	
		System.out.println("주소값 : " +System.identityHashCode(str2));//	
	}
	public void ex8() {
		System.out.print("문자열을 입력해주세요 : ");
		String input = sc.nextLine();
		
		char[] arr =new char[input.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("검색할 문자를 입력해주세요.");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ch) {
				count++;
			}
		}
		if(count>0) {
			System.out.printf("입력하신 %c와 일치하는 문자열은 %d개 입니다.\n",ch,count);
		}else {
			System.out.println("일치하는 문자가 없습니다.");
		}
		
	}
}
