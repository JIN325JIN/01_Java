package chapter12.io.pack2.test;

import java.io.FileOutputStream;

public class Test {

	public void output1() {
		FileOutputStream fos = null;
		
		
		try {
			fos= new FileOutputStream("text");
			
			String str= "안녕하세요!";
			
			for(int i=0; i<str.length();i++) {
				fos.write(str.charAt(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
	
	
}
