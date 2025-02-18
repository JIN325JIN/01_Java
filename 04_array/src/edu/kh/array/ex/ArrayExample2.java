package edu.kh.array.ex;

import java.util.Arrays;

//얕은복사 깊은복사


public class ArrayExample2 {

	public void shallowCopy() {
		//얕은 복사 
		//->주소를 복사하여 서로 다른 참조 변수가
		//하나의 배열(객체)을 참조하는 상태를 만드는 복사방법
		
		int[] arr = {1,2,3,4,5};
		
		//얕은 복사
		int[] copyArr = arr;//주소만 복사
		
		System.out.println("변경 전 ");
		System.out.println("arr주소 " +arr);
		System.out.println("copyArr주소 " +copyArr);
		System.out.println("arr :"+Arrays.toString(arr));
		System.out.println("copyarr :"+Arrays.toString(copyArr));
		
		//얕은 복사한 배열의 값을 변경
		copyArr[2]=999;
		System.out.println("변경 후 ");
		System.out.println("arr :"+Arrays.toString(arr));//원본 배열도 바뀜
		System.out.println("copyarr :"+Arrays.toString(copyArr));
	}
	public void deepCopy() {
		//깊은 복사
		//같은 자료형의 새로운 배열을 만들어서
		//기존 배열의 데이터를 모두 복사하는 방법

		int [] arr = {1,2,3,4,5};//원본 배열
	
		//깊은 복사 1.for문을 이용한 깊은 복사
		int []copyArr1 = new int[arr.length];//원본배열의 길이만큼 복사본의 길이 할당
		//현재 {0,0,0,0,0}인 상황
		
		for(int i=0; i<arr.length;i++) {
			copyArr1[i] = arr[i];
		}
		System.out.println("Arr의 주소값 :"+arr);
		System.out.println("copyArr1의 주소값 :"+copyArr1);
		System.out.println("Arr :"+Arrays.toString(arr));
		System.out.println("copyArr2 :"+Arrays.toString(copyArr1));
		
		
		//깊은복사 2.system.arraycopy(원본배열,원본복사시작인덱스,복사배열명,복사배열삽입시작인덱스,복사의길이)
		int [] copyArr2 = new int[arr.length];//{0,0,0,0,0}
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " +Arrays.toString(copyArr2));
		
		//깊은복사 3.복사할 배열 참조변수 = Arrays.copyof(원본배열,복사할 길이);
		int[]copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3 :" + Arrays.toString(copyArr3));
		//System.out.println("copyArr1의 주소값 :"+copyArr1);
		//System.out.println("copy2의 주소값 :"+copyArr2);
		//System.out.println("copy3의 주소값 :"+copyArr3);
			
		System.out.println("========================");
		//값 변경 후 확인
		copyArr1[4]=0;
		copyArr2[4]=999;
		copyArr3[4]=5000;
		
		//5칸짜리 집이 4채 있는거야
		System.out.println("Arr :"+Arrays.toString(arr));
		System.out.println("copyArr2 :"+Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " +Arrays.toString(copyArr2));
		System.out.println("copyArr3 :" + Arrays.toString(copyArr3));
		
		//집 주소는 안바뀜! 내용물만바뀜
		
		
	}
	public void createLottoNumber() {
		//로또번호생성기
		//배열을 이용한 중복데이터 제거 + 오름 차순 정렬
		//1~45사이에 중복되지 않는 난수 6개 생성
		//생성된 난수가 오름차순으로 정렬 되도록
		//Math.random()*45
		//0.0<x<1.0
		//0x45
		
		//1.정수 6개를 저장할 배열 할당하기
		int[] lotto = new int[6];
		
		//2.생성 된 배열 (로또)를 처음부터 끝까지 순차접근 하는 포문 작성
		for(int i =0; i<lotto.length;i++) {
		//3.1~45사이의 난수를 생성한다.
			int random =(int)(Math.random()*45+1);
			
			//4.생성된 난수를 순서대로 배열 요소에 대입하기
			lotto[i] =random;
			
			//5.중복 검사를 위한 for문 작성
			for(int x =0; x<i;x++) {
				//6.현재 생성된 난수와 같은 수가 배열의 앞쪽요소에 있는지 검사
				if(random ==lotto[x]) {
					i--;
					//i가 1씩 증가할때 마다 난수가 한개씩 생성 됨 
					//->중복 값이 있으면 난수를 새로 하나 더 생성해야함.
					//->i값을 인위적으로 1감소시ㅕ서 난수 발생의 기회를 한번 더 주는것.
					break;
					//앞쪽에서 중복데이터를 발견하면 남은값은 비교할 필요가 없다.
					//효율 향상을 위해 중복검사용 for문을 종료하고자 쓰는 분기문
				}
			}
		}
		//정렬은 되어있지만 중복제거까지는 완성 된 배열
		//7.오름차순 정렬
		//->선택정렬,삽입정렬,버블정렬,퀵정렬
		//->자바가 정렬방법을 미리 만들어서 제공중 
		//Arrays.sort(배열명):배열 내 값들이 오름 차순 정렬됨
		Arrays.sort(lotto);
		
		//결과 출력
		System.out.println("lotto 번호 생성기 :" +Arrays.toString(lotto));		
		
		
	}
	
	
	
}
