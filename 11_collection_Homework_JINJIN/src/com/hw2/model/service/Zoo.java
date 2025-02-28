package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo  {

	Scanner sc = new Scanner(System.in);
	
	private List <Animal> animallist;
	
	public Zoo() {
		animallist = new ArrayList<Animal>();
	}

	public void addAnimal(Animal animal) {
		animallist.add(animal);
	}
	public void showAnimals() {
		System.out.println("동물들의 울음 소리를 들어보세요.");
		for (Animal animal :animallist) {
			animal.sound();
		}
		
	}
	public void displayMenu() {
		
		int menuNum =0;
		
		
		do {
			System.out.println("====KH동물원 ====");
			System.out.println("원하는 작업을 선택하세요.");
			System.out.println("1.동물들의 울음소리 듣기");
			System.out.println("2.종료");
			
			System.out.print("선택 : ");
			
			menuNum= sc.nextInt();
			
			//추후 트라이 캐치로 예외 보완
			switch(menuNum) {
			case 1: showAnimals();
			break;
			case 2:System.out.println("프로그램을 종료합니다.");
			break;
			default : System.out.println("메뉴에 작성된 번호만 입력하세요!");

			
			}
			
		}while(menuNum!=2);
	
	}

}
