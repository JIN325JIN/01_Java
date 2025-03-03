package collection.com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collection.com.hw3.model.dto.Book;

public class Bookservice {
	
	private List<Book> booklist = new ArrayList<>();
	
	public Bookservice() {
		booklist.add(new Book(1111,"세이노의 가르침","세이노",6480,"데이원"));
		booklist.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베개"));
		booklist.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		booklist.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		booklist.add(new Book(5555,"도둑 맞은 집중력 ","요한 하리",16920,"어크로스"));
	}
	
	public void menuInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====도서 목록 프로그램====");
		int menuNum= 0;
		
		do {
			
			System.out.println("1.도서 등록");
			System.out.println("2.도서 조회");
			System.out.println("3.도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨찾기 삭제");
			System.out.println("7.즐겨찾기 조회");
			System.out.println("8.추천도서 뽑기");
			System.out.println("0.프로그램 종료");
			
			
			System.out.print("메뉴를 입력하세요 :");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				break;
			case 2:
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
			case 8:
				break;
			case 0:System.out.println("프로그램 종료...");
				break;
			}

		}while(menuNum!=0);
		
		
	}

	public void addBook() {}
	
	public void randomBook() {}


}
