package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	/*배열 (array)
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 묶여진 변수들은 하나의 배열명으로 불려진다.
	 * 구분은 index를 사용함*/
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
	//변수 vs 배열	
		
	//변수 선언
	int num ;//메모리 구조중 스택이라는 영역에 int 자료형을 저장할수있는 공간 4바이트를 할당하고 	
	//그 공간에 num이라는 이름을 부여.
	
	
	//변수 대입
	num = 10;//생성된 num이라는 변수공간에 10이라는 정수값 대입
		
	//변수 사용
		System.out.println("num에 저장된 값 : "+num);//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
	//=======
	//배열선언
		int [] arr;//스택 영역에 int 배열 자료형 공간을 4바이트 할당하고 그 공간이름에 arr이라는 이름 부여
		//arr이라는 변수는 참조형으로 주소값 만을 저장할 수 있다.
		
	//배열 할당
		arr = new int[3];//"new 연산자"라고 하며 heap메모리 영역에 새로운 공간(배열,객체)을 할당
		//int형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		//heap영역에 int형 변수 3칸차리 int[]을 생성(할당) 
		//arr = new int [3];//
		//int []  int[] => 같은 자료형 == 연산가능
		
		System.out.println("arr 의 주소 값 : "+arr);
		
		
		System.out.println("arr[0]의 초기값 : "+arr[0]);//0출력
		System.out.println("arr[1]의 초기값 : "+arr[1]);//0출력
		System.out.println("arr[2]의 초기값 : "+arr[2]);//0출력
		//heap영역에 생성된 공간은 절대 비어있을 수 없다.
		//JVM 기본값이 들어가져있다.
		//boolean :false,참조형:null,나머지 :0
		
		
	//배열 요소값 대입
		arr[0] = 10;
		arr[1] =50;
		arr[2] =100;
		
	//배열 사용	
		System.out.println("현재 arr[0]의 값 :"+arr[0]);//
		System.out.println("현재 arr[1]의 값 :"+arr[1]);//
		System.out.println("현재 arr[2]의 값 :"+arr[2]);//
	//[10,50,100]이렇게 되어있는 상태	실제로 arr이 가진 모든요소의 값을 알고싶을때
		//Arrays.toString(배열명);이라는 메서드가 있음
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	public void ex2() {
		//배열 선언 및 할당
		int [] arr = new int[4];//4칸짜리
				
		//arr[0~3] 까지 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0]=100;
		arr[1] =200;
		arr[2]=500;
		arr[3]=1000;
		//arr[4]=5000;//런타임 에러
		
		//코드에서 빨간줄 에러 :컴파일 에러
		//실행했을때 나는 에러 : 런 타임 에러(실행중에 발행하는 에러)
		//배열의 인덱스 범위를 벗어났다는 에러 나옴: 4칸짜리배열인데 없는 인덱스 번호인 4에 접근.
	
		
		//배열과 포문
		//배열의 길이(몇칸인가 :) :배열명.length(메서드가 아닌 필드)
		System.out.println(" 배열의 길이 : "+ arr.length+"칸 입니다.");
		
		for(int i =0; i< arr.length;i++) {
			//i =>0 1 2 3
			System.out.printf("arr[%d] : %d \n",i,arr[i]);
		}
		
		//선언과 동시에 초기화 하는 방법
		int[] arr2 = {1,2,3,4,5};
		//스택이라는 영역에 int[]자료형 공간을 4byte할당하고 그 공간에 arr2라는 이름 부여
		//heap메모리 영역에 int 5칸짜리 int[]을 새성하고 0번 인덱스부터 각요소에 1~5까지
		//초기화(대입)함
		//int []주소 값을 arr2라는 참조변수가 참조함.
		
		//=int [] arr = new int[] {1,2,3,4,5};
		System.out.println("==================");
		System.out.println(Arrays.toString(arr2));
	}
	public void ex3() {
		//다섯명의 키(cm)를 입력받고 평균 구하기 
		System.out.println("키를 입력해주세요 (cm):");
		
		double [] height = new double[5];//더블배열 자료형 참조변수 height를 stack생성
		//height에 heap영역에 생성된 double 5칸 짜리 주소를 대입
		
		for(int i =0; i<height.length;i++) {
			//0 1 2 3 4
			System.out.print((i+1) +" 번 키 입력 :");
			height[i] =sc.nextDouble() ;
		
		}
		System.out.println();
		double sum =0;//합계 저장용 변수
		
		for(int i =0;i<height.length;i++) {//배열요소에 대입되어 있는 값을 사용(합계)하는 용도의 반복문
			sum = sum +height[i];//배열의 각 index에 저장된 값을 sum에 누적
		}
		//System.out.printf("입력된 키의 합은 %.2f cm 입니다.\n",sum);
		System.out.printf("입력된 키의 평균은 %.2f cm 입니다.",sum/height.length);
	}
	public void ex4() {
		//입력받은 인원수 만큼의 점수를 입력받아 배열에 저장해라
		//입력이 완료되면 점수의 합계와 평균과 최고점과 최저점을 출력해라
		
		System.out.print("입력 받을 인원수의 점수 : ");
		int num =sc.nextInt();
		
		int []score =new int [num];//할당할 배열의 크기는 입력받은 배열의 크기만큼
		int sum = 0;
		
		for(int i =0; i<score.length ;i++) {//score배열의 각요소에 입력하는 점수값 대입.합계누적
			System.out.printf("%d번 점수 입력 : ",(i+1));
			score[i] =sc.nextInt();
			sum =sum+score[i];
		}
		//대입 완료 된 시점.
		
		//최저점과 최고점의 기준.
		int max = score[0];
		int min= score[0];
		
		
		
		for(int i =0; i<score.length;i++) {
			//0 1 2 3
			
			//최고점을 비교하는 조건식
			if(score[i]>max) {
				max = score[i];//재대입,갈아끼우기
			}
			
			//최저점을 비교하는 조건식
			if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.printf("합계는 %d입니다.\n",sum);
		System.out.printf("평균은 %.2f입니다.\n",(double)sum/score.length);
		System.out.printf("최고점은 : %d\n",max);
		System.out.printf("최소점은 : %d\n",min);
	}
	public void ex5() {
		String[] arr = {"김밥","써브웨이","햄부기온앤온","백반","국밥","짜장면"};
		
		System.out.println("오늘 점심 메뉴 : "+ arr [ (int) (Math.random()*6)]);//랜덤
	
	}
	public void ex6() {
		//배열을 이용한 검색
		//입력받은 정수가 배열에 있는지 없는지 확인하기
		//만약 있다면 몇번 인덱스에 존재하는지 출력
		
		//정수입력 : 5
		//존재하지 않음.
		int [] arr = {100,200,300,400,500,600,700,800,900,1000};
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		//신호를 나타내기 위한 변수 
		boolean flag = false;//검사하기전에는없다고 가정
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==input) {
				System.out.println(i + "번째  인덱스에 존재");
				flag = true;
			}
		}
		if(!flag) {//flag상태 검사
			//flag가 false라면 일치하는 값을 찾지 못했다는 의미
			//그런데 flag가 false라면 if조건식이 false이므로 수행되지않음
			//->!(NOT 연산자 : 부정 논리 연산자)붙여줌으로써 true로 변경하여 
			//{}안에있는 코드를 수행하게 함
			System.out.println("존재하지않음");
		}
	}
	public void ex7() {
		//입력하는 값과 일치하는 값이 있으면 인덱스 번호 출력
				//없으면 존재하지않음
				String [] arr = {"사과","딸기","바나나","키위","멜론","아보카도"};
				System.out.print("과일 입력 : ");
				String input = sc.next();
				boolean flag = true;
				
				
				for(int i=0; i<arr.length;i++) {
					if(arr[i].equals(input)) {
						System.out.printf("%d번 인덱스에 존재\n",i);
						flag= false;
					}
				}
				if(flag) {
					System.out.println("존재하지않음");
				}
			
	}
	public void ex8() {
		
		String str ="가나다";//리터럴표기법// String Constant Pool 저장
		
		String str2 = new String("가나다");//heap에 새 객체로서 저장
		
		System.out.println("str :" +str);
		System.out.println("str2 :"+ str2);
		System.out.println("str.toString(): "+ str.toString());
		
		
		
		
		//String 클래스의 toString()메서드가 존재
		//to String()메서드는  자기 자신을 그대로 반환.
		
		
		//System.out.println(str);을 실행하면 
		//str.toString()이 자동으로 호출됨
		//대입해둔 문자열 값 자체가 반환됨..
		
		
		//주소값 (객체의 해시코드)을 확인하고 싶다면 아래처럼 사용하시길....
		System.out.println("주소값 : " +System.identityHashCode(str));//	
	}
	public void ex9() {
		//문자열을 입력받아 한글자씩 잘라내어 char배열에 순서대로 저장
		//문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		//단 일치하는 문자가 없을 경우 "존재하지않습니다" 출력
		//문자열 입력 :hello
		//[ h,e,l,l,o] 
		//검색할 문자 입력 :l
		//2개있음.
		
		
		//사용해야 하는 기술과 기능
		//배열 검색
		//문자열의 길이 구하기 string.length()
		//ex) hello.length ->5
		//String.charat(index) :문자열에서 특정 인덱스한 문자 한개 얻어오기 가능.
		
		System.out.print("문자열 입력 : ");
		String input =sc.nextLine();//hello world =>공백 포함
		
		
		//입력받은 문자열을 한글자씩 잘라내어 char배열에 저장하기.
		char[] arr = new char[input.length()];
		for(int i =0; i< arr.length;i++) {
			arr[i] = input.charAt(i);//hello
			//arr[0]='h' //arr[1]='e'.....etc
			
			}
		System.out.println(Arrays.toString(arr));
		//문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인.
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		//sc.next()->String 형
		//String.charAt(0)->Stringd의 0번째 인덱스 문자 하나를 추출해서 char형태로 반환
		//"h"=>'h'
		int count =0;//같은 글자 갯수 세기 위한 변수
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==ch) {
				count++;				
			}
		}
		if(count>0) {
		System.out.printf("일치하는 문자열은 %d 개 입니다.\n",count);
		}else {
			System.out.println("일치하는 문자가 없습니다.");
		}
	}
	

}
