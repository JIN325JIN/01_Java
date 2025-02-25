package baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println((num2%100%10)*num1);
		System.out.println(((num2/10)%10)*num1);
		System.out.println((num2/100)*num1);
		System.out.println(num1*num2);
		
	}
}
