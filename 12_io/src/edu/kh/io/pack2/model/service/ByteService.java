package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {

	/* 
	 * 스트림 (Stream) : 데이터가 이동하는 통로
	 * 					 기본적으로 한 뱡향으로 흐름
	 * 
	 * Byte 기반 스트림 
	 * -1byte 단위로 데이터를 입/출력하는 스트림
	 * -최상위 클래스 : InputStream, OutputStream
	 * -문자열, 이미지, 영상, 오디오, pdf ...etc 
	 * -모든것을 입/출력 할수 있음
	 * (단, 통로가 1바이트로 좁다보니, 속도가 좀 느림,char 형 문자 같은 경우 깨질 우려가 있음)
	 * 
	 * */
	
	//IO 관련된 코드는 IOException이 발생될 가능성이 높다!
	//-> IO관련 코드는 거의 모든 메서드가 throws IOException
	//-> IOException 예외 처리 구문을 작성하는 것이 필수!!
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력하기
	 * + 데이터 출력 
	 */
	public void fileByteOutput() {
		
		//FileOutputStream 참조 변수 선언 (OutputStream을 상속받은 자식 클래스)
		FileOutputStream fos = null;
		
		try {
			
			//new FileOutputStream ("경로");
			//->경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			//-> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			//단, 폴더는 생성되지 않음 
			//-> 기본 파일이 존재하면 내용을 덮어쓰기 함
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");//파일 낫파운드 익셉션
			//아웃풋 스트림을 만들어서 20250305/바이트기반_테스트랑 연결해놓기 
			
			//String 의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello Wolrd!!\n");
			sb.append("1234567890\n");
			sb.append("!@#$%^&*()_+?/\n");
			sb.append("가나다라마바사아\n");
			sb.append("와 자바 너무 재밌다 \n");
			sb.append("선생님 저 공부 정말로 열심히 할게요\n");
			sb.append("진짜로 !! 정말로!! 화이팅!! \n");
			
			//출력방법 1 : 한글자(2byte)씩 파일로 출력하기
			
			//StringBuilder->String 변환 -> charAt -> char로 변환
			
			
			String content  = sb.toString();
			
			/*
			for(int i = 0; i< content.length();i++) {
				char ch = content.charAt(i);
				fos.write(ch);//1Byte 출력 스트림이 연결된 파일에 ch 쓰기
			}
			
			*/
			//=>2바이트 범주의 문자 (영어, 숫자, 기본 특수문자 제외)는 바이트 기반 스트림 통과 시
			//데이터 손실이 발생해서 글자가 깨지는 문제가 발생.
			
			
			//출력방법 2 : String 을 byte[]로 변환후 출력
			
			
			//****수행시간 확인******
			//write() 수행되는 시간 측정
			//System.nanoTime() : 1970.01.01 오전 9:00 :00부터
			//현재 시간 까지의 차이를 ns(nano second)로 반환
			//1ms (밀리 )    == 1/1000s
			//us (마이크로)  == 1/1000ms
			//1ns(나노)      == 1/1000us
			
			//이전
			long startTime = System.nanoTime();
			fos.write(content.getBytes());//byte[]로 만들어 반환
			//이후			
			long endTime = System.nanoTime();
			
			//이후-이전 : 수행시간 
			System.out.println("수행시간 : " +(endTime - startTime)+ "ns");
			//나는 한 6~7만 정도
			
			
			fos.flush();//스트림 안에 남아있는 모든 데이터를 모두 밀어냄 : 
			//FileOutputStream에서는 flush() 선택 사항.
			//보조스트림 쓰는경우 flush 필수사항
			
			System.out.println("출력완료");
			
		}catch(IOException e) {//자식관계라서 IOE
			
			e.printStackTrace();
			
		}finally {//try 예외가 발생 여부에 상관 없이 반드시 수행
			
			//사용완료한 stream을 제거 (닫기,메모리 반환) 하는 코드 작성
			//-> 메모리 누수 방지!
			
			try {
				//스트림이 정상 생성된 경우 스트림을 닫는다.
				//NullPointerException 방지
				//close()메서드도 IOException을 발생시키기 때문에
				//try - catch 이용하여 예외 처리 필수!
				
				if(fos != null) {//null 아닌데 닫으면 NullPointerException 발생
					
					fos.close();//close()안에 flush포함이라서 자동으로 
					}
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
	
	/**
	 * 버퍼를 이용한 파일 출력 
	 *  + bufferedOutputStream :보조스트림 이용
	 */
	public void bufferedFileByteOutput() {
		/*
		 * 버퍼(buffer)란? 
		 * - 데이터를 모아두는 공간, 마치 바구니 같은 메모리 공간
		 * -        BufferedOutputStream //BufferedInputStream
		 * 출력용 보조스트림(바이트기반) / 입력용 보조스트림(바이트기반)
		 * 
		 * - FileOutputStream은 1바이트씩 데이터를 입출력
		 * -> 통로가 좁아서 데이터 입출력시 속도가 느림.
		 * 
		 * ->보조 스트림 이용시 버퍼에 입출력할 내용을 모아서 한번에 입출력!
		 * (내부 버퍼에 데이터를 모아뒀다가, 일정 크기가 되면 한번에 출력)
		 * -> 기반 스트림(성능 좀 안좋음)을 이용하는 횟수가 적어짐
		 * 
		 * => 성능 , 시간 효율이 상승
		 * 
		 * 
		 * */
		FileOutputStream fos = null;//기반 스트림 참조변수 선언
		BufferedOutputStream bos = null;//보조 스트림 참조변수 선언
		
		try {
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_buffered.txt");
			
			//기반 스트림 fos를 이용해 보조스트림 bos 를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello Wolrd!!\n");
			sb.append("1234567890\n");
			sb.append("!@#$%^&*()_+?/\n");
			sb.append("가나다라마바사아\n");
			sb.append("와 자바 너무 재밌다 \n");
			sb.append("선생님 저 공부 정말로 열심히 할게요\n");
			sb.append("진짜로 !! 정말로!! 화이팅!! \n");
			
			String content = sb.toString();
			
			
			//이전
			long startTime = System.nanoTime();
			bos.write(content.getBytes());//버퍼에 저장 :파일 즉시 기록이아닌, 버퍼에 모아만 두는 
			
			
			//이후			
			long endTime = System.nanoTime();
			
			//이후-이전 : 수행시간 
			System.out.println("수행시간 : " +(endTime - startTime)+ "ns");
			
			//나는 한 3~4만 정도 (수행시간이 두배정도 차이남)
			
			bos.flush();//stream 안에 남아있는 모든 데이터를 밀어냄!
			//버퍼 내용을 강제로 파일에 기록
			//bufferedOutputStream 사용시 flush() 필수!!
			
			System.out.println("출력완료!!!!");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {
			try {
				if(bos!=null) {
					bos.close();//보조스트림인 bos close
					//보조 스트림 close시 보조스트림생성에 사용된 기반 스트림 (fos)도 같이 close
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 바이트 기반 파일 입력
	 */
	public void fileByteInput() {
		
		
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

	/**
	 * 바이트 기반 파일 입력 2
	 */
	public void fileByteInput2() {
		
		FileInputStream fis = null;
		
		//파일 입력용 바이트 기반 스트림 선언
		try {
			
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			// 방법 2. 파일에 저장된 모든 byte 값을 다 읽어와 
			//byte [] 형태로 반환 받기 
			//-> byte[] 배열을 이용해서 String 객체 생성
			
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			//사용완료된 스트림 메모리 반환
			
			try {
				if(fis != null) fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어 올때 사용
	 * -> 읽어오는 파일의 크기가 작으면 보조스트림의 성능 이점이 크게 눈에 띄지는 않음.
	 * 
	 */
	public void bufferedFileByteInput() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		//파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			//기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			//보조스트림 생성
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
		}catch(Exception e) {
			
		}finally {
			try {
				//보조 스트림 bis 만 close 해도 기반 스트림 fis도 같이 close됨.
				if(bis!=null) bis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 외부에 있는 config.properties (설정.프로퍼티즈) 파일 입출력하기
	 * -> Map 계열인 Properties 클래스 사용하기
	 */
	public void readProperties() {
		//Properties 클래스는 HashTable의 하위클래스로 Map 계열 클래스 중 하나.
		//Key, Value 모두 String 타입으로 이루어짐.

		//Properties 객체 생성
		Properties properties = new Properties();
		
		//바이트 기반 파일 입력 스트림 참조변수 선언
		FileInputStream fis = null;
		
		//바이트 기반 파일 출력 스트림 참조변수 선언
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			//읽기
			properties.load(fis);//파일 로드 
			
			//Properties.getProperty(key) : key에 대응되는 value 반환
			
			System.out.println("username :"+ properties.getProperty("username"));
			System.out.println("password :"+ properties.getProperty("password"));
			System.out.println("language :"+ properties.getProperty("language"));
			System.out.println("없는 Key :"+ properties.getProperty("없는 Key"));//null 반환
			
			
			//쓰기
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			
			properties.setProperty("theme", "dark");//새로운 속성 설정을 추가 
			//theme = dark;
			
			properties.store(fos, "Update");//(누구를 통해서 전달할건지,"코멘트" 순서)
			//properties.store(fos, "윤진");덮어씌워지나?
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 파일복사
	 * 
	 * 파일경로를 입력받아
	 * 지정된 파일과 같은 경로에 복사된 파일 출력하기
	 * 
	 * [실행화면] 
	 * 파일경로입력 : /io_test/20250305/노래가사.txt
	 * 복사완료 : /io_test/20250305/노래가사_copy.txt
	 * 
	 * 1.입력된 경로에 파일이 있는지 검사
	 * 2.있으면 파일 내용을 모두 읽어오기 (FileInputStream필요+BufferedStream)
	 * 3. 읽어온 내용을 같은 경로 위치에 "파일명_copy.확장자 "이름으로 출력
	 *  : FileOutputStream + BufferedOutputStream
	 *  
	 *  + Scanner 대신 BufferedReader(문자열 입력용 스트림) 이용
	 * -> BufferedReader 는 보조스트림이므로 단독 사용 불가능!
	 * -> BufferedReader 생성시 기반스트림인 InputStreamReader(근데 얘가 기반처럼 쓰임) ->InputStream(기반스트림)
	 * 
	 */
	public void fileCopy() {
		BufferedReader br = null;//문자열 입력용 스트림
		
		FileInputStream fis = null;       //파일 입력 기반 스트림
		BufferedInputStream bis = null;  //파일 입력 보조 스트림 
		
		FileOutputStream fos = null;     // 파일 출력 기반 스트림
		BufferedOutputStream bos =null;//파일 출력 보조 스트림
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//경로 입력받기
			System.out.println("파일 경로 입력 :");
			String target =br.readLine();//입력된 한줄 읽어오기
			
			//해당 경로에 파일이 존재하는지 확인
			File file = new File (target);
			
			if(!file.exists()) {//해당 경로에 파일이 존재하지 않으면
				//프린트 구문 출력
				System.out.println("[해당경로에 파일이 존재하지 않습니다]");
				return ;
			}
			//해당 경로에 파일이 존재하면 
			//target이 가르키는 파일이 입력받을수 있도록 입력용 스트림을 생성할것.
			
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);//통로 열기 마침
			
			//입력용 스트림을 이용해서 target 파일의 내용을 입력받기 (읽어오기)
			byte[] bytes = bis.readAllBytes();
			
			//========================================================================
			//여기서부터는 출력
			//출력할 파일의 경로 + _copy 가 붙은 파일 이름
			//target : /io_test/20250305/노래가사.txt
			//copy : /io_test/20250305/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();//아무것도 참조하지 않은상태
			sb.append(target);//현재 sb에는 문자열로 : "/io_test/20250305/노래가사.txt"
			//근데 우리는 확장자 나오기 이전에 _copy붙여줘야함.
			
			//int String.lastIndexOf("문자열")
			//- 주어진 문자열이 마지막으로 등장하는 인덱스를 찾아 int 값으로 index 반환.
			//찾지 못하면 -1반환
			
			int insertPoint = target.lastIndexOf(".");//가장마지막으로 등장하는 .을 찾아라.
			//System.out.print(insertPoint);//22 번 인덱스에 해당한다고 출력됨.
			
			sb.insert(insertPoint, "_copy");
			
			String copy = sb.toString();//복사할 파일의 경로를 String 반환
			//io_test/20250305/노래가사_copy.txt
			
			//출력용 스트림 생성
			fos = new FileOutputStream(copy);//io_test/20250305/노래가사_copy.txt 라는 뜻
			bos = new BufferedOutputStream(fos);
			
			//원본에서 읽어온 내용 bytes를 bos를 이용해서 쓰기 (출력)
			bos.write(bytes);
			bos.flush();//스트림에 남아있는 데이터 모두 밀어내기.
			System.out.println("복사 완료 : "+copy);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//사용한 스트림 메모리 모두 반환하기 
				if(br != null) br.close();
				if(bis!=null) bis.close();//기반인 fis도 같이 닫힘
				if(bos!=null)bos.close();//기반인 fos도 같이 닫힘
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
