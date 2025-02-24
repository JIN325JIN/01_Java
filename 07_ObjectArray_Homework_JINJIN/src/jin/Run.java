package jin;

public class Run {

	public static void main(String[] args) {

		//3개의 생성자를 사용하여 3명의 사원 정보를 배열로 생성한 후 출력 해보고 
		//값이 없는 필드에 각각 값을 입력해 넣어 출력
		//직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고 총 직원 연봉의 평균을 구하여 출력
		
		
		Employee[] emp = new Employee[3];
		
		emp[0]= new Employee();
		emp[1]= new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		emp[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		
		
		for(int i =0;i <emp.length;i++) {
			System.out.print("emp ["+i+"] : "+emp[i].information()+"\n");
		}
		
		System.out.println("==================================================");
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("팀장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
	
		for(int i =0;i <emp.length-1;i++) {
			System.out.print("emp ["+i+"] : "+emp[i].information()+"\n");
		}
		System.out.println("==================================================");
		int sum =0;
		for(int i=0; i<emp.length;i++) {
			int yearsum = (int)(emp[i].getSalary() + ( emp[i].getSalary() * emp[i].getBonusPoint()))*12;
			System.out.printf("%s의 연봉 : %d 원 \n", emp[i].getEmpName(),yearsum);
			sum = sum +yearsum;
		}
		System.out.println("==================================================");
		System.out.printf("직원들의 연봉의 평균 : %d 원 ",sum/emp.length);
	}

}
