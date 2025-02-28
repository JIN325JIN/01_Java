package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		//service.ex();
		service.displayMenu();
	
	/*
		List<Integer> numberList = new ArrayList<Integer>();
		
		numberList.add(5);
		numberList.add(3);
		numberList.add(1);
		numberList.add(4);
		numberList.add(2);
	
		System.out.println(numberList);//정렬 전.
		
		//숫자 리스트를 정렬 
		//Integar 는 이미 Comparable 을 상속 받아 compareTo()정의함
		Collections.sort(numberList);//numberList는 정렬이 기억됨
		
		System.out.println(numberList);
	*/
	
	}

}
