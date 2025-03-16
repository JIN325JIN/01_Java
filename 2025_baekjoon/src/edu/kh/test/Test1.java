package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<IPInfo> ipInfoList =new ArrayList<>();
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8"));
		ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		
		System.out.println("IP 입력 : ");
		String ip =sc.next();
		
		for(int i =0; i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIP.))//
		}
		
	}

}
