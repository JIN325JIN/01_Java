package collection.com.hw2.run;

import collection.com.hw2.model.dto.Monkey;
import collection.com.hw2.model.dto.Tiger;
import collection.com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();//zoo 객체 생성
		
		zoo.addAnimal(new Tiger("호랑이")); 
		zoo.addAnimal(new Monkey("원숭이"));
		zoo.displayMenu();
		
		
		
	}

}
