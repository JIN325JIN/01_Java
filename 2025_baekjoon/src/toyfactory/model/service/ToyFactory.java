package toyfactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import toyfactory.model.dto.Toy;
//displayToysByAge() 모르겠음
public class ToyFactory {
		private Scanner sc = new Scanner(System.in);//입력받기 위한 스캐너

		private Set<Toy> toySet = new HashSet<Toy>();//장난감을 저장할 토이셋
		
		private Map<Integer, String> materialMap = new HashMap<Integer, String>();//맵(엔트리)를 입력받을 매태리얼 맵
		
		public ToyFactory() { // 기본생성자
			
			materialMap.put(1, "면직물");//기본적으로 저장해놓은 원래 재료
			materialMap.put(2, "플라스틱");
			materialMap.put(3, "유리");
			materialMap.put(4, "고무");

			toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
			toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
			toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
			toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
			toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));
		}

		/**
		 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
		 * 
		 * 가변인자 작성법 : 자료형...변수명 -> 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
		 * 
		 * @return
		 */
		public Set<String> addMaterials(Integer... materials/* List<Integer> materials*/ /*int[] materials*/ ) {
			//가변인자는 래퍼클래스...이다
			Set<String> addedMaterials = new HashSet<String>();//해쉬셋으로 사용할거임

			for (Integer meterialKey : materials) {//숫자로 입력받은 재료 매태리얼키를 반복적으로 포문을 돌면서 검사할건데

			
				String materialValue = materialMap.get(meterialKey);//밸류에 맞는 키를 가져올거다 예를들면 면직물->1
				

				if (materialValue != null) { // 재료 목록에 있을 때
					addedMaterials.add(materialValue);//새로 재료를 추가하겠다.
				}
			}

			return addedMaterials;
		}

		public void displayMenu() {

			int menuNum = 0;

			do {
				System.out.println("\n<< 플레이타임 공장 >>\n");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 프로그램 종료");
				System.out.print("선택 : ");

				try {

					menuNum = sc.nextInt();

					switch (menuNum) {
					case 1: displayAllToys(); break;
					
					case 2: createNewToy(); break;
					
					case 3: deleteToy(); break;
					
					case 4: displayToysByManufactureDate(); break;
					case 5: displayToysByAge(); break;
						
					case 6:
						addMaterial();
						break;
					case 7:
						removeMaterialByName();
						break;
					
					case 0:
						System.out.println("프로그램을 종료합니다");
						break;
					default:
						System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
					}

				} catch (Exception e) {//ioexception 방지
					System.out.println("알맞은 입력을 해라...(경고)..");
					e.printStackTrace();

					sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자 비우기

					menuNum = -1;//경고가 발생하면 마이너스가 될수 없으니까 -1로 반환
				}
			} while (menuNum != 0);
		}
		
		/** 전체 장난감 조회하기
		 * 
		 */
		public void displayAllToys() {
			System.out.println("\n<전체 장난감 목록>");
			
			if(toySet.isEmpty()) {//토이셋의 목록을 확인하는 함수 isempty를 사용해서 토이셋이 비어있는지 아닌지확인
				
				System.out.println("생성된 장난감이 없습니다.");//비어있다면 생성된 장난감이 없다고 반환
				return;
			}
			
			int index = 1;//1번부터 장난감의 목록을 보여주기 위한 인덱스
			for(Toy toy : toySet) {
				System.out.println(index + ". " + toy);//1번 : 어쩌구 저쩌구
				index++;//그리고 인덱스에 ++해서 다음 포문때는 2번 : 어쩌구 저쩌구
			}
		}
		
		/** 새로운 장난감 만들기
		 * 
		 */
		public void createNewToy() throws Exception{
			System.out.println("\n<새로운 장난감 추가>");
			
			System.out.print("장난감 이름 : ");
			String name = sc.next();
			
			for(Toy existingToy : toySet) {//토이 형태의 토이셋의 반복을 돌건데, 
				
				if(existingToy.getName().equals(name)) {//내가 입력한 name과 이미 존재하는 장난감 토이셋의 이름이 같다면
					System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");//이미 같은 이름이 있다고 출력
					return;
				}
			}
			
			System.out.print("사용 가능 연령 : ");
			int age = sc.nextInt();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("색상 : ");
			String color = sc.next();
			
			System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
			String manufactureDate = sc.next();
			
			Set<String> materials = new HashSet<String>(); // 재료 저장할 Set 객체 생성
			
			System.out.println("사용 가능한 재료 목록");
			
			for( Entry<Integer, String> entry  : materialMap.entrySet() ) {//쌍으로 반환하는 엔트리 <숫자,재료>형태인데 얘를 반복하면서
				System.out.println( entry.getKey() + " : " + entry.getValue() );// 1: 면직물 이런형태로 알려주는거임
			}
			
			while(true) {
				System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
				
				try {
					String input = sc.next();
					
					if(input.equals("q")) { // q 입력시 즉시 종료.(밑에 구문 수행할 필요도 읍다
						break;
					}
					
					
					int materialKey = Integer.parseInt(input); // "1" -> 1 
				//위에서 input을 스트링으로 받았으니까 이걸 숫자로 바꿔야해
					
					String material = materialMap.get(materialKey); // "면직물"
					
					
					if(material != null) { 
						
						
						if(materials.contains(material)) {//내가 가지고있는 셋객체에 포함하는 재료를 넣었다면
							System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요");//이미 있는 재료라고 반환
						
						} else { //없는 재료면
							materials.add(material);//내 재료셋에 추가한 후에 
							System.out.println("재료가 추가되었습니다 : " + material);//재료가 추가되었다고하고 + 재료이름 출력
						}
						
					} else { 
						System.out.println("잘못된 번호입니다. 다시 입력해주세요.");//내가 가지고있지않은 재료 리스트 숫자를 입력하면
					}
					
				} catch(NumberFormatException e) {//q가 아닌 다른 입력을 했을시에 나오는 예외 방지
					System.out.println("숫자를 입력하거나 q를 입력하세요.");
				}
			}
			
			Toy newToy = new Toy(name, age, price, color, manufactureDate, materials);// 추가할 재료 저장된 새로운 Set객체 
															
			toySet.add(newToy);//위에 뉴 토이에 입력된 정보로 토이셋에 새로운 토이를 추가한후
			System.out.println("새로운 장난감이 추가되었습니다!");//장난감이 추가되었다고 출력하기
			
		}
		
		
		/** 장난감 삭제하기
		 * 
		 */
		public void deleteToy() throws Exception{
			
			System.out.println("\n<장난감 삭제하기>");
			
			if(toySet.isEmpty()) {//장난감 목록을 먼저 조회한 후에 비어있다면
				System.out.println("생성된 장난감이 없습니다.");//장난감이 없다고 출력
				return;
			}
			System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
			String toyName = sc.next();
			
			boolean flag = false;//플래그를 거짓으로 하나 세워둬서, 포문을 돌면서 내가 입력한 이름과 같은게 있다면 깃발을 트루로 바꿈
			
			for(Toy toy : toySet) {
				
				if(toy.getName().equals(toyName)) {//내 토이셋의 목록을 순차적으로 돌면서 내가 입력한 이름과 같은게 있는지 확인
					toySet.remove(toy);//있다면 토이를 지운다.
					
					flag = true;//그리고 내가 세워둔 깃발을 트루로 바꾸고
					break; //즉시 종료한다. 그렇지않으면 포문이 돌면서 오류가 날걸?
					
				}
			}
			if(flag) {//거짓으로 세워둔 깃발이 참이 되면 지웠다는 뜻이니까 
				System.out.println("장난감이 삭제되었습니다.");//출력
			} else {//그렇지 않으면 해당하는 장난감을 못찾았다고 출력
				System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
			}
		}
		
		
		/** 재료 추가하기
		 * @throws Exception
		 */
		public void addMaterial() throws Exception{
			
			System.out.println("\n<재료 추가>");
			System.out.println("---현재 등록된 재료---");
			
			if(materialMap.isEmpty()) {//내 재료 맵이 비었는지 확인 후 참이면
				System.out.println("등록된 재료가 없습니다.");//등록된 재료가 없다고 출력
				return;
			}
			
			for(Entry<Integer, String> entry : materialMap.entrySet()) { //내 1:면직물 형태로 있는 엔트리 셋을 순회하면서
				System.out.println(entry.getKey() + " : " + entry.getValue());//내 엔트리의 키와 밸류를 출력 1: 면직물 이렇게
			}
			
			System.out.println("-------------------------------------");
			
			System.out.print("재료 고유번호(Key) 입력 : ");//그리고 새로 등록하고 싶다면 고유번호 먼저 입력해서 키에 넣고
			int key = sc.nextInt();
			
			System.out.print("재료명 입력 : ");//밸류에 넣을 재료명 받기
			String material = sc.next();
			
			if(materialMap.containsKey(key)) { // materialMap에 이미 존재하는 Key 인지 확인 
				
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");//contains하고있으니 재료가 등록되어있다고 하기
				System.out.print("덮어쓰시겠습니까? (Y/N) : ");
				String input = sc.next();
				
				if(input.equalsIgnoreCase("Y")) {//입력한값이 y든 Y든 Y로 무시하겠다 
					
					materialMap.put(key, material); // //내 재료맵에 아까 입력한 키,재료명을 추가하겠다.
				} else {
					System.out.println("재료 추가가 취소되었습니다.");
				}
				
			} else {
				materialMap.put(key, material);//이건 겹치는 재료가 없을시에 덮어쓰기 안하는 그냥 새 재료 추가
				System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
			}
		}
		
		/** 재료명으로 재료 삭제하기
		 * @throws Exception
		 */
		public void removeMaterialByName() throws Exception{
			
			System.out.println("\n<재료 삭제>");
			System.out.println("---현재 등록된 재료---");
			
			if(materialMap.isEmpty()) {//내 재료맵이 비었는지 확인후 비어있다면
				System.out.println("등록된 재료가 없습니다.");//재료가 없다고 확인
				return;
			}
			
			for(Entry<Integer, String> entry : materialMap.entrySet()) {//내 재료맵을 순회하면서 엔트리 1:면직물 형태를 
				System.out.println(entry.getKey() + " : " + entry.getValue());//보여준다 (현재 내가 가진 재료 들)
			}
			
			System.out.println("-------------------------------------");
			
			System.out.print("삭제할 재료명 입력 : ");
			String materialName = sc.next();
			
			boolean flag = false;//플래그를 세워서 포문을 돌면서 지우고싶은 재료명과 내가 가진 재료명이 같다면 플래그를 참으로 바꾼다
			
			for(Entry<Integer, String> entry : materialMap.entrySet()) {
				
				if(entry.getValue().equals(materialName)) {//지우고싶은 재료명과 내가 가지고 있는 밸류에있는 재료명이 같다면
					materialMap.remove(entry.getKey());//지운다
					
					System.out.println("재료 '" +  materialName + "' 가 성공적으로 제거되었습니다.");//뭘 지웠는지 출력해주고
					flag = true;//내가 아까 거짓으로 세운 깃발을 참으로 바꿔줌
					break;//그리고 즉시 빠져나간다 반복문을 . 안그러면 또 예외발생할수도
				}
			}
			if(!flag) {//깃발이 참이라면 안에서 깃발이 세워진것이니 재료가 삭제되어 해당이름의 재료가 존재하지 않는다고 출력
				System.out.println("해당 이름의 재료가 존재하지 않습니다.");
			}
		}
		
		/** 제조일순으로 장난감 정렬하기
		 * 
		 */
		public void displayToysByManufactureDate() {
			System.out.println("\n<제조일 순으로 장난감을 정렬>");
			
			if(toySet.isEmpty()) {//내 장난감 목록이 비어있다면
				System.out.println("생성된 장난감이 없습니다.");
				return;
			}
			
			List<Toy> toyList = new ArrayList<Toy>(toySet); //내 토이셋은 중복저장도 안되고, 순서도 없는데 이걸 어레이 리스트에 넣어서
			//순서를 가진 형태로 변환
		
		
			Collections.sort(toyList, new Comparator<Toy>() {//sort를 이용해서 오름차순으로 정렬
				
				@Override
				public int compare(Toy o1, Toy o2) {//오버라이드한 컴페어 메서드인데 
				
					return o1.getManufactureDate().compareTo(o2.getManufactureDate());
				}
			});
			
			int index = 1;//인덱스를 1으로 세우고
			for(Toy toy : toyList) {//토이 <리스트> 포문을 돌면서 1.장난감 인덱스증가, 2 장난감 출력
				System.out.println(index + ". " + toy);
				index++;
			}
		}
		
		
		/** 연령별 사용 가능한 장난감 리스트 조회하기
		 * 
		 */
		public void displayToysByAge() {
			
			System.out.println("\n<연령별로 사용 가능한 장난감>");
			
			Map<Integer , List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();//키랑 밸류를 가지는 맵에 장난감 리스트를 넣어서
			

			for(Toy toy : toySet) {//포문을 돌면서 
				
				int age = toy.getAge(); // 현재 toy 객체가 가진 나이 얻어오기
				
				
				toysByAge.putIfAbsent(age, new ArrayList<Toy>());//토이바이에이지 라는 맵에 나이:
			
				toysByAge.get(age).add(toy);
			
			}
			
			for( Entry<Integer, List<Toy>> entry : toysByAge.entrySet() ) {
				
				int age = entry.getKey(); 
				List<Toy> toyList = entry.getValue();  
				
				System.out.println("[연령 : " + age + "세]");
				
				int index = 1;
				for(Toy toy : toyList) { 
					System.out.println(index + ". " + toy);
					index++;
				}
			}
		}
}
