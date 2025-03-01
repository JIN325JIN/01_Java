package oarr.practice.model.vo;

public class EmployeeRun {

	public static void main(String[] args) {

		//3개의 생성자를 사용하여 3명의 사원 정보를 배열로 생성한 후 출력 해보고 값이 없는
		//필드에 각각 값을 입력해 넣어 출력 직원 각각의 보너스가 적용된 연봉을 계산하여
		//출력하고 총 직원 연봉의 평균을 구하여 출력
		
		//Employee employee = new Employee();
		
		Employee[] emp = new Employee[3];
		
		emp[0]= new Employee();
		System.out.println(emp[0].information());
		emp[1]= new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		System.out.println(emp[1].information());
		emp[2]= new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"0101111222","서울 마곡");
		System.out.println(emp[2].information());
		
		System.out.println("===========================================");
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055556666");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		System.out.println("===========================================");
		
		int sum0 = (int) ((emp[0].getSalary()+(emp[0].getSalary()*emp[0].getBonusPoint()))*12);
		int sum1 = (int) ((emp[1].getSalary()+(emp[1].getSalary()*emp[1].getBonusPoint()))*12);
		int sum2 = (int) ((emp[2].getSalary()+(emp[2].getSalary()*emp[2].getBonusPoint()))*12);
		int sum4 = sum1+sum2+sum0;
		
			System.out.printf("%s의 연봉 : %d\n",emp[0].getEmpName(),sum0);
			System.out.printf("%s의 연봉 : %d\n",emp[1].getEmpName(),sum1);
			System.out.printf("%s의 연봉 : %d\n",emp[2].getEmpName(),sum2);
		
		System.out.println("===========================================");
		System.out.printf("직원들의 연봉의 평균 : %d 원 \n",(int)sum4/emp.length);
	}
}
