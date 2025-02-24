package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	//속성
	private Scanner sc = new Scanner(System.in);
	
	//회원 가입한 사람의 정보를 저장해둘 참조변수..
	//Member 타입 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	//현재 로그인 한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;
	
	//기본생성자
	public MemberService() {
		//memberArr 배열의 0,1,2 인덱스 초기화
		memberArr[0]=new Member("user01","pass01","홍길동",30,"서울");
		memberArr[1]=new Member("user02","pass02","계보린",25,"경기");
		memberArr[2]=new Member("user03","pass03","고길동",45,"강원");
	}
	/*
	public void ex() {
		System.out.println(Arrays.toString(memberArr));
	}
	*/
	//기능
	//메뉴 출력용 메서드
	public void displayMenu() {
		int menuNum=0;//메뉴 선택용 변수
		//무조건 한번은 반복
		do {
			
			System.out.println("====회원 정보 관리 프로그램 v2====");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 검색 (지역)");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			sc.nextLine();//입력버퍼에 남은 개행문자 제거
			
			switch(menuNum) {
			case 1: System.out.println(signUp());
			break;
			case 2: System.out.println(login());
			break;
			case 3:System.out.println(selectMember());
			break;
			case 4:
				int result = updateMember();
				if(result == -1) {
					System.out.println("로그인 후 이용바람");
				}
				else if(result ==0) {
					System.out.println("회원 정보 수정 실패 (비밀번호 불일치)");
				}
				else {
					System.out.println("회원 정보가 수정되었습니다.");
				}
			break;
			case 5:searchRegion();//void형이라서 그냥 호출만 해도 됨. 
			break;
			case 0: System.out.println("프로그램 종료...");
			break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력하세요!");
			}
			
		}while(menuNum!=0);//menuNum이 0이 되면 반복 종료
		
	}
	
	//memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	//단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		
		//memberArr배열을 0번째 인덱스부터 끝까지 접근해서 참조하는 값이 null인경우에 index를 반환
		for(int i =0; i< memberArr.length;i++) {
			
			if(memberArr[i]==null) {
				return i;
				//현재 메서드 종료하고 호출한 곳으로 i값을 가지고 돌아감
			}
		}
		//for문을 수행했지만 return이 되지 않은 경우 해당 위치 코드 수행
		//->for문에서 return되지 않았다. 배열에 빈칸이 없다.
		return -1;
	}
	//회원 가입용 메서드
	public String signUp() {
		System.out.println("\n=====회원 가입 =====");
		//memberArr배열에 빈자리가 있는지 확인
		//->빈 공간의 인덱스 번호를 얻어오기
		int index=emptyIndex();//memberArr배열에서 비어있는 인덱스 번호를 반환받아 저장하고있다.
								//없다면 -1반환
		if(index==-1) {
			return "회원 가입 불가능 (인원수 초과)";
		}
		//회원 가입 가능일때 코드
		System.out.print("아이디 : ");
		String memberId =sc.next();
		
		System.out.print("비밀번호 :");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 :");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName =sc.next();
		
		System.out.print("나이 : ");
		int memberAge =sc.nextInt();
		
		System.out.print("지역 : ");
		String region =sc.next();
		
		if(memberPw.equals(memberPw2)) {//일치하는 경우
			//멤버 객체 생성해서 할당된 주소를, memberArr의 비어있는 인덱스에 대입
			memberArr[index]= new Member(memberId,memberPw,memberName,memberAge,region);
			return "회원 가입 성공!!!";
					}
		else {//불일치
			return "회원 가입 실패 ( 비밀번호 불일치)";
		}
	}
	//로그인 메서드
	public String login() {
		System.out.println("\n=====로그인=====");
		
		//1.아이디 비밀번호 입력받기
		System.out.print("아이디 입력 : ");
		String memberId =sc.next();
		
		System.out.print("비밀번호 입력 :");
		String memberPw = sc.next();
		
		//2.memberArr배열 내 요소를 순서대로 접근하여 
		for(int i =0; i< memberArr.length;i++) {
			//2-1현재 접근 한 요소가 null이 아닌지 확인
			if(memberArr[i]!=null) {//회원 정보가 있을경우
				
				//2-2 회원 정보가 있을경우에는 회원 정보의 아이디와 비밀번호가 입력받은 로그인 아이디와 비밀번호가 같은지 비교
				if(memberArr[i].getMemberId().equals(memberId)&&memberArr[i].getMemberPw().equals(memberPw)) {
					
					//2-3 같다면 로그인 회원 정보 객체를 참조할 변수 loginMember에 현재 접근중인 memberArr[i]요소에 저장된 주소를 얕은 복사
					loginMember =	memberArr[i] ;
					break;//더이상 같은 아이디, 비밀번호가 없기 때문에 효율을 위해 for문 종료
				
				}
			}
		}
		//3.로그인 성공 실패 여부에 따라 결과값 반환하기 -> 로그인 성공 : %%님 환영합니다. //로그인 실패 : 아이디 혹은 비밀번호가 일치하지 않습니다.출력
		if(loginMember==null) {//실패
			return "아이디 혹은 비밀번호가 일치하지 않습니다.";
		}
		else{//성공
			return "로그인 성공 : "+ loginMember.getMemberName()+"님 환영합니다.";
			
		}
		
		
	}
	//지역조회 메서드
	public void searchRegion() {
		System.out.println("\n=====회원 검색(지역) =====");
		System.out.print("검색할 지역을 입력하세요. :");
		String inputRegion = sc.next();
		
		//1.memberArr배열의 모든 요소 순차접근 
		boolean flag = true;//검색결과 신호용 변수
		

		for( int i =0; i< memberArr.length;i++) {
			if(memberArr[i]==null) {
			//2.memberArr[i]요소가 null인 경우 반복 종료
				break;
			}
			//3.member[i]!=null ->memberArr[i]에 저장된 지역(region)이 입력받은 지역(input region)과 같은 경우 
			//memberArr[i] 요소에 저장된 객체의 회원의 id,이름을 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s \n",memberArr[i].getMemberId(),memberArr[i].getMemberName());
				flag = false;//찾았다는 신호
			}

		}
		//4.입력한 지역과 일치하는 회원이 없다면 일치하는 검색결과가 없습니다.! 출력
		if(flag) {
			System.out.println("일치하는 검색 결과가 없습니다.");
		}
	}
	//회원 정보조회 메서드	
	public String selectMember() {
		System.out.println("\n=====회원 정보 조회 =====");
		
		//1.로그인 여부 확인
		//필드에 있는 로그인멤버가 참조하고 있는 객체가 있는지 확인
		if(loginMember==null) {//
			return "로그인 후 이용 바람 ";
		}
		//로그인이 되어잇는 경우 현재 로그인한 회원의 정보를 출력할 문자열을 만들어서 반환
		else {
			return "이름 : "+loginMember.getMemberName()+"\n 아이디 :"+loginMember.getMemberId()+"\n나이 :"+loginMember.getMemberAge()+"\n지역 :"+loginMember.getRegion();
		
		}0
	}
	//회원 정보 수정 메서드
	public int updateMember() {
		
		//로그인이 되어있지않으면 -1 반환
		System.out.println("\n=====회원 정보 수정 =====");
		
		
		//로그인 여부 판별
		if(loginMember==null) {
			return -1;
		}
		
		//로그인 되어있는 경우
		//비밀번호 다를경우 0반환
		//비밀번호가 같을경우 1반환 : 수정 이루어짐
		System.out.print("수정 할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정 할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		System.out.print("수정 할 지역 입력 : ");
		String inputRegion = sc.next();
		
		//3.비밀번호 입력받아서 로그인한 회원의 비밀번호와 일치하는지 확인
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
			
		//4.비밀번호가 같을 경우
		//로그인한 회원의 이름, 나이 지역, 정보를 입력받은 값으로 변경후 1 반환
		if(loginMember.getMemberPw().equals(inputPw)) {
			
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputRegion);
			
			return 1;
		}else {
			return 0;
		}
		
		
		}
		
		
	
}
