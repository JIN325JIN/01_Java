package chapter1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		System.out.println((num2%100%10)*num1);//1의자리
		//385를 100으로 나눈 나머지 : 85 얘를 또 10으로 나눈 나머지
		
		System.out.println(((num2/10)%10)*num1);//10의자리
		//385를 10으로 나누면 38인데 얘를 또 10으로 나눈 나머지
		
		System.out.println((num2/100)*num1);//100의자리
		//100의 자리는 100으로 나눔
		
		System.out.println(num1*num2);//위의 세개를 더해도 되고, 이대로 출력해도 됨
		
	}
	
	
}
