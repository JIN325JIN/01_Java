package oarr.jinjin;

import java.util.Arrays;
import java.util.Scanner;

public class MemberService {

	
	private Scanner sc = new Scanner(System.in);
	
	private Member[] memberArr = new Member[5];
	
	private Member loginMember = null;
	
	public MemberService() {
		memberArr[0]=new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1]=new Member("user02","pass02","계보린",25,"경기");
		memberArr[2]=new Member("user03","pass03","고길동",45,"강원");
	}
	
	public void displayMenu() {
		int menuNum =0;
		
		do {
			System.out.println("====회원 정보 관리 프로그램 ver2====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색 지역");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 :");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1:System.out.println(signUp());
			break;
			case 2:System.out.println(login());
			break;
			case 3:selectMember();
			break;
			case 4:
				int result = updateMember();
				if(result==0) {
					System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");
				}else if(result== -1) {
					System.out.println("로그인 후 이용바람");
				}else {
					System.out.println("회원 정보 수정되었습니다.");
				}
			break;
			case 5:searchRegion();
			break;
			case 0: System.out.println("프로그램 종료...");
			break;
			default :System.out.println("잘못입력하셨습니다. 다시 입력하세요!");
			}
		}while(menuNum!=0);
	}
	/**
	 * memberArr의 비어있는 인덱스의 번호를 반환하는 메서드
	 * 단 비어있는 인덱스가 없으면 -1 반환
	 */
	public int emptyIndex() {
		//memberArr의 배열을 인덱스부터 끝까지 접근해서
		//참조하는 값이 null인 경우 인덱스를 반환
		for(int i =0; i<memberArr.length;i++) {
			if(memberArr[i]==null) {
				return i;
			}
		}
		//for문 수행했지만 return되지않은 경우 해당위치 코드 수행.
		return -1;
	}
	
	public String signUp() {
		System.out.println("\n====회원가입 ====");
		
		//memberArr에 빈자리 있는지 확인
		int index = emptyIndex();//memberArr의 비어있는 인덱스번호반환
		if(index==-1) {
			return "회원가입 불가능 합니다. (인원수 초과)";
		}
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
		
		System.out.print("지역: ");
		String region = sc.next();
		
		
		if(memberPw.equals(memberPw2)) {
			memberArr [index] = new Member(memberId,memberPw,memberName,memberAge,region);
			
			return "회원가입 성공 !!!";
			
			
		}else {
			return "회원가입 실패 !!(불일치)";
		}
		
	}

	public String login() {
		System.out.println("\n====로그인====");
		
		//1. 아이디 비밀번호 입력받기
		System.out.print("아이디 : ");
		String inputId = sc.next();
		System.out.print("비밀번호 ");
		String inputPw = sc.next();
		
		//2.  memberArr 배열내 요소를 순서대로 접근하여 null인지확인
		for(int i =0;i<memberArr.length;i++) {
			//3.회원정보가 잇을경우 회원정보의 아이디 비밀번호가
			//방금 입력받은 아이디와 비번이랑 같은지 비교
			if(memberArr[i]!=null) {
				
				if(memberArr[i].getMemberId().equals(inputId)&&memberArr[i].getMemberPw().equals(inputPw)) {
					//4.같다면 로그인 회원정보 객체를 참조할 변수 loginmember에 현재접근중인
					//memberArr[i]에 저장된주소를 얕은복사
					loginMember = memberArr[i];
					break;//효율을 위해 포문 종료
				}
			}
		}
		//5.같지않다면 로그인 성공 실패 여부에 따라 결과값 반환
		if(loginMember == null) {
			return " 아이디 또는 비밀번호가 일치하지 않습니다 !";
		}else {
			return loginMember.getMembername() +" 님 환영합니다.!";
		}
	}

	public void searchRegion() {
		System.out.println("\n====회원검색 (지역)=====");
		System.out.print("검색할 지역을 입력하세요 :");
		String inputregion = sc.next();
		
		//1.memberarr의 모든요소 순차접근 
		boolean flag = true;//검색결과 신호용 변수  
		
		//2.memberarr[i]인경우 반복 종료
		for(int i =0; i<memberArr.length;i++) {
			if(memberArr[i]==null) {
				break;
			}
			//3.memberarr[i]!=0 memberarr[i]요소에서 저장된 지역이 
			//input region과 같은경우 memberarr[i]요소에 저장된 객체의
			//회원아이디와 이름 출력
			if(memberArr[i].getRegion().equals(inputregion)) {
				System.out.printf("아이디 : %s , 이름 : %s \n",memberArr[i].getMemberId(),memberArr[i].getMembername());
				flag = false;
			}
		}
		//4.입력한 지역과 일치하는 회원이 없다면 일치하는 검색결과가 없습니다!출력
		if(flag) {
			System.out.println("일치하는 결과가 없습니다.");
			
		}
	}
	
	public void selectMember() {
		System.out.println("\n====회원정보 조회====");
		if(loginMember==null) {
			System.out.println("로그인 후 이용해주세요.");
		}else {
			System.out.println("이름 : " +loginMember.getMembername());
			System.out.println("아이디 : "+loginMember.getMemberId());
			System.out.println("나이 :" +loginMember.getMemberAge());
			System.out.println("지역 : "+loginMember.getRegion());
		}
	}
	
	public int updateMember() {
		System.out.println("\n====회원 정보 수정====");
		if(loginMember==null) {
			return -1;
		}
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		System.out.print("수정할 지역 입력 : ");
		String inputregion = sc.next();
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(loginMember.getMemberPw().equals(inputPw)) {
			loginMember.setMembername(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputregion);
			return 1;
			
		}else {
			return 0;
		}
	}
}
