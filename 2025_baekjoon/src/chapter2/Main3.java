package chapter2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main3 {
//오리훈제 오븐 만들기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		int input = sc.nextInt();

		int a = input / 60;// 시간
		int b = input % 60;// 분

		/*
		 * if(input>60) { System.out.printf("%d %d",hour+a,min+b); } else {
		 * if(min+input>60) { System.out.printf("%d %d",hour+a+1,min+b-60); } else {
		 * System.out.printf("%d %d",hour,min+input); } }
		 */

		if (input > 60) {
			System.out.printf("%d %d", hour + a, min + b);
		} else {

			if (min + input > 60) {
				System.out.printf("%d %d", hour + a + 2, min + b - 120);
			} else if (min + input < 60) {
				System.out.printf("%d %d", hour + 1, min + b - 60);
			}
		}

	}

}
