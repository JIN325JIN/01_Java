package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		
		SmartPhone smartphone = new SmartPhone("Samsung","Galaxy",2020,1200000,"Android",128);
		
		BasicPhone basicphone = new BasicPhone("Nokia","3310",2000,100000,true);
		
		smartphone.printInfo();
		System.out.println("==========");
		basicphone.printInfo();
		basicphone.checkKeyboard();
	}

}
