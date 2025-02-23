package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;
import com.kh.practice.snack.view.SnackMenu;

public class SnackController {
	
	//필드
	Snack s = new Snack();

	//기본생성자
	public SnackController() {}
	
	//메서드
	//데이터를 setter를 이용해 저장하고 저장완료 되었다는 결과를 반환하는 메소드
	public String saveData(String kind,String name,String flavor,int numOf,int price) {
		
		s.setKind(kind); 
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);		
		return "저장 완료되었습니다.";
	}	
	//저장된 데이터를 반환하는 메서드
	public String confirmData() {
		return s.information();
	}
}

