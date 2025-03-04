package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoners;//전체 수용자 저장용
	private int prisonerCount;//수용자 수
	
	//매개변수로 전달받은 size를 이용하여 Prisoner 객체배열을 size 크기로 생성한다.
	// prisonerCount는 0으로 초기화한다.
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount=0;
	}
	public Prisoner[] getPrisoners() {
		return prisoners;
	}
	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}
	public int getPrisonerCount() {
		return prisonerCount;
	}
	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	@Override
	public void addPerson(Person person) {
		//매개변수로 전달받은 Person 객체가 Prisoner 클래스의 인스턴스이며, 배열에 공간이 있다면,
		if(person instanceof Prisoner && prisonerCount<prisoners.length) {
			//해당 객체를 prisoners 배열에 추가 후
			prisoners[prisonerCount++] = (Prisoner) person; // 다운캐스팅
			// 추가된 객체의 정보를 출력. 
			System.out.print("수감자가 추가되었습니다 - ");
					System.out.println(person.getInfo());
			
		}else {
			//만약 배열에 더 이상 공간이 없다면, 인원이모두 충원되었다는 메시지 출력
			System.out.println("인원이 모두 충원 되었습니다.");
		}
	}
	@Override
	public void removePerson(String id) {
		//매개변수로 전달받은 id와 일치하는 수감자를 찾으면, 해당 수감자를 삭제하고 관련 정보를 출력. 
		//일치하는 id가 없다면 해당 id를 가진 수감자를 찾을 수 없다는 메시지를 출력.		
		for(int i =0; i<prisoners.length;i++) {
			
			if(prisoners[i].getId().equals(id) ){
				System.out.println("수감자가 삭제되었습니다. "+ prisoners[i].getInfo());
				prisoners[i]=null;
				
				
				for (int j = i; j < prisonerCount - 1; j++) {//삭제된 위치 i 부터 끝까지
					prisoners[j] = prisoners[j + 1];//지금 null이니까 한칸씩 뒤에있는 애를 앞으로 땡겨준다.
				}

				prisoners[--prisonerCount] = null;//마지막에 중복되어있는애를 지운다.
				return;
			}
			
		}
		System.out.println("일치하는 ID가 없습니다.");
		
	}
	@Override
	public void displayAllPersons() {
       //전체 수감자 명단을출력하는 기능		
		System.out.println("전체 수감자 명단 : ");
		for(int i =0; i<prisonerCount;i++) {
			System.out.println(prisoners[i].getInfo());
		}
	}
}
