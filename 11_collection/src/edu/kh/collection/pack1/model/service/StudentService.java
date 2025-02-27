package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	//java.util.List 인터페이스 : List에 반드시 필요한 필수기능을 모아둔 인터페이스
	//인터페이스 : 객체생성 X, 부모 참조변수 O
	
	//java.util.ArrayList : 배열 형태의 List (가장 대표적인 List 자식 클래스 )
	
	//new ArrayList (): 기본 생성자 -> 기본 크기 10짜리 리스트 생성
	//하지만 리스트의 크기는 늘었다 줄었다 하기 때문에 큰 의미 없음.
	
	//학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); //스튜던트 타입만 저장 할수 있음.
															//검색 (조회) 효율적
	//private List<Student> studentList = new LinkedList<>(); //추가 수정 삭제에 효율적.
	//다형성 중 업캐스팅 적용!
	//부모타입 (List) 참조변수 (studentList)= 자식객체 (ArrayList)주소

	private Scanner sc = new Scanner(System.in);
	
	
	
	public StudentService() {//기본 생성자
	
		studentList.add(new Student("홍길동",23,"서울시 중구",'M',100));
		studentList.add(new Student("고영희",23,"경기도 안산시",'F',100));
		studentList.add(new Student("강아지",30,"서울시 강남구",'M',80));
		studentList.add(new Student("오미나",27,"충북 청주시",'F',90));
		studentList.add(new Student("박주희",24,"서울시 서대문구",'F',700));
	}
	
	/*
	private List <Object> testList = new ArrayList<Object>();
	
	public void ex() {//List 테스트용 예제
		
		//List.add(Object e) : 리스트에 객체를 추가할때 사용하는 
		//매개변수 타입이 Object == 모든 객체 매개변수로 전달할 수 있음.
		
		testList.add("문자열");
		testList.add(new Student("홍길동",25,"서울시 중구",'M',90));
		testList.add(sc);
		testList.add(new Object());
		
		//컬렉션 특징 : 여러 타입의 데이터를 저장 할 수 있다.
		
		//object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환
		//반환형이 Object == 모든 객체를 반환 할 수있다.
		
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		
		
		//testList에 꺼내온 인덱스 요소가 Student 혹은 상속관계 인지 검사
		//만약에 Student라면 이름을 꺼내오고 싶다.
		
		//향상된 포문
		for(Object e :testList) {
			if(e instanceof Student) {//객체거나 상속관계인지 묻는
				System.out.println(((Student)e).getName());//홍길동
			}
		}
	}*/
	
	/**
	 * alt + shift+j : 메서드 설명용 주석
	 * 
	 * @author 이윤진(wavyfromtheocean@gmail.com)
	 */
	public void displayMenu() {
		
		int menuNum =0;//메뉴 선택용 변수
		
		do {
			System.out.println("\n====학생관리 프로그램====");
			System.out.println("1.학생 정보 추가");
			System.out.println("2.학생 정보 전체 조회");
			System.out.println("3.학생 정보 수정");
			System.out.println("4.학생 정보 제거");
			System.out.println("5.이름으로 검색(일치)");
			System.out.println("6.이름으로 검색(포함)");
			System.out.println("7.나이순으로 정렬");//comparable 사용
			System.out.println("8.이름순으로 정렬");//comparator 사용
			System.out.println("0.프로그램 종료");
			
			System.out.println("메뉴 번호 선택 : ");
			
			try {
				menuNum =sc.nextInt();	
				sc.nextLine();//입력버퍼 개행문자 제거용
				
				switch(menuNum) {
				case 1: System.out.println(addStudent());
				break;
				case 2:selectAll();
				break;
				case 3:System.out.println(updateStudent());
				break;
				case 4:System.out.println(removeStudent());
				break;
				case 5:/*searchName1();*/
				break;
				case 6:/*searchName2();*/
				break;
				case 7:/*sortByAge();*/
				break;
				case 8:/*sortByName();*/
				break;
				case 0:System.out.println("프로그램 종료.");
				break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}
			} catch (InputMismatchException e) {
				System.out.println("\n error : 입력 형식이 유효하지 않습니다. 다시 시도해 주세요.");
				sc.nextLine();//입력버퍼에 남아있는 잘못된 코드 제거
				
				menuNum = -1;//첫 입력시 잘못 입력하는 경우 menuNum이 초기값인 0을 가지고 있어 반복문이 종료.
				//이를 방지하기 위해 임의로 0이 아닌 다른 숫자 대입
			}
		}while(menuNum!=0);
	}
	/**
	 * 1. 학생 정보 추가 메서드
	 * 
	 * 
	 * @return 삽입 성공 시 " 성공", 실패 시 "실패" 문자열 반환
		
	 */
	public String addStudent() {
		//checked Exception :반드시 throws 구문이나 try-catch 처리 강제
		//IOException, SQL Exception...
		
		//Unchecked Exception : 강제 처리 X ,예외 발생하면 자동으로 상위에서 호출된 메서드로
		//예외전파
		//InputMismatchException, NullPointerException,
		System.out.println("====학생 정보 추가 ====");
		
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사는곳 : ");
		String region = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);//'M' or 'F'
		
		System.out.print("점수 :");
		int score = sc.nextInt();
		
		
		//Student 새 객체 생성 후 studentList에 추가.
		if(studentList.add(new Student(name,age,region,gender,score))) {
			return "성공";
		}
		else {
			return "실패";
		}
	}

	/**
	 * 2.학생 전체 조회 메서드
	 * 
	 * - List가 비어있는 경우에는 학생 정보가 없습니다. 출력
	 * - 있는 경우에는 전체 학생 출력
	 */
	public void selectAll() {
		System.out.println("=====학생 전체 조회=====");
		
		//studentList 가 비어있는지 확인
		//List에 저장된 데이터 갯수 얻어오는 방법 : size: int List.size();
		
		//if(studentList.size()==0) {
			//boolean isEmpty() :컬렉션이 비어있다면 true 반환 
			
		if(studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다.");
			return;//현재 메서드를 종료시키고 호출한 쪽으로 돌아감.
		}
		//일반 포문
		for( int i =0; i< studentList.size();i++) {//length는 배열 . 더이상 length사용 X
			System.out.println(studentList.get(i));
		}
		//향상된 포문 - for each문
		//컬렉션 혹은 배열의 모든 요소를 순차적으로 반복 접근 할수 있는 포문.
		
		
		int index = 0;//인덱스 역할을 할 
		for(Student std:studentList) {
			System.out.print((index++ )+ "번 :" );//0번부터 찍을거면 후위연산, 1번부터 찍을거면 전위연산
			System.out.println(std);
		}
		
		
	}
	
	/**
	 * 3.학생 정보 수정 메서드
	 * -학생 정보가 studentList 에 하나라도 있는지 검사.
	 * 없다면 "입력된 학생 정보가 없습니다."
	 *
	 *- 인덱스 번호로 학생을 수정하려고 하는데,
	 * 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할수 없습니다" 반환
	 * - StudentList 범위 내의 인덱스 번호 인지 검사, 초과했다면 "범위를 넘어선 값을 입력 할 수 없습니다." 반환
	 * 
	 * -수정할 때 index번째에 저장된 학생정보 
	 * 수정 전 정보를 출력
	 * 
	 * 이름,나이,사는곳, 성별,점수 까지 전부 수정할 값 입력 받기.
	 * 
	 * 3.수정이 완료되었다면 ,"@@@의 정보가 변경되었습니다.반환"
	 * 
	 * 
	 * 
	 * @return
	 */
	public String updateStudent() {
		System.out.println("====학생 정보 수정 ====");
		
		System.out.println("index번호 :");
		int index = sc.nextInt();
		
		//1. 학생 정보가 studentList 에 하나라도 있는지 검사.
		if(studentList.isEmpty()) {
			return "입력 정보가 없습니다.";
			//2.입력된 숫자가 0보다 작은지
		}else if(index <0 ) {
			return "음수는 입력할 수 없습니다.";
			//student List 범위 내 인덱스 번호인지 검사
		}else if (index >= studentList.size()) {
			return "범위를 벗어선 값을 입력할 수 없습니다.";
		}else {
			//수정코드 작성
			//1.인덱스번째에 저장된 학생 정보 출력하기 
			System.out.println(index +"번째에 저장된 학생 정보 : ");
			System.out.println(studentList.get(index));
			
			//2.수정 할 내용 입력받기
			System.out.print("이름 :");
			String name = sc.next();
			
			System.out.print("나이 :");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("사는곳 : ");
			String region = sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);//'M' or 'F'
			
			System.out.print("점수 :");
			int score = sc.nextInt();
			

			//입력받은 index 번째에 수정할 학생 정보를 세팅 -> 수정
			//index 번째에 있던 기존 학생 정보가 반환 되고, 그 객체를 temp에 저장.
			Student temp =studentList.set(index, new Student(name,age,region,gender,score));
			
			return temp.getName()+"의 정보가 변경되었습니다.";

		}			
	}
	
	/**
	 * 4.학생 정보 제거 메서드
	 * 
	 * 수정과 같은 검사 후 삭제
	 * 삭제시 정말 삭제하시겠습니까 ?Y/N :물어보기
	 * Y입력했다면 해당 인덱스에 있는 객체 삭제후 "000님의 정보가 제거되었습니다."리턴
	 * N을 입력했다면 "취소"리턴
	 * @return
	 */
	public String removeStudent() {
		System.out.println("====학생 정보 제거 ====");
		
		
		//Student List.remove(int index);
		//리스트에서 index번째 요소를 제거
		//이때 제거된 요소가 반환됨.
		//List중간에 비어있는 인덱스가 없게 하기 위해서 
		//remove() 동작 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.
		
		System.out.println("index번호 :");
		int index = sc.nextInt();
		
		
		if(studentList.isEmpty()) {
			return "입력 정보가 없습니다.";
			//2.입력된 숫자가 0보다 작은지
		}else if(index <0 ) {
			return "음수는 입력할 수 없습니다.";
			//student List 범위 내 인덱스 번호인지 검사
		}else if (index >= studentList.size()) {
			return "범위를 벗어선 값을 입력할 수 없습니다.";
		}
		
		//4. 삭제
		System.out.println("정말 삭제하시겠습니까? : Y/N");
		char ch =sc.next().toUpperCase().charAt(0);//대문자로 변환 후 차앳 사용.
		//"y"->"Y"->'Y'
		
		if(ch=='Y'||ch =='y') {
			Student temp =studentList.remove(index);
			return temp.getName()+"의 정보가 제거되었습니다.";
		}
		
		return "취소";
}
}
