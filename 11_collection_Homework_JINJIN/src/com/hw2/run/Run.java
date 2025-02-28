package com.hw2.run;


import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();//zoo 객체 생성
	
		//tiger 객체 생성하여 주에 추가하기
		zoo.addAnimal(new Tiger("호랑이"));
		
		//monkey객체 생성하여 zoo에 추가하기
		zoo.addAnimal(new Monkey("원숭이"));
		
		//동물원 메뉴 출력하여 입력한 값 대로 코드 수행하기
		zoo.displayMenu();
		
		
		
		
		
	}

}
