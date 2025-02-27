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
		
		if(min+input>60) {
			hour = hour +1;
			min = min-60;
			if(min>=60) {
				hour=hour+1;
				min = min-60;
				System.out.printf("%d %d" , hour, min+input);		 
						
			}else {
				System.out.printf("%d %d",hour,input+min);
			}
		}
		if(min>=60) {
			hour=hour+1;
			min =min-60;
			System.out.printf("%d %d",hour,input+min);
			
		}else if(hour>23) {
			hour = hour-24;
			System.out.printf("%d %d",hour,input+min);
			
		}
		
		else if ( min>=0&&min<=59&&hour>0&&hour<24) {
			System.out.printf("%d %d",hour ,min+input);
		}
		
	}

}
