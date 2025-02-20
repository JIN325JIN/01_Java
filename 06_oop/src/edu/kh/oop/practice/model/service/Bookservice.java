package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class Bookservice {

	//메서드
	public void practice() {
	
		//1. 기본 생성자를 이용하여 첫번째 book객체 생성
		Book book1 = new Book();
		
		//2. 매개변수 생성자를 이용하여 두번째 book 객체 생성 (사용데이터 참고)
		Book book2 = new Book("자바의 정석",30000,0.2,"남궁성");//
		
		//3. 객체가 가진 필드값을 tostring이용하여 출력
		System.out.println(book1.toString());
		System.out.println(book2.toString());
	
		
		
		//4.첫번째 객체가 가진 값을 setter이용하여 수정
		System.out.println("============================");
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		//5.수정된 객체의 필드값을 tostring이용하여 출력
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString());
		System.out.println("============================");
		
		//getter 메소드를 이용하여 할인율을 적용한 책 가격 출력
		//6.각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		//7.할인된 가격 = 가격 - (가격*할인율)
		System.out.println("도서명 = "+book1.getTitle());
		System.out.println("할인된 가격 = "+ (int)(book1.getPrice()-book1.getPrice()*book1.getDiscountRate())+"원");
		System.out.println("도서명 = "+book2.getTitle());
		System.out.println("할인된 가격 ="+ (int)(book2.getPrice()-book2.getPrice()*book2.getDiscountRate())+"원");
		
	}
}
