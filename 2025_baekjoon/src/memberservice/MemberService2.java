package memberservice;

import java.util.Scanner;

public class MemberService2 {
	Scanner sc= new Scanner(System.in);
	
	private Member2[] arr = new Member2[5];
	
	public MemberService2() {

		arr[0]=new Member2("user01","pass01","홍길동",30,"서울");
		arr[1]=new Member2("user02","pass02","계보린",25,"경기");
		arr[2]=new Member2("user03","pass03","고길동",45,"강원");
	}
	
	public void displayMenu() {
		int menuNum=0;
		do {
			System.out.println("====회원 정보 관리 프로그램 ver.2");
			
			System.out.println("1.회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색 지역");
			System.out.println("0. 프로그램 종료");
			
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1:
				break;
			case 2:
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5:
				break;
			case 0:System.out.println("프로그램을 종료합니다....");
				break;
				default: System.out.println("0~5까지 숫자만 입력해주세요.");
			
			}
			
		}while(menuNum!=0);
	}
	public void signUp() {
		System.out.println("====회원가입 ====");
		
	}
}
