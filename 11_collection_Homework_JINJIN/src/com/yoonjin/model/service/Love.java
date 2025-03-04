package com.yoonjin.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.yoonjin.model.dto.Boyfriend;

public class Love {
	//이윤진이 그동안 사귄 남자 정보 프로그램
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Boyfriend> boyfriendList = new ArrayList<>();//그동안 사귄 남자친구들 저장 리스트
	//근데 그안에 <보이프렌드>제네릭 만 저장할수잇음
	
	
	private List<Boyfriend> favorite = new ArrayList<>();//엄마의 최애캐 저장용 리스트
	
	public Love() {//이름의 가나다 순으로 작성
		boyfriendList.add(new Boyfriend("권동영",34,178,"과CC","100일"));
		boyfriendList.add(new Boyfriend("김상현",32,177,"과CC","4년"));
		boyfriendList.add(new Boyfriend("유동현",35,168,"과CC","3년"));
		boyfriendList.add(new Boyfriend("전영현",34,180,"대학 선배","60일"));
		boyfriendList.add(new Boyfriend("홍지효",31,178,"카페","300일"));
	}
	
	public void showBoyfriends() {
		
		try {
				int menuNum = 0;
		
				do {
						System.out.println();
						System.out.println("♥♡♥♡♥이윤진의 남자친구 들에 대하여♥♡♥♡♥");
						System.out.println();
						System.out.println("1. 새로운 남친 추가 하기");
						System.out.println("2. 남친 목록 조회 하기");
						System.out.println("3. 남자친구 키 수정 하기 ");
						System.out.println("4. 최악의 남친이라서 삭제 하기");
						System.out.println("5. 키 순으로 정렬시키기 ㅋㅋ(작은->큰)");
						System.out.println("6. 엄마픽 신랑 후보 ");
						System.out.println("7. 엄마픽 신랑감 조회 ");
						System.out.println("8. 엄마픽 신랑감 후보 삭제!!");
						System.out.println("0. 프로그램 종료  ");
						System.out.println();
						System.out.print("실행하고싶은 숫자를 입력하세요 : ");
						menuNum = sc.nextInt();
			
						switch(menuNum) {
						case 1:addBoyfriend();
							break;
						case 2:selectBoyfriend();
							break;
						case 3:updateBoyfriend();
							break;
						case 4:deleteBoyfriend();
							break;
						case 5:sortByHeight();
							break;
						case 6:momsFavorite();
							break;
						case 7:showMomsFavorite();
							break;
						case 8:System.out.println(deleteMomsFavorite());
							break;
						case 0:System.out.println("프로그램을 종료합니다!!!");
							break;
							default : System.out.println("메뉴에 있는것만 물어볼수 있습니다!!!");
						}
					}while(menuNum!=0);
					
			}catch(Exception e) {//숫자를 입력받는 메뉴넘 칸에 스트링 같은 문자열이 입력되었을때를 대비하여 , 트라이캐치구문 사용
				System.out.println("예외 발생");
					e.printStackTrace();
			}
	}
					
	public void addBoyfriend() {
		System.out.println("이윤진 남자친구 목록에 새로운 남자 추가하기~~!!");
		System.out.print("남친 이름 : ");
		String name = sc.next();
		System.out.print("남친 나이 : ");
		int age = sc.nextInt();
		System.out.print("남친 키 : ");
		int height = sc.nextInt();
		sc.nextLine();//입력 버퍼 제거용
		System.out.print("남친 만난곳 : ");
		String place = sc.next();
		System.out.print("남친 사귄 기간 : ");
		String year = sc.next();
		
		
		//Boyfriend Boyfriend = new Boyfriend(name,age,height,place,year);//객체를 생성할때 이렇게 해도 되고

		//boyfriendList에 바로 add를 사용해서 객체를 추가하는 방법도 있음
		if(boyfriendList.add(new Boyfriend(name,age,height,place,year))) {
			System.out.println("성공적으로 남친 리스트에 추가 완료 >_< ");
		}
		else {
			System.out.println("등록 실패 .....");
		}
	}
	
	public void selectBoyfriend() {
		
		if(boyfriendList.isEmpty()) {
			System.out.println("남자친구가 한명도 없습니다....! 그럴리가 없으니 얼른 등록해주세용");
		}else {
			for(Boyfriend boy:boyfriendList) {
				System.out.println(boy);
			}
		}
	}
	
	public void updateBoyfriend() {
		System.out.println("누구의 키를 수정할까요?");
		String name = sc.next();
		
		
		System.out.println("키를 몇으로 수정할까요?");
		int newheight = sc.nextInt();
		
		
		for(Boyfriend boy : boyfriendList) {
			
			if(boy.getName().equals(name)) {
				boy.setHeight(newheight);
			}
		}
		System.out.println("수정되었습니다.");
	}
	
	public void deleteBoyfriend() {//다시
		
		//boyfriendList.remove(int index);
		//리스트에서 index번째 요소를 제거 이때 제거된 요소가 반환됨.
		//원래는 향상된 포문으로 지우려고했는데 ConcurrentModificationException이 자꾸 발생해서
		//gpt한테 물어보니, Iterator를 사용하라고함

		
		System.out.print("삭제할 남자친구의 이름을 적어주세요 : ");
		String boyfriendName = sc.next();//지우고싶은 남자 친구이름
		
		Iterator<Boyfriend> iterator = boyfriendList.iterator();//리무브를 하기위한 이터레이터
		
        boolean flag = false;
		
		while(iterator.hasNext()) {
			
		Boyfriend boy = iterator.next();
		
		//보이프렌드 리스트를 순회하며 보이프렌드 타입을 찾는데
			
			if(boyfriendName.equals(boy.getName())) {//지우고 싶은 남자 이름과 내 리스트 에서 get이름을 한게 같다면
				
				iterator.remove();
				flag = true;
				
				System.out.println(boyfriendName +"을 인생에서 삭제했습니다.");
				break;
			}
		}
		
		if(!flag) {
			System.out.println(boyfriendName +" 은/는 사귄적이 없으므로 인생에서 지울수 없습니다...");
			
		}
	}
	
	public void sortByHeight() {
		
		Collections.sort(boyfriendList);//쓰려면 compare 재정의 필요함
		
		for(Boyfriend boy : boyfriendList) {
			System.out.println(boy);
		}
	}
	
	public void momsFavorite() {
		System.out.println("==엄마 최애캐 추가하기== ");
		
		System.out.print("남친 이름 : ");
		String name = sc.next();
		System.out.print("남친 나이 : ");
		int age = sc.nextInt();
		System.out.print("남친 키 : ");
		int height = sc.nextInt();
		sc.nextLine();//입력 버퍼 제거용
		System.out.print("남친 만난곳 : ");
		String place = sc.next();
		System.out.print("남친 사귄 기간 : ");
		String year = sc.next();
		
		if(favorite.add(new Boyfriend(name,age,height,place,year))) {
			System.out.println("엄마의 신랑감 후보로 등록되었습니다.");
		}else {
			System.out.println("엄마의 맘속에 들지 못했나봐요,,,,,");
		}
		
		
	}
	
	public void showMomsFavorite() {
		System.out.println("엄마의 신랑감 후보를 한번 확인해보겠습니다.");

		for(int i =0; i<favorite.size();i++) {
			System.out.println(favorite.get(i));
		}
	}
	
	public String deleteMomsFavorite() {
		
		Iterator<Boyfriend> iterator = favorite.iterator();//리무브를 하기위한 이터레이터
		System.out.println("====엄마의 신랑감 후보를 삭제하겠습니다.====");
		
		if(favorite.isEmpty()) {
			return "삭제할 신랑감 후보가 없습니다.";
		}
		
		System.out.print("삭제할 남자친구의 이름을 적어주세요 : ");
		String boyfriendName = sc.next();//지우고싶은 남자 친구이름
		
		boolean flag = false;
		
		while(iterator.hasNext()) {
			
			Boyfriend boy = iterator.next();
			
			//보이프렌드 리스트를 순회하며 보이프렌드 타입을 찾는데
				
				if(boyfriendName.equals(boy.getName())) {//지우고 싶은 남자 이름과 내 리스트 에서 get이름을 한게 같다면
					
					iterator.remove();
					flag = true;
					
					return boyfriendName +"을 엄마의 신랑감 후보에서 삭제했습니다.";
				}
			}
			if(!flag) {
				return boyfriendName +" 은/는 애초에 엄마의 신랑감 리스트에 들지도 못했습니다.";
			}
			return "";
	}
}
