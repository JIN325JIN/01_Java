package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		/*
		//불변성 (Immutatble )의 String
		
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1.hashCode());//99162322
		System.out.println(str2.hashCode());//99162322
		//둘이 해쉬 코드가 같다.
		//리터럴 표기법으로 만든 문자는 같은 상수풀의 같은 hello라는 문자열 참조
		str2 = str2+"world";
		System.out.println(str2.hashCode());//-1524582912
		//해쉬코드가다르다 = 주소가 다르다.
		
		
		//가변성 (Mutable) 의 StringBuilder(동기화 X), StirngBuffer(동기화 O)
		StringBuilder sb = new StringBuilder();
			
		System.out.println(sb.hashCode());	//1706377736
		sb.append("hello wolrd!");
		sb.append("12345");
		System.out.println(sb.hashCode());//1706377736
		*/
	
	
		ByteService byteservice = new ByteService();
		//byteservice.fileByteOutput();
		//byteservice.bufferedFileByteOutput();
		//byteservice.fileByteInput();
		//byteservice.fileByteInput2();
		//byteservice.bufferedFileByteInput();
		//byteservice.readProperties();
		byteservice.fileCopy();
	
	}

}
