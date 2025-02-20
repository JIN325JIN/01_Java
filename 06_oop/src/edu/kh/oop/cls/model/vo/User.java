package edu.kh.oop.cls.model.vo;

public class User {

	
	//속성(필드)
	//아이디, 비밀번호, 이름,성별(추상화 진행)
	//데이터 직접 접근 불가 원칙 -> 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	//기본 생성자 자동완성 단축키 : ctrl + spcae+enter
	
	//기본 생성자 (-> 매개변수가 없는 생성자)
	public User() {
		//기능
		
		
		System.out.println("기본 생성자로 USER객체 생성");
		
		//필드초기화
		userId = "user01";
		userPw="pass01";
		userName ="홍길동";
		userAge =20;
		userGender ='남';
		
		
		
	}


	//getter setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	//매개변수 생성자 단축키 :alt+shift-> source에서 generate constructor using fields->generate
	//매개변수 생성자
	//변수 : 매개변수 , 오버로딩, this 참조변수 에 대해서도 알아야함
	//**매개변수 : 생성자나 메서드 호출시 ()안에 작성되어지는 값을 저장하고 있는 변수
	//-> 전달 받은 값을 저장하고 있는 매개체 역할의 변수
	
	public User(String userId,String userPw) {//오버로딩 적용되고 있는 상태
		System.out.println("매개변수 생성자를 이용하여 User 객체 생성");
		
		
		//필드 초기화 
		
		this.userId = userId;
		this.userPw = userPw;
		//필드 = 매개변수
		//this참조변수
		//-객체가 자기 자신을 참조 할수 있도록 하는 변수
		//왜 사용?  => 필드명과 매개변수명이 같은 경우 이를 구분하기 위해 사용한다.
	
	}
	
	
	//필드를 전부 초기화 하는 목적의 매개변수 생성자
	public User(String userId, String userPw,String userName,int userAge,char userGender) {
		
		//this() 생성자
		//같은 클래스의 다른 생성자를 호출할때 사용
		//생성자 내에서 반드시 첫번째 줄에 작성할것!
		//왜 사용 하는가?
		//중복 코드 제거, 코드 길이 감소, 재사용성 증가
		//단점 : 가독성 떨어짐
		
		
		this(userId,userPw);
		
		
		//this.userId =userId;
		//this.userPw =userPw;
		this.userName =userName;
		this.userAge =userAge;
		this.userGender =userGender;
		
	}
	//자바는 기본적으로 필드명,생성자명,메서드명,변수명의 중복을 허용하지 않음.
	
	
	//** overloading(오버로딩)**
	//클래스 내에 동일한 이름의 메서드(생성자도 포함)를 여러개 작성하는 기법
	
	
	//[오버로딩 조건]
	//1.메서드 이름이 동일
	//2.매개변수의 개수,타입(자료형),순서 중 1개라도 달라야함.
	
	//public User() {}//기본 생성자가 이미 작성 되어 있어서 성립 X
	
	public User(String userId) {}//매개변수의 갯수가 같은 생성자가 이전에 없었기에 오버로딩 성립
	
	public User(int UserAge) {}//매개변수의 갯수는 위에 생성자와 같지만, 타입이 다르기에 오버로딩 성립
	
	public User(String userID,int userAge) {}//위에 두개짜리 매개변수 생성자는 둘다 스트링 타입인데 
	//매개변수의 갯수가 동일한것은 있지만, 하나의 타입이 다르기에 오버로딩 성립.
	
	public User(int userAge,String userId) {}// 매개변수의 갯수와 타입은 같지만 순서가 다르기에 오버로딩 성립.

	
	//public User(int userAge,String UserName) {}//바로 위의 매개변수와 타입도, 갯수도 같고, 순서도 같다.
	//=>변수명은 신경안씀	
	
	
	//기능(생성자+메서드)
	
	/*생성자 (constructor) 
	 * 
	 * - new 연산자를 통해서 객체를 생성할때 
	 * 생성된 객체의 필드 값 초기화 + 지정된 기능을 수행하는 역할 
	 * 
	 * -생성자 작성 규칙 
	 * 1.생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 2.반환형이 존재하지 않는다.
	 * 
	 * - 생성자 종류
	 * 1. 기본 생성자
	 * 2. 매개변수 생성자
	 * 
	 * */
			
	//toString()메서드 : object라는 최상위 클래스 이미 만들어져있는 메서드
	//객체가 문자열로 변환될때 호출되는 메서드
	//=>보통 객체가 메서드 값을  출력하는 용도로 오버라이딩 해서 사용함.
	
	@Override//@(어노테이션) : 컴파일러 인식용 주석
	//override: 메서드가 부모클래스의 메서드를 "정확히"재정의(오버라이딩)검사
	//1.만약에 오타가 있거나, 부모클래스에 없는 매서드를 잘못 작성했을경우 컴파일 오류 발생.
	//2.이 메서드가 부모 크래스를 재정의 했다는것을 한눈에 알수 있음
		
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + "]";
	}
	
}
