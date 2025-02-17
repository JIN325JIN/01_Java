package jin;

import java.util.Scanner;

public class TheBlackSkirt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변환할 이진수 입력해주세요. :");
		
		int input = sc.nextInt();
		char output= (char)input;
		
		System.out.println(output);
	
	}

}
