package toyfactory.model.dto;

import java.util.Objects;
import java.util.Set;
// getMaterialsAsString() 모르겠음
public class Toy {
	
		//장난감의 속성 
		private String name; //장난감 이름
		private int age;//장난감 사용 연령
		private int price; //장난감 가격
		private String color; //장난감 색상
		private String manufactureDate; //장난감 제조년월일
		private Set<String> materials; //장난감 사용재료
		
		// 메서드
		public Toy() {}//기본생성자
		
		//매개변수 생성자
		public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
			super();
			this.name = name;
			this.age = age;
			this.price = price;
			this.color = color;
			this.manufactureDate = manufactureDate;
			this.materials = materials;
		}

		/** 아래 toString() 에서 재료명 표기 시 사용함
		 * materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
		 * @return
		 */
		public String getMaterialsAsString() {
			StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
			
			if(materials.size() == 0) {//사용재료를 받는 set의 사이즈가 없다면 없음 반환.
				return "없음";
			}
			for(String material : materials) {//스트링 형태의 사용재료 material을 돌면서 
				sb.append(material).append(", "); //sb 에 재료 추가.
			}
			sb.setLength(sb.length() - 2);//sb의 마지막에 있는 ,제거 
			
			return sb.toString();//sb 출력
		}

		//장난감 목록으로 조회하기 위한 투스트링 오버라이딩
		@Override
		public String toString() {
			return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d "
					+ "/ 제조년월일 : %s / 재료 : %s", 
					name, price, color, age, manufactureDate, getMaterialsAsString());
		}
		//게터와 세터
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(String manufactureDate) {
			this.manufactureDate = manufactureDate;
		}

		public Set<String> getMaterials() {
			return materials;
		}

		public void setMaterials(Set<String> materials) {
			this.materials = materials;
		}
		
		//compare하기위한 해쉬코드와 이퀄스
		@Override
		public int hashCode() {
			return Objects.hash(age, color, manufactureDate, materials, name, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Toy other = (Toy) obj;
			return age == other.age && Objects.equals(color, other.color)
					&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
					&& Objects.equals(name, other.name) && price == other.price;
		}
}
