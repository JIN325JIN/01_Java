package chapter2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		//주사위
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
	
		if(num1==num2&&num2==num3) {
			System.out.println(10000+(num1*1000));
		}
		
		else if(num1==num2||num2==num3||num1==num3) {
			if(num1==num2) {
				System.out.println(1000+num1*100);
			}
			else if(num2==num3) {
				System.out.println(1000+num3*100);
			}
			else if (num1==num3) {
				System.out.println(1000+num3*100);
			}
		}
		else {
			if(num1>num2&&num1>num3)
				System.out.println(num1*100);
				else if(num2>num1 && num2>num3) {
					System.out.println(num2*100);
				}else if(num3>num1 && num3>num2) {
					System.out.println(num3*100);
				}
		}
	
	}
}
