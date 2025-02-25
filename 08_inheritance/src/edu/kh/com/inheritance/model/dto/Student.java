package edu.kh.com.inheritance.model.dto;

//Object
//   ㄴPerson
//       ㄴ Student

//상속방법 : 자식 extends 부모
public class Student extends Person{
//student 클래스에 person클래스 내용을 확장한다.연장한다
//student클래스에 person클래스의 필드, 메서드를 추가하여 확장한다.
	
	/*person이 가지고 있는 코드는 지워도 됨. getter setter또한
	private String name;//이름
	private int age;//나이
	private String nationality;//국적
	*/
	
	private int grade;//학년
	private int classRoom;//반
	
	public Student() {}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		super(name, age, nationality);//person의 매개변수 생성자 의미
		//왜 안될까? this참조변수는 본인 자신만을 의미함 (student만. person x)
		//상속을 받았어요 name,age,nationality는 부모의 고유 필드 이기때문에
		//자식인 student에서 this 참조변수를 이용해 직접 접근 불가
		//setter는 이용가능
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		//부모의 setter를 이용은 할수 있지만 비 효율적.그래서 super 생성자가 나옴!
		//super(); -부모의 기본 생성자
		//super (매개변수....) - 부모의 매개변수 생성자
		this.name =name;
		this.age= age;
		this.nationality;
		*/
		this.grade = grade;
		this.classRoom = classRoom;
	}
	/*
	public Student(String name, int age, String nationality, int grade, String classRoom) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.grade = grade;
		this.classRoom = classRoom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		//이름 나이 국적 학년 반
		return super.toString()+"/"+grade+"/"+classRoom;
	}
}
