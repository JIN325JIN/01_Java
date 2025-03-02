package memberservice;

import java.util.Scanner;

public class MemberService1 {
	Scanner sc = new Scanner(System.in);
	private Member1 memberInfo =null;
	private Member1 loginMember = null;
	
	public void displayMenu() {
		
		int menuNum = 0; 
		
		do {
		
		System.out.println("====회원 정보 관리 프로그램 ver1====");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.회원 정보 조회");
		System.out.println("4.회원 정보 수정");
		System.out.println("0.프로그램 종료");
		
		System.out.print("메뉴 입력 :");
		menuNum = sc.nextInt();
		
		switch(menuNum) {
			case 1: signUp();
			break;
			case 2:System.out.println(login());
			break;
			case 3:select();
			break;
			case 4:update();
			break;
			case 0:System.out.println("프로그램 종료...");
			break;
			default:System.out.println("0~4까지의 숫자만 입력해주세요.");
		}
		
		}while(menuNum!=0);
	}
	public void signUp() {
		System.out.println("====회원가입====");
		System.out.print("아이디: ");
		String memberId =sc.next();
		System.out.print("비밀번호: ");
		String memberPw =sc.next();
		System.out.print("비밀번호 확인: ");
		String memberPw2 =sc.next();
		System.out.print("이름 : ");
		String memberName =sc.next();
		System.out.print("나이: ");
		int memberAge = sc.nextInt();
		

		if(memberPw.equals(memberPw2)) {
			memberInfo = new Member1(memberId,memberPw,memberName,memberAge);
			System.out.println("회원 가입 성공! ");
		}else {
			System.out.println("회원 가입 실패 : 비밀번호 불일치");
		}
		
	}

	public String login() {
		System.out.println("====로그인====");
		
		if(memberInfo==null) {
			return "회원가입부터 진행해주세요.";
		}
		System.out.print("아이디 : ");
		String inputId= sc.next();
		System.out.print("비밀번호 : ");
		String inputPw = sc.next();
		
		if(memberInfo.getMemberPw().equals(inputPw)&&memberInfo.getMemberId().equals(inputId)) {
			loginMember = memberInfo;//얕은복사	
			return memberInfo.getMembername()+"님 환영합니다.";
		}
		else {
			return "아이디 비밀번호가 일치하지 않습니다.";
		}
	}
	
	public void select() {
		
		System.out.println("====회원 정보 조회====");
		
		if(loginMember==null) {
			System.out.println("로그인 후 이용바람.");
		}
		System.out.println("회원 이름 :"+loginMember.getMembername());
		System.out.println("아이디 : "+loginMember.getMemberId());
		System.out.println("나이 : "+loginMember.getAge()+"세");
	}

	public void update() {
		System.out.println("====회원 정보 수정====");
		
		if(loginMember==null) {
			System.out.println("로그인후 이용 바람");
		}
		System.out.print("수정할 이름 입력 :");
		String newName = sc.next();
		System.out.print("수정할 나이 입력 :");
		int newAge = sc.nextInt();
		System.out.print("비밀 번호 입력 : ");
		String newPw = sc.next();
		
		
		if(loginMember.getMemberPw().equals(newPw)) {
			loginMember.setMembername(newName);
			loginMember.setAge(newAge);
			
			System.out.println("회원정보가 수정되었습니다.");
		}
		else {
			System.out.println("회원 정보 수정 실패: 비밀번호 불일치");
		}
		
		
		
	}
}
