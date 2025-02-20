package edu.kh.oop.practice.run;
 
import edu.kh.oop.practice.model.service.Bookservice;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		
		//BookService 객체를 생성한 후 practice 메소드 호출
		Bookservice bs = new Bookservice();
		bs.practice();
		
		//HeroService 객체를 생성한 후 practice() 메소드를 호출
		HeroService hs = new HeroService();
		hs.practice();
	
	
	
	}
}
