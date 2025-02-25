package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		//스마트폰 객체 생성
		SmartPhone sp = new SmartPhone("SAMSUNG","GALAXY20",2020,120000,"android",128);
		
		/*
		sp.setBrand("SAMSUNG");
		sp.setModel("GALAXY S20");
		sp.setYear(2020);
		sp.setPrice(1200000);
		sp.setOperatingSystem("Android");
		sp.setStorageCapacity(128);
		*/
		sp.printInfo();
	
		System.out.println("===============================");
	
		//베이직폰 객체 생성
		BasicPhone bp = new BasicPhone("nokia","3310",2000,100000,true);
		/*
		bp.setBrand("Nokia");
		bp.setModel("3310");
		bp.setYear(2000);
		bp.setPrice(100000);
		*/
		bp.printInfo();
		bp.checkKeyboard();
	}
}
