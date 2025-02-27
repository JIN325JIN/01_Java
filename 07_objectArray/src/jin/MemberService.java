package jin;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	private Scanner sc = new Scanner(System.in);
	
	private Member[] memberArr = new Member[5];
	
	
	private String loginmember = null;
	
	public MemberService() {
		memberArr[0]=new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1]=new Member("user02","pass02","계보린",25,"경기");
		memberArr[2]=new Member("user03","pass03","고길동",45,"강원");
	}
	
	
	public void displaymenu() {
		int input = 0;
		
		do{
			System.out.println("====회원 정보 관리 프로그램 ver.2 ====");

			System.out.print("1.회원가입 : ");
			System.out.print("2.로그인 : ");
			System.out.print("3.회원정보 조회 : ");
			System.out.print("4.회원정보 수정 : ");
			System.out.print("5.회원정보 검색 : ");
			System.out.print("0.프로그램 종료 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:System.out.println("프로그램 종료...");
				break;
				default: System.out.println("정상 범주의 숫자를 입력해주세요.");
	
			}
			
			
			
		}while(input!=0);
		
		
	}
	public void signUp() {
		System.out.println("\n=====1. 회원가입 =====");
	}
	public void login() {
		System.out.println("\n=====2.로그인 =====");
		System.out.print("아이디 :");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		//if()
	}
	public void selectregion() {
		System.out.println("\n=====3. 회원 검색 (지역) =====");
	}
	
	public void updatemember() {
		System.out.println("\n=====4.. 회원 정보 수정 =====");
	}
	public void selcetmember() {
		System.out.println("\n=====5.. 회원 정보 조회 =====");
		}
}
