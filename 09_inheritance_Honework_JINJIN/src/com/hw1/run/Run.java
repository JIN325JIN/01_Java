package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {

		
		//BOOK 객체 배열 3칸 생성 후 각 인덱스마다 Novel,textbook,poetry생성하여 대입
		//모든 도서 정보 출력
		
		Book[] book = new Book[3];
		
		book[0]= new Novel ("해리포터","J.K 롤링","판타지");
		book[1]= new Textbook("자바프로그래밍","James Gosling","컴퓨터과학");
		book[2] = new Poetry ("우리들의 사랑시","김소월",30);
		
		
		book[0].displayInfo();
		book[1].displayInfo();
		book[2].displayInfo();
		
		
		
	}

}
