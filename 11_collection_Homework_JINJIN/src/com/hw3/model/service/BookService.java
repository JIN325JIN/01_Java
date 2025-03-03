package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.hw3.model.dto.Book;

public class BookService {
	private Scanner sc = new Scanner(System.in);
	public BookService() {
		
		bookList.add(new Book(1111,"세이노의 가르침","세이노",6480,"데이원"));
		bookList.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베개"));
		bookList.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		bookList.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		bookList.add(new Book(5555,"도둑 맞은 집중력 ","요한 하리",16920,"어크로스"));
	}

	private List<Book> bookList =new ArrayList<>();//책 정보를 저장할 리스트
	
	public void displayMenu() {
			int menuNum =0;//메뉴 선택용 변수
		
		do {
			System.out.println("\n====도서 목록 프로그램 ====");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 조회");
			System.out.println("3.도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨 찾기 삭제");
			System.out.println("7.즐겨 찾기 조회");
			System.out.println("8.추천도서 뽑기");
			System.out.println("0.프로그램 종료");
			
			System.out.print("메뉴를 입력 하세요 : ");
			
			
				menuNum =sc.nextInt();	
				sc.nextLine();//입력버퍼 개행문자 제거용
				
				switch(menuNum) {
				case 1:System.out.println(addBook());
				break;
				case 2:bookInfo();
				break;
				case 3:
				break;
				case 4:
				break;
				case 5:
				break;
				case 6:
				break;
				case 7: 
				break;
				case 8:recommandBook();
				break;
				case 0:System.out.println("프로그램 종료.");
				break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
			}
		}while(menuNum!=0);
	}
	
	public String addBook() {
		System.out.println("====도서등록====");
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		System.out.print("도서 제목 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		
		
		if(bookList.add(new Book(num,name,author,price,publisher))) {
			return "등록완료";
		}else {
			return "등록 실패";
		}
	}
	public void bookInfo() {
		if(bookList.isEmpty()) {
			System.out.println("조회할 책이 없습니다.");
			return ;
		}else {
			for(int i =0; i<bookList.size();i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
	public void recommandBook() {
		int randomBook = (int) (Math.random()*bookList.size());
		Book recommand = bookList.get(randomBook);
		System.out.println("추천도서 이름은 :" +recommand.getName() );
	}
}
