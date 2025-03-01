package jinjin;

import java.util.Scanner;

/**
 * 
 */
public class MemberService {

	private Scanner sc = new Scanner(System.in);
	
	
	private Member memberInfo = null;
	private Member loginMember = null;//로그인 회원 저장용
	public MemberService() {}
	
	public void displayMenu() {
		int menuNum =0;
		
		do {
			System.out.println("====회원정보관리 프로그램====");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum= sc.nextInt();
			sc.nextLine();//입력버퍼에 남은 개행문자 제거용
			switch(menuNum) {
			case 1:System.out.println(signUp());
			break;
			case 2:System.out.println(login());
			break;
			case 3:System.out.println(selectMember());
			break;
			case 4:int result = updateMember();
				if(result == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}else if(result ==0) {
					System.out.println("회원정보 수정 실패 (비밀 번호 불일치)");
				}else {
					System.out.println("회원 정보가 수정되었습니다.");
				}
			break;
			case 0: System.out.println("프로그램 종료....");
			break;
			default :System.out.println("잘못 입력 하셨습니다. 메뉴에 있는 번호만 입력해주세요");
			}
			
		}while(menuNum!=0);
	}
	/**
	 * 회원 가입
	 */
	public String signUp() {
		System.out.println("\n====회원가입 ====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		if(memberPw.equals(memberPw2)) {
			memberInfo = new Member (memberId,memberPw,memberName,memberAge);
			return "회원 가입 성공 !";
		}else {
			return "회원가입 실패 ! ( 비밀번호 불일치)";
		}
		
		
	}
	
	/**
	 * 내가 입력한 아이디와 비밀번호로 가입한 사람이 있는지
	 */
	public String login() {
		System.out.println("\n ====로그인====");
		
		if(memberInfo==null) {
			return "회원 가입부터 진행해주세요!";
		}
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId())&&memberPw.equals(memberInfo.getMemberPw())) {
			//로그인 정보 기억.
			//로그인멤버에 멤버인포가 참조하고 있는 객체의 주소 대입
			
			loginMember = memberInfo;//얕은복사
			 return loginMember.getName() +"님  환영합니다.";

		}else {
			return "아이디 비밀번호가 일치하지 않습니다. ";
		}
		
	}

	/**
	 * 로그인 한 회원 조회후 이름,아이디,나이 출력
	 */
	public String selectMember() {
		System.out.println("\n====회원정보 조회====");
		if(memberInfo==null) {
			return "로그인 후 이용해주세요!";
		}else {
			return "회원 이름 : "+loginMember.getName()+"\n아이디 : "+loginMember.getMemberId()+"\n나이 : "+loginMember.getMemberAge()+"세";
		}
	}
	
	/**
	 * 회원 정보 수정 기능
	 */
	public int updateMember() {
		System.out.println("\n====회원정보수정====");
		
		//1.로그인여부판별 로그인 안되어있으면 -1 반환
		if(loginMember==null) {
			return -1;
		}
		//2.로그인 되어있으면 수정할 회원 정보 입력받기. 이름 나이
		System.out.print("수정할 이름 입력 :");
		String inputName = sc.next();
		System.out.print("수정할 나이 입력 :");
		int inputAge = sc.nextInt();
		System.out.print("비밀번호 입력 :");
		String inputPw = sc.next();
		
		
		//비밀번호 입력받아서 현재로그인한 비밀번호랑 같은지 확인하기
		//비밀번호 일치하면 로그인한 회원이름과 나이 정보를 입력받은값으로변경후 1반환.
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			loginMember.setName(inputName);
			loginMember.setMemberAge(inputAge);
			return 1;
		}else { //비밀번호 불일치시 0반환
			return 0;
		}
	}
}
