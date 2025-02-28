package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	/*Set(집합, 주머니) 
	 * - 기본적으로 순서를 유지하지 않음
	 * ( index 없음) ->get() 메서드 존재 하지 않음 -> 구분해서 꺼내기가 어렵다.
	 * 
	 * - 중복 데이터는 저장 되지 X
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet (대표 ): 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동 정렬되는 Set
	 * */
	
	public void method1() {
		
		//HashSet 객체 생성
		Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();//자동정렬 : 가나다순 정렬
		//Set<String> set = new LinkedHashSet<>();//내가 넣은 순서
		
		//1. boolean add(E e): 추가
						//e : element
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		//->HashSet 순서 유지 X 확인
		//->TreeSet 자동 정렬 O 확인
		//->LinkedHashSet 순서 유지 O 확인
		
		//중복 저장 확인 -> 중복저장 X
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
		//배달의 민족 5번 추가했는데 , 중복저장 안되서 1번만 출력
		
		//Null 도 중복 X확인 
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set); //null도 한번만 추가해줌.
		
		//2.int size() : set에 저장된 객체의 수 반환
		System.out.println("set의 size() : " +set.size());//널부터 토스까지 10개
		
		//3.boolean remove(E e) : 
		//전달 받은 매개변수 e를 set에서 제거.
		//제거 성공 true , 없으면 false 반환
		
		System.out.println(set.remove("배달의민족"));//true
		System.out.println(set);//배민 지워진거 확인
		System.out.println(set.remove("유플러스"));//false
		
		//4.boolean contains( E e) : 
		//전달 받은 e 가 Set 에 있으면 true, 없으면 false 
		System.out.println("쿠팡 있는지 검사 :" + set.contains("쿠팡"));
		//포함되어있어서 true 반환
		System.out.println("삼성 있는지 검사 :" + set.contains("삼성"));
		//삼성은 입력한 적이 없어서 false 반환.
		
		//5.void clear () : Set의 저장된 내용을 모두 삭제

		set.clear();//모두 삭제
		System.out.println(set);//텅 빔
		
		//6.boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(set.isEmpty());//다 지워져서 true
		System.out.println(set);//텅 빔
	}
	
	/**
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1.Iterator(반복자)이용
	 * 2.List로 변환 ->인덱스로 접근
	 * 3.향상된 포문을 이용하는 방법
	 */
	public void method2() {
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");

		//1.Iterator(반복자)
		//-컬렉션 객체에 저장된 요소를 하나씩 순차 접근 하는 객체
		
		//Iterator set.iterator() : 
		//- 현재 set을 순차접근 할수 있는 Iterator객체 반환
		
		Iterator<String> it = set.iterator();
		
		//boolean Iterator.hasNext() : 
		//다음 순차 접근할 요소가 있으면 true, 없으면 false 반환.
		
		while (it.hasNext()) {
			//다음 요소가 있으면 반복, 없으면 멈춤
			
			//E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println(temp);
		}
		System.out.println("================================");
		System.out.println("[List로 변환]");
		
		//set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<>(set);//set안에 있는걸 리스트로 복사
		//1. 빈 List를 객체 생성
		//2. add all ()매서드나 생성자를 이용해서 set 안에 있는 요소들을 List에 추가 (복사해서 옮김)
		//3. 변환 완료
		
		//일반 포문
		for ( int i =0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==================================");
	
		System.out.println("[향상된 포문]");
		
		//향상된 포문
		for (String snack : set) {
			System.out.println(snack);
		}
	}
	
	/**
	 * 직접 만든 클래스 (person) 이용해 만든 객체를 set에 저장
	 * (중복 제거 확인)
	 */
	public void method3() {
		
		//****************************************
		//Hash라는 단어가 포함된 컬렉션 이용시 
		//Hashcode(),equals()  오버 라이딩 필수적으로 진행되어야 함!!!
		//******************************************
		Person p1 = new Person("홍길동",25,'남');
		Person p2 = new Person("홍길동",25,'남');
		Person p3 = new Person("홍길동",30,'남');
		Person p4 = new Person("김길순",20,'여');
		
		//set 객체 생성후p1~p4추가
		Set <Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for (Person p : personSet) {
		System.out.println(p);
	}
		//같은 필드 값을 가진 객체는 해시코드 번호가 같다.
		System.out.println("p1 : "+p1.hashCode());
		System.out.println("p2 : "+p2.hashCode());
		System.out.println("p3 : "+p3.hashCode());
		System.out.println("p4 : "+p4.hashCode());
	
		
		//A.equals(B) :A와 B가 가지고 있는 필드값이 전부 같다면 true
		System.out.println(p1.equals(p2));//전부 같은 값을 가지고 있다.
		System.out.println(p1.equals(p3));//나이가 달라서 같은 객체 X (동등 X)
	}

	/**
	 * TreeSet이용한 로또 번호 생성기
	 * -> 기본 오름차순 정렬 
	 * 
	 * TreeSet 안에 저장되는 객체는 Comparable 인터페이스 상속이 필수.
	 * ->Integer 는 comparable 상속 되어 있음. 우리는 그냥 이용만.
	 */
	public void method4() {
		
		//Integer를 저장할 treeset객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();//자동 오름차순
		
		//난수 생성 
		//1. math.random
		//2.random.nextint() : 임의의 정수값을 생성 
		//->random.nextint(10) : 0~9 범위 내 정수 반환 
		
		
		//랜덤 객체 생성
		Random random = new Random();
		
		//lotto에 저장된 값이 6개 미만이면 반복
		//==6개 멈춤
		
		while(lotto.size()<6) {
			//1~45범위 난수 발생
			lotto.add(random.nextInt(45)+1);//랜덤객체 이용해서 1~45사이의 난수를 발생시켜
			//그 난수값 하나를 set에 
		}
		System.out.println(lotto);
		
	}

	/**<h1>로또 번호 생성기</h1>
	 * 금액을 입력 받아 (천원 단위) 
	 * 1000원 당 1회씩 번호를 생성해 List에 저장한 후 
	 * 생성 종료시 한번에 출력
	 * 
	 * <pre>
	 * 금액입력 : 3000
	 * 
	 * 1회 : [ 11,20,34,35,42,43]
	 * 2회 : [1,12,22,33,35,44]
	 * 3회 : [3,6,9,43,44,45]
	 * </pre>
	 * 
	 */
	public void lottoNumberGenerator() {
		Scanner sc = new Scanner (System.in);
		System.out.println("금액 입력 : ");
		int amount = sc.nextInt();
		
		Random random = new Random();
		
		//생성된 로또 번호 묶음 (treeSet)을 저장할 List 객체 생성
		List<Set<Integer>>lottoList = new ArrayList<Set<Integer>>();
		
		//for 문 반복 될때 마다 새로운 TreeSet객체 생성
		for( int i =0; i<amount /1000;i++) {
			
			Set<Integer> lotto = new TreeSet<Integer>();//오름차순
			//Set<Integer> lotto = new TreeSet<Integer>(Comparator.reverseOrder());//내림차순
			
			while(lotto.size()<6) {
				lotto.add(random.nextInt(45)+1);//1~45 사이 난수 발생
			}
			lottoList.add(lotto);//로또 : 셋, 로또리스트 : 리스트
		}
		//출력용 반복문 
		for(int i =0 ; i< lottoList.size();i++) {
			System.out.println(i+1+ "회"+ lottoList.get(i));
		}
		
	}
}
