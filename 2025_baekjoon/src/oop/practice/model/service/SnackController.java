package oop.practice.model.service;

import java.util.Scanner;

import oop.practice.model.vo.Snack;

public class SnackController {

	Snack s = new Snack();
	
	public SnackController() {}
	
	/**
	 * 데이터를 setter 를 이용해 저장하고 저장완료 되었다는 결과를 반환하는 메소드
	 */
	public String saveData(String kind,String name,String flavor,int numOf,int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료되었습니다.\n"+"저장된 정보를 확인하시겠습니까? (y/n) :";
		
		}
	/**
	 * 저장된 데이터를 반환하는 메소드
	 */
	public String confirmData() {
		
			return s.information();
	}
}
