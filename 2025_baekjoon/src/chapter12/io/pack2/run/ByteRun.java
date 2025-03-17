package chapter12.io.pack2.run;

import chapter12.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		
		/*
		//불변성 string 
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str2= str2 +"wolrd";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());//주소가 다름

		
		//가변성 string builder
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());//1804094807
		
		sb.append("hellowolrd");
		sb.append("12345");
		
		System.out.println(sb.hashCode());//1804094807
		
		//새로운 공간에 할당하는게 아닌, 같은공간이 바뀐거라 가변성임
		*/
		
		
		 ByteService bs =new ByteService();
		 
		// bs.fileByteOutput();
		// bs.bufferedFileByteOutput();
		// bs.fileByteInput();//노래가사 깨져서 읽혀
		// bs.fileByteInput2();//노래가사 안깨져서 읽힘
		 //bs.bufferedFileByteInput();//보조스트림으로 노래가사 읽어옹기
		 bs.readProperties();//admin, password, ko, theme black
	}

}
