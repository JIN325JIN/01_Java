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
	
	private List<Book> bookList =new ArrayList<>();//책 정보를 저장할 리스트
	
	private List<Book> favorite = new ArrayList<>();//즐겨 찾기 저장할 리스트
	
	public BookService() {
		
		bookList.add(new Book(1111,"세이노의 가르침","세이노",6480,"데이원"));
		bookList.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베개"));
		bookList.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		bookList.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		bookList.add(new Book(5555,"도둑 맞은 집중력 ","요한 하리",16920,"어크로스"));
	}

	
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
				case 3:updateBook();
				break;
				case 4:System.out.println(removeBook());
				break;
				case 5:System.out.println(addFavorite());
				break;
				case 6:System.out.println(removeFavorite());
				break;
				case 7: favoriteInfo();
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
		}else {
			//for(int i =0; i<bookList.size();i++) {
			//	System.out.println(bookList.get(i));
			//}
			for(Book book : bookList) {
				System.out.println(book);
			}
		}
	}
	public void recommandBook() {
		int randomBook = (int) (Math.random()*bookList.size());
		Book recommand = bookList.get(randomBook);
		System.out.println("추천도서 이름은 :" +recommand.getName() );
	}
	public void updateBook() {
		System.out.println("====도서 수정====");
		bookInfo();
		
		int editMenu =0;
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
			
			for(Book book : bookList) {
				if(book.getNum()==bookNum) {
					flag = false;

					System.out.println("1.도서명");
					System.out.println("2.도서 저자");
					System.out.println("3.도서 가격");
					System.out.println("4.도서 출판사");
					System.out.println("0.수정 종료");
					System.out.print(" 어떤 정보를 수정하시겠습니까?");
					
					editMenu = sc.nextInt();
					sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
					
					switch(editMenu){
					case 1:
						System.out.print("수정할 도서명 입력 :");
						String newname = sc.next();
						book.setName(newname);
						break;
					case 2:
						System.out.print("수정할 저자 입력 :");
					String newAuthor = sc.next();
					book.setAuthor(newAuthor);
						break;
					case 3:System.out.print("수정할 가격 입력 :");
					int newprice = sc.nextInt();
					book.setPrice(newprice);
						break;
					case 4:System.out.print("수정할 출판사 입력 :");
					String newpublisher = sc.next();
					book.setPublisher(newpublisher);
						break;
					case 0:System.out.println("수정 종료");
						break;
					default :System.out.println("0~4까지의 번호만 입력가능");
							
					}
				}
			}
			
			if(flag) {
				System.out.println("일치하는 도서 번호가 없습니다.");
			}
			System.out.println("수정완료");
	}
	public String addFavorite() {
		System.out.println("====즐겨 찾기 도서등록====");
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
		
		if(favorite.add(new Book(num,name,author,price,publisher))) {
			return "즐겨찾는 도서 등록 완료";
		}else {
			return "즐겨 찾는 도서 등록 실패";
		}
	}
	public void favoriteInfo() {
		if(favorite.isEmpty()) {
			System.out.println("조회할 책이 없습니다.");
			
		}else {
			for(int i =0; i<favorite.size();i++) {
				System.out.println(favorite.get(i));
			}
		}
	}

	public String removeBook() {
		System.out.println("====등록된 도서 제거 ====");
		//Student List.remove(int index);
				//리스트에서 index번째 요소를 제거
				//이때 제거된 요소가 반환됨.
				//List중간에 비어있는 인덱스가 없게 하기 위해서 
				//remove() 동작 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.
		System.out.println("삭제할 도서의 인덱스 번호 를 입력해주세요.");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return "입력 정보가 없습니다.";
			//2.입력된 숫자가 0보다 작은지
		}else if(index <0 ) {
			return "음수는 입력할 수 없습니다.";
			//student List 범위 내 인덱스 번호인지 검사
		}else if (index >= bookList.size()) {
			return "범위를 벗어선 값을 입력할 수 없습니다.";
		}
		
		//4. 삭제
		System.out.println("정말 삭제하시겠습니까? : Y/N");
		char ch =sc.next().toUpperCase().charAt(0);//대문자로 변환 후 차앳 사용.
		//"y"->"Y"->'Y'
		
		if(ch=='Y'||ch =='y') {
			Book temp =bookList.remove(index);
			return temp.getName()+"의 정보가 제거되었습니다.";
		}
		
		return "취소";
	
	}
	public String removeFavorite() {
		System.out.println("====등록된 즐겨찾기 도서 제거 ====");
		
		
		System.out.println("삭제할 도서 번호를 입력해주세요.");
		int index = sc.nextInt();
		
		if(bookList.isEmpty()) {
			return "입력된 즐겨찾기 가 없습니다.";
			//2.입력된 숫자가 0보다 작은지
		}else if(index <0 ) {
			return "음수는 입력할 수 없습니다.";
			//student List 범위 내 인덱스 번호인지 검사
		}else if (index >= bookList.size()) {
			return "범위를 벗어선 값을 입력할 수 없습니다.";
		}
		
		//4. 삭제
		System.out.println("정말 삭제하시겠습니까? : Y/N");
		char ch =sc.next().toUpperCase().charAt(0);//대문자로 변환 후 차앳 사용.
		//"y"->"Y"->'Y'
		
		if(ch=='Y'||ch =='y') {
			Book temp =bookList.remove(index);
			return temp.getName()+"의 정보가 제거되었습니다.";
		}
		
		return "취소";
	}
}


