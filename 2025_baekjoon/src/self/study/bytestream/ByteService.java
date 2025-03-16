package self.study.bytestream;

import java.io.FileInputStream;

public class ByteService {

	
	public void fileByteInput(){
		
		
		FileInputStream fis = null;
		
		
		
		//파일 입력용 바이트 기반 스트림 선언
				try {
					
					fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
					//FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해야한다!
					//-> 존재하지 않으면 FileNotFoundException 발생
					
					//방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
					//-> 2 바이트 범주의 글자들은 깨지는 문제 발생함
					
					//byte -> 자바에서 정수형
					//다루기 힘들기 때문에 정수형 기본형인 int 로 변환해서 사용
					
					int value = 0;//읽어온 바이트값을 저장할 변수
					
					StringBuilder sb = new StringBuilder();
					
					while(true) {
						value = fis.read();//1byte씩 끊어서 읽어오는 메서드 
						//단 , 더이상 읽어올 값이 없으면 -1 반환
						
						if(value == -1 ) {
						break;//다읽어왔으면 반복 멈추겠다.
						}
						
						sb.append((char)value);//char로 강제 형변환해서 글자 형태로 sb추가 
					}
					System.out.println(sb.toString());//읽어온 내용 콘솔에 출력
					
					//InputStream은 flush() 없음
					//flush()는 출력스트림에만 관련된 동작
					
				}catch(Exception e) {
					e.printStackTrace();
					
				}finally {
					//사용완료된 스트림 메모리 반환
					try {
						if(fis != null) {
							fis.close();
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
	}
}