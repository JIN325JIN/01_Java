package chapter2;

import java.util.Scanner;

public class Main {
	//상근이의 알람시계
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>60) {
			H+=1;
		}else if(H>24) {
			H=0;
		}
		System.out.print(H);
		System.out.print(" ");
		System.out.print(M-45);
	}

}
