package com.toyFactory.model.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;


public class ToyFactory implements Comparable<Toy>{

	//필드 3개
	//스캐너, 중복된 객체가 없도록 저장할 컬렉션  set,
	//재료가 저장되어 있는 Map <integer,STring>
	
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toyset = new HashSet<Toy>();
	
	private Map<Integer, String > materialMap = new HashMap<Integer, String>();
	
	//재료 추가하는 매서드
	//add meterials 메서드 작성
	//-> 재료가 몇개 들어올지 정해져 있지않음 (1개,2개,3개)
	
	//애드매태리얼즈 (전달인자가 몇개인지 정해져있지않음)
	//->가변인자 : 자료형...변수명 (int ...nums)
	
	public ToyFactory() {
		//기본등록재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		toyset.add(new Toy("미미롱래그",8,36000,"분홍색","19950805", addMeterials(1,4)));
		toyset.add(new Toy("허기워기",5,12000,"파란색","19940312",addMeterials(1,2)));
		toyset.add(new Toy("키시미시",5,15000,"분홍색","19940505",addMeterials(1,2)));
		toyset.add(new Toy("킷냅",8,27000,"보라색","19960128",addMeterials(1,2)));
		toyset.add(new Toy("파피",12,57000,"빨간색","19931225",addMeterials(1,2,4)));
	}
	public ToyFactory(Scanner sc, Set<Toy> toyset, Map<Integer, String> materialMap) {
		super();
		this.sc = sc;
		this.toyset = toyset;
		this.materialMap = materialMap;
	}
	public void displayMenu() {
		try {
			int menuNum = 0;
	
			do {
					System.out.println();
					System.out.println("플레이타임 공장");
					System.out.println("1. 전체 장난감 조회 하기");
					System.out.println("2. 새로운 장난감 만들기");
					System.out.println("3. 장난감 삭제하기 ");
					System.out.println("4. 장난감 제조일 순으로 정리하기");
					System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
					System.out.println("6. 재료추가");
					System.out.println("7. 재료 제거 ");
					System.out.println("0. 프로그램 종료  ");
					System.out.println();
					System.out.print("실행하고싶은 숫자를 입력하세요 : ");
					menuNum = sc.nextInt();
		
					switch(menuNum) {
					case 1: toyInfo();
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					case 0:System.out.println("프로그램을 종료합니다!!!");
						break;
						default : System.out.println("0~7까지의 숫자만 입력 가능");
					}
				}while(menuNum!=0);
				
		}catch(Exception e) {//숫자를 입력받는 메뉴넘 칸에 스트링 같은 문자열이 입력되었을때를 대비하여 , 트라이캐치구문 사용
			System.out.println("예외 발생");
				e.printStackTrace();
		}
	}
	public void toyInfo() {
		for(Toy toy :toyset) {
			System.out.println(toy);
		}
	}


	public void addToy() {
		System.out.println("<새로운 장난감 추가 >");
		System.out.print("장난감 이름 :");
		String name = sc.next();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		System.out.println("색상 : ");
		String color = sc.next();
		System.out.println("제조일 (YYYY MM DD형식으로 입력) :");
		String year =sc.next();
	}
	public void deleteToy() {
		
	}
	
	public void sortByYear() {
		//Collections.sort((List<T>) toyset);//쓰려면 compare 재정의 필요함
		
		for(Toy toy : toyset) {
			System.out.println(toy);
		}
	}
	
	public Set <String> addMeterials(/*Integer...materials*/ ) {
		System.out.println("<재료 추가>");
		System.out.println("====현재 등록된 재료 ====");
		//material.put(1, "면직물");
		//material.put(2, "플라스틱");
		//material.put(3, "유리");
		//material.put(4, "고무");
	
		//System.out.println(materials);
		
		System.out.print("재료 고유 번호 (key)입력 :");
		int materialKey = sc.nextInt();
		System.out.print("재료명 입력 :");
		int materialName = sc.nextInt();
		
		
		}


	
	@Override
	public int compareTo(Toy o) {
		return 0; //오버라이딩 해야함
	}
}
