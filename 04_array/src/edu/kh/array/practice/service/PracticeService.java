package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc =new Scanner(System.in);
	
	public void ex1() {
		
		int[] arr = new int[9];
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			
			if(arr[i]%2==1) {
				sum = sum +arr[i];
				continue;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합:"+sum);
	}
	public void ex2() {
		int arr[] =new int[9];
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			arr[i]=(arr.length)-i;
			if(arr[i]%2==0) {
				sum = sum +arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수번째 인덱스의 합 :"+sum);
	}
	public void ex3() {
		System.out.print("양의 정수 :");
		int input = sc.nextInt();
		
		int [] arr = new int[input];
		
		for(int i =0; i<arr.length;i++) {
			
			System.out.print(i+1+" ");
		}
		
	}
	public void ex4() {
		int[]arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력 %d :",i);
			int input = sc.nextInt();
			arr[i] =input; 
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.printf("인덱스 : %d \n" ,i);
			}
			else {
				System.out.println("일치하는 값이 존재하지않습니다.");
				break;
			}
		}
		
		
		
		
	}
	public void ex5() {
		//1.사용자에게 문자열 입력받기
		//2.사용자가 입력한 문자열을 하나하나 char배열에 넣기
		//사용자가 입력한 문자열의 길이 만큼 char배열 할당
		//3.문자 입력받기 (검색할 문자)
		//4.검색할 문자가 몇개가 존재하고 , 어디에 있는지 파악하기
		//5.적절히 출력하기 
		
		
		//1.사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		//2.사용자가 입력한 문자열을 하나하나 char배열에 넣기
		char[] arr = new char[input.length()];
		//반복문을 통해서 str.charAt(i)값을 arr[i]에 담는 과정
		for(int i =0;i<arr.length;i++) {
			arr[i]=input.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		
		//3.문자 입력받기 (검색할 문자)
		System.out.print("문자 :");
		char ch = sc.nextLine().charAt(0);//문자 하나라서 char타입 
		
		//4.검색할 문자가 몇개가 존재하는지
		int count =0;
		
		
		System.out.print(input +"에"+ ch +" 가 존재하는 위치(인덱스) :");//하는중
		
		
		for(int i =0;i<arr.length;i++) {//arr배열의 인덱스마다 접근하기위해 사용
			
			if( arr[i] ==ch) {//해당 인덱스 값이 검색될 문자와 같을경우
				System.out.print(i+" ");
				count++;
			}
		}
		if(count>0) {
			System.out.println();
			System.out.println(ch+ "갯수 :"+count);
		}
		else {
			System.out.println("일치하는 문자열이 없습니다.");
		}
	}
	public void ex6() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum =0;
		String result = null;
		int[] arr = new int[num];		
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.printf("%d번째 인덱스에 넣을 값 :",i);
			arr[i] =sc.nextInt();
			sum = sum +arr[i];
			
		}
		//System.out.println(Arrays.toString(arr));
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총합 : " +sum);
	}
	public void ex7() {
		System.out.print("주민등록번호 (-포함) ");
		String input = sc.nextLine();

		char[] ch = new char[input.length()];
		
		for(int i=0;i<ch.length;i++) {
			
			ch[i] = input.charAt(i); 
	
			if(i>7) {
				ch[i] ='*';
			}
		}
		//System.out.println(Arrays.toString(ch));
		for(int i =0; i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		
	}
	public void ex8() {
		//1.3이상인 홀수를 입력받아 
		//2.배열의 중간까지는 1부터 1씩 증가 하여 오름차순
		//3.중간~끝까지는 1씩 감소하여 내림차순 
		//4.입력한 수가 정수가 아니거나 홀수가 아니면 다시 입력하도록 하기
		System.out.print("정수 :");
		int input = sc.nextInt();//정수입력받고
		//sc.nextLine();
		
		while(true){
		
				if(input <3 || input%2==0) {
					System.out.println("다시 입력하세요.");
				}
				else {
						int[] arr = new int[input];
			
						int num=0;//arr배열에 대입될 값
			
						for(int i =0; i<input;i++) {
						
								if(i<arr.length/2) {
									arr[i]=++num;
			
								}else {
									arr[i]=--num;
								}
								if(i==arr.length-1) {
									System.out.print(arr[i]);
								}else {
									System.out.println(arr[i]+" ");
								}
						}//for문끝
						break;
						}	
		}
	}
	public void ex9() {
		int[] arr = new int[10];
		
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*9+1);
		}
		System.out.println("발생한 난수 : " +Arrays.toString(arr));
		
		
	}
	public void ex10() {
		
		int[] arr = new int[10];
						
		for(int i =0;i <arr.length;i++) {
			
			arr[i]=(int)(Math.random()*9+1);
			
		}
		System.out.println("발생한 난수 :" + Arrays.toString(arr));//난수발생
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++) {

			if(arr[i]>max) {
				max =arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}
	public void ex11() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			
			int random =(int)(Math.random()*9+1);
			
			arr[i] = random;//난수 할당
			
			for(int x=0;x<i;x++) {//중복값 검사하는 포문
				
				if(random == arr[x]) {
					i--;
					//break;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	public void ex12() {
		int[] lotto = new int [6];
		
		for(int i =0;i<lotto.length;i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			
			
			for(int x= 0; x<i;x++) {//중복값 확인
				if(lotto[x]==random) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	public void ex13() {
		
		//1.사용자에게 문자열 입력받기
		//2.해당 문자열의 문자들을 char에 담기
		//3.char배열에서 중복값 존재할 경우 출력X
		
		
		System.out.print("문자열을 입력해주세요. :");
		String input = sc.nextLine();
		
		//String[] str = new String [input.length()];
		
		char[] ch = new char [input.length()];
		
		
		
		
		for(int i =0; i< input.length();i++) {
			 ch[i]= input.charAt(i);
		}
		int count = 0;//문자 개수 세기용 변수
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i =0; i<input.length();i++) {
			
			boolean flag =true;//중복 체크용 변수
			
			
			//중복값 확인하는 for
			for(int j =0; j<i;j++) {
				if(ch[i]==ch[j]){//비교
					flag = false;
					break;
				}
			}
			if(flag) {
				//중복이 발생하지 않았을경우
				if(i==0) {//첫번째 글자(0번인덱스)
					System.out.print(ch[i]);
				}else {//쉼표 공백 알파벳
					System.out.print(", "+ch[i]);
				}
				count++;
			}
		}
		System.out.println();
		//System.out.println("문자열에 있는 문자 : "+ Arrays.toString(ch));
		System.out.println("문자 개수 : "+ count);
	}
	public void ex14() {
		System.out.print("배열의 크기를 입력하세요.");
		int input = sc.nextInt();
		sc.nextLine();
		String[] str = new String[input];
		boolean flag=false;
		for(int i=0; i< str.length ;i++) {
				System.out.printf((i+1)+"번째 문자열 :");
				str[i]=sc.nextLine();	
		}
		System.out.println("더 값을 입력하시겠습니까? YES or NO");
		String ch = sc.next().charAt(0);
		if(ch=='y') {//입력한 값이 y와 같다면
			System.out.print("더 입력하고 싶은 개수 : ");
			int input1 = sc.nextInt();
			sc.nextLine();
			//str.length+sc.input;배열 늘리기?
			
		}
		else {
			System.out.println(Arrays.toString(str));
		}
		
		
		
		
		//if(input==str.length) {
		//	System.out.println("더 값을 입력하시겠습니까?");
		///	
		//	if(!flag) {
		//		
		//	}else{
		//		System.out.println("더 값을 입력 하시겠습니까?");
		//		
		//	}
		//}
		System.out.println(Arrays.toString(str));
	
	}
	public void ex15() {
		//1.첫배열의 크기 기정
		System.out.print("배열의 크기를 입력하세요.");
		int size = sc.nextInt();
		sc.nextLine();//입력버퍼에 남은 개행문자 비워주기
		String[] arr = new String [size];//내가 입력받은 사이즈 만큼의 배열할당
		//2.첫 배열에 저장할 문자열 입력받기
		for(int i =0; i<arr.length;i++) {
			System.out.print((i+1)+"번째 문자열 :");
			arr[i]=sc.nextLine();
		}
		//3.반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까? Y/N :");
			char ch = sc.next().charAt(0);
			
			//4.값을 더 입력할 경우
			if(ch=='y'||ch=='Y') {
				//5.더 입력받을 개수 정하기
				System.out.print("더 입력 받고 싶은 개수 :");
				int addsize = sc.nextInt();
				sc.nextLine();//개행문자 제거
				
				//6.새로 값을 입력받을 배열 생성 -> 기존 배열 크기 +추가 입력개수
				String[] newArr = new String[arr.length+addsize];
				//7.배열복사 + 새로운 문자열 입력받기
				for(int i =0; i<newArr.length;i++) {
						if(i<arr.length) {//인덱스의 크기가 기존배열보다 작을경우(깊은복사)
							newArr[i]=arr[i];//기존 배열 요소값 복사
				}else {//인덱스의 크기가 기존배열보다 클경우(새로운값입력받기)
						System.out.print((i+1)+"번째 문자열 : ");
						newArr[i] = sc.nextLine();
				}
						
			}
				//8.기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입(얕은복사)
				//더입력?y
				//위코드를 반복할때 기존배열인 arr의 길이를 기준으로
				//새 배열 (newArr)의 크기를 할당하기 때문에
				arr= newArr;
			}
			else if (ch =='n'||ch=='N') {
				break;//반복문 종료
			}else {//잘못입력한 경우
				System.out.println("잘못입력하셨습니다. 다시입력하세요.");
			}
		}
		System.out.println(Arrays.toString(arr));//배열값 모두 출력
	}
}