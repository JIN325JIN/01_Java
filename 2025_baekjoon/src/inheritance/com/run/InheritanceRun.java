package inheritance.com.run;

import inheritance.com.model.dto.Book;
import inheritance.com.model.dto.Novel;
import inheritance.com.model.dto.Poetry;
import inheritance.com.model.dto.Textbook;

public class InheritanceRun {

	public static void main(String[] args) {

		Book[] book = new Book[3];
		
		book[0]= new Novel("해리포터","롤링","판타지");
		book[1]= new Textbook("자바프로그래밍","제임스","컴퓨터과학");
		book[2]= new Poetry("우리들의 사랑시 ","김소월",30);
		
		for(int i =0 ;i<book.length;i++) {
			book[i].displayInfo();
		}
	}
}
