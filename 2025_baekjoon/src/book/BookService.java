package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {

	private Scanner sc = new Scanner(System.in);
	private List <Book> booklist = new ArrayList<>();//도서목록
	private List <Book> favorite = new ArrayList<>();//즐겨찾기목록
	
	
	public BookService() {
		
		booklist.add(new Book(1111,"세이노의가르침","세이노",6480,"데이원"));
		booklist.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베개"));
		booklist.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		booklist.add(new Book(4444,"꿀벌의 에언","베르나르 베르베르",15120,"열린책들"));
		booklist.add(new Book(5555,"도둑맞은 집중력","요한 하리",16920,"어크로스"));
	}
	


	public void displayMenu() {
		int menuNum = 0;
		
		do {

			System.out.println("===도서 목록 프로 그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨찾기 삭제");
			System.out.println("7.즐겨찾기 조회");
			System.out.println("8.추천도서 뽑기");
			System.out.println("0.프로그램 종료");
			
			System.out.print("메뉴를 입력하세요 :");
		
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1:System.out.println(addBook());
				break;
			case 2:bookInfo();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:System.out.println(addFavorite());
				break;
			case 6:
				break;
			case 7:favoriteInfo();
				break;
			case 8:
				break;
			case 0: System.out.println("프로그램 종료");
				break;
			default :System.out.println("0~9까지의 숫자만 입력하세요.");
			}
			
			
			
			
		}while(menuNum!=0);
		
	}

	public String addBook() {
		
		System.out.println("====도서등록====");
		
		System.out.print("도서 번호 :");
		int bookNumber = sc.nextInt();
		
		System.out.print("도서 제목 :");
		String name = sc.next();
		sc.nextLine();
		System.out.print("도서 저자 :");
		String author = sc.next();
		
		System.out.print("도서 가격 :");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("도서 출판사 :");
		String publisher = sc.next();
		
		if(booklist.add(new Book(bookNumber,name,author,price,publisher))) {
			return "등록 완료";
		}
		return "등록 실패";
		
	}
	public void bookInfo() {
		
		if(booklist.isEmpty()) {
			System.out.println("조회할 책이 없습니다.");
		}
		for(Book b : booklist) {
			System.out.println(b);
		}
		
	}
	public void updateBook() {
		System.out.println("수정할 도서 번호 입력하세요 :");
		int bookNumber = sc.nextInt();
		
		System.out.print("도서 저자 :");
		String author = sc.next();
		
		System.out.print("도서 가격 :");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("도서 출판사 :");
		String publisher = sc.next();
		
		
	}
	
	public void deleteBook() {
		
		
		
		
	}
	
	public String addFavorite() {
		System.out.println("====즐겨찾기 추가 ====");
		
	System.out.println("====도서등록====");
		
		System.out.print("즐겨 찾는 도서 번호 :");
		int bookNumber = sc.nextInt();
		
		System.out.print("즐겨 찾는 도서 제목 :");
		String name = sc.next();
		sc.nextLine();
		System.out.print("즐겨 찾는 도서 저자 :");
		String author = sc.next();
		
		System.out.print("즐겨 찾는 도서 가격 :");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("즐겨 찾는 도서 출판사 :");
		String publisher = sc.next();
		
		if(favorite.add(new Book(bookNumber,name,author,price,publisher))) {
			return "등록 완료";
		}
		return "등록 실패";
	}

	public void deleteFavorite() {
		
		
	}
	
	public void favoriteInfo() {
		
		System.out.println("====즐겨찾는 도서 목록 조회====");
		
		if(favorite.isEmpty()) {
			System.out.println("등록된 즐겨찾기가 없습니다.");
		}
		for(Book f:favorite) {
			System.out.println(f);
		}
	}

	public void randomBook() {
		
		int random = (int)(Math.random()*booklist.size()+1);
		//Book random = booklist.get(random);
		
		
	}

}
