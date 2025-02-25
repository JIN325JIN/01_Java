package edu.kh.com.inheritance.model.dto;


//object
// ㄴ Person
//      ㄴ employee

public /*final*/ class Employee extends Person{
	//final 클래스 : 상속불가 (누군가의 부모가 될수없다)
	//->제공되는 클래스 그대로 사용해야 하는 경우
	//ex->String 클래스, 	

	//필드
	private String company;

	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}
	//Person 으로 부터 상속받은 메서드중에 move()메서드를 employee 에 맞게 오버라이딩 하겠다.(재정의)
	//@Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을 컴파일러에게 알려주는 역할 
	//->컴파일러에게 문법체크를 하도록 알린다.
	//-> 부모에게 해당 메서드가 있는지 체크
	//=> 이름, 매개변수, 타입, 개수,순서 일치 여부 검사
	
	@Override
	public void move() {
		//super 참조변수 : 상속 관계에서 부모 객체를 가리키는 참조변수
		//super.move(str, num);
		System.out.println("오버라이딩된 move");
		System.out.println("효율적으로 일하고 빨리 퇴근한다.");
	}
	
	public Employee(String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return super.toString()+"/"+company;
	}
	
	//final메서드 -> 오버라이딩 불가
	//메서드의 기능이 변하면 안되는 경우 사용
	public final void onlyEmployee() {
		System.out.println("final메서드 입니다.");
	}
}
