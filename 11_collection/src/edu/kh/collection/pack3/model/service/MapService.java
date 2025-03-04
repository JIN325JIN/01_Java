package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	//Map : Key 와 value 한쌍이 데이터가 되어 이를 모아둔 객체
	//Key : Value ->Entry (엔트리) 라고 부름.
	
	// -Key 를 모아두면 Set 의 특징 (중복 X)
	// -Value 를 모아두면 List 의 특징 (중복 O)

	
	public void ex1() {
		
		//HashMap<K,V> : Map 의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(Integer KEy, String Value) : Map 에서의 추가 기능.
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		//Key 중복 테스트 하기
		map.put(1, "이윤진");//중복허용 X , 대신 Value 덮어쓰기.
		
		//value 중복 테스트 하기
		map.put(7, "최길동");//중복 허용 O

		
		System.out.println(map);//map.toString() 오버라이딩 되어있음.
		
	}
	public void ex2() {
		//Map : 사용 예제
		//VO,DTO (값 저장용 객체) 는 특정 데이터 묶음에 재사용이 많은 경우에 주로 사용
		//-> 재사용이 적은 VO는 오히려 코드 낭비
		//-> Map을 이용해서 VO와 비슷한 코드를 작성 할 수 있음.
		
		//1.VO 버전
		Member member = new Member();
		
		//값 세팅
		member.setId("user01");
		member.setPw("pass01");
		member.setAge(30);
		
		//값 출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		
		//2.Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		//value 가 Object 타입 == 어떤 객체든 value 에 들어올 수 있다!
		
		//값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		//값 출력
		//Object(value) Map.get(String Key)이라는 메서드 이용 :
		//매개변수로 전달 받은 키와 대응 되는 Value를 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("===========================================");
		
		
		//**Map 에 저장 된 데이터 순차적으로 접근하기 **
		//{"id" = "user01","pw" ="pass02","age"=25}
		
		//Map 에서 Key 만 모아두면 set 의 특징을 가진다. (중복저장 X)
		//->이를 활용해서 KeySet()메서드 제공
		//-> Key 만 모아서 Set 객체로 반환.
		//그걸 담을 셋타임 참조변수
		
		Set<String> set = map.keySet();//id,pw,age 저장된 Set 반환
		System.out.println("Keyset(): "+set);
		
		
		
		//향상된 포문 or 이터레이터로 반환 
		for(String key : set) {//set은 안에 담긴게 string 타입으로 key 가 담겨있음.
			System.out.println(map.get(key));
		}
		
		//map에 저장된 데이터가 많거나 (반복 필요)
		//어떤 key가 있는지 불 분명 할때 (향상된 포문)
		//또는 map에 저장된 모든 데이터에 접근 해야 할때
		//keySet() + 향상된 포문 코드 사용
		
		
		
	}

	public void ex3() {
		//List 에 Map 여러개 추가하여 다루기
		
		List<Map<String, Object>>list = new ArrayList<Map<String,Object>>();//맵객체 안만들어짐 리스트만 만들어짐
		//그안에 타입이 map 이 들어온거라고 제한
		//List 객체만 생성되었고, 해당 list 에는 Map 만 들어올수 있음을 제한만 해둠.
		//=> Map 객체는 아직 생성 X
		
		for(int i =0; i<10;i++) {
			//Map 객체 생성하기
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			//Map에 데이터 추가
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			
			//Map을 List에 추가
			list.add(map);
			//hashmap 은 순서를 보장하지 않는 자료구조!
			//순서를 유지하고 싶으면 LinkedHashMap 이용하면 된다!
			//=>LinkedHashMap은 put 한 순서를 유지 시켜줌.
			
		}
		//포문 종료시 list 에 10개의 Map 객체 추가되어있다!
		System.out.println(list);
		
		
		//향상된 for 문 이용하여 key 가 "id"에 대응되는 value 값 전부 출력하기
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
	}
}
