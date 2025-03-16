package chapter12.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ByteService {
//속도는 보조스트림 사용해야 훨빠름
//보조스트림 (bos)은 flush해주어야함
//input stream은 flush필요없음
//fos는 flush해도되고, 안해도도고
//노래가사 데려올때 1번째 사안은 1바이트씩 끊어서 데려오기때문에 한글과같은 2바이트범주는 깨져서 읽힘
//그래서 배열에 담아서 데려와야함
	//try catch 문 안에서 FileInputStream fis = null; 같은걸 선언할 경우에는
	//유효범위가 try-catch문 안으로 한정되고, 바깥에서fis사용불가하며, close도 사용할수 없다.
	//보조스트림 close시 . f도 클로즈됨
	//ex ) bos클로즈하면 fos도 
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력 + 데이터 출력
	 */
	public void fileByteOutput() {
		
		//fileoutput stream outputstream상속받은 자식클래스 
		FileOutputStream fos = null;
		
		
		//파일낫 파운드 익셉션이 나올수도있음 : 경로를 못찾았을때 발생우려 : 경로가 있어야해
		try {
			
			//new fileoutputstream ("경로") :
			//->경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			//->출력 스트림에 연결된 파일이 존재하지 않으면 자동생성
			//단 폴더는 생성되지 않음
			//기본 파일이 존재하면 내용을 덮어쓰기함 
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
			
			
			//String의 불변성 문제를 해결한 객체 String Builder 비동기
			StringBuilder sb = new StringBuilder();
			
			sb.append("hello world!!!\n");
			sb.append("234567890\n");
			sb.append("가나다라마바사 \n");
			sb.append("와 자바 너무 재밌다 \n");
			sb.append("선생님 저 공부정말 열심히 할게용 \n");
			sb.append("진짜로 정말로 화이팅!!! \n");
			
			//출력방법 : 1글자씩(2바이트) 파일로 출력하기
			
			//StringBuilder -> String  변환 ->charAt() -> char로 변환
			String content = sb.toString();
			
			/*
			for(int i=0;i < content.length();i++) {
				char ch = content.charAt(i);
				try {
					fos.write(ch);
				} catch (IOException e) {
					e.printStackTrace();
				}//1바이트 출력 스트림이 연결된 파일에 ch쓰기
				
			}
			*/
			//-> 2바이트 범주의 문자 (영어, 숫자, 기본 특수문자 제외)
			//바이트 기반 스트림  통과시 데이터 손실 발생해서 글자가 깨지는 문제가 발생
			
			
			//출력방법 2: String을 바이트 배열로 변환후 출력
			
			//수행시간 확인
			//\write수행되는 시간 측정
			//system.nanotime():1970.01.01. 오전 09:00부터 
			//현재시간까지의 차리를 ns 로 반환
			
			
			try {
				
				fos.write(content.getBytes());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			//=> 영어 특수문자 한글 잘 출력됨!!
			// 문자열을 바이트 배열에 넣고 바이트 배열은 1바이트가 들어간 묶음이니까
			// 1바이트 통로에도 잘 흘러들어가는것임
			
			
			
			//fos.flush();//스트림 안에 남아있는 모든 데이터를 모두 밀어냄
			//파일 아웃풋 스트림에서는 선택사항 , 클로즈하면 플러쉬가 자동으로 됨
			//보조스트림 사용할땐 플러쉬 필수다!!!
			
			System.out.println("출력완료!");
			
			
		} catch (/*IOException e */FileNotFoundException e) {
			e.printStackTrace();
		}finally { //try 에서 예외가 발생 했던 안했던 무조건 실행해야함
			
			//사용완료한 스트림제거 (닫기, 메모리 반환)-> 메모리 누수 방지 위해서
			//스트림 열려잇으면 : 메모리가 줄줄샘
			
			try {
				
				
				if(fos!= null) fos.close();//NullPointerException방지 : 
				//fos가 널이라면 닫는다. 그렇지 않으면 널포인트익셉션 
				//close메서드도 ioexception발생시키기 때문에 try catch로 예외처리 필수
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	/**
	 * 버퍼를 이용한 파일 출력
	 * + buffered output stream 보조스트림 이용
	 */
	public void bufferedFileByteOutput() {
		
		FileOutputStream fos = null;//기반 스트림 참조변수 선언
		BufferedOutputStream bos = null;//보조 스트림 참조변수 선언
		
		try {
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
		
		
			//기반 스트림 fos를 이용해서 보조스트림 bos 생성
					bos = new BufferedOutputStream(fos);
		
					StringBuilder sb = new StringBuilder();
					
					sb.append("hello world!!!\n");
					sb.append("234567890\n");
					sb.append("가나다라마바사 \n");
					sb.append("와 자바 너무 재밌다 \n");
					sb.append("선생님 저 공부정말 열심히 할게용 \n");
					sb.append("진짜로 정말로 화이팅!!! \n");
					
					
					String content = sb.toString();//스트링빌더를 스트링으로 타입변환
					
					bos.write(content.getBytes());//버퍼에 저장할뿐, 파일에 즉시저장하는게 아님.
					
					
					//System.out.println("출력완료!");//버퍼에 모아만 놓고 출력은 x 
					bos.flush();//스트림안에 남아있는 모든 데이터 밀어냄!!
					//bufferedoutputstream 사용시 flush필수!
					
					System.out.println("출력완료!");//진짜 출력					
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) bos.close();//ioexception
				//보조스트림 close시 , 생성에 사용된 fos도 같이 close됨.
			}catch(Exception e) {//ioexception이지만 최상위인 exception 이라고 적어도됨
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 노래가사 읽어오기 : 근데 한글깨짐
	 */
	public void fileByteInput() {
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		
		try {
			
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//파일 인풋 스트림 이용시 해당경로에 반드시 실제파일이 존재해야함
			//그렇지 않으면 파일 낫 파운드 익셉션 발생
			
			
			//방법 1 . 파일 내부 내용을 1바이트씩 끊어서 가져오기
			//2바이트 범주의 글자들은 깨지는 문제 발생함
			//바이트 -> 자바에서 정수형 
			//다루기 힘들기 때문에 정수형 기본형인 int로 변환 사용
			// 1바이트씩 끊어서 강제적으로 해서 한글이 깨지는 문제가 있음
			int value =0; //읽어올 바이트 값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				value = fis.read();//1바이트씩 끊어서 읽어오기
				
				//단, 더이상 읽어올 값이 없으면 -1 반환
				if(value==-1) {
					break;//다 읽어왔으면 반복 멈춤
				}
				sb.append((char)value);//char로 강제 형변환 후 sb에 추가
				
				
			}
			System.out.println(sb.toString());//읽어온 내용 콘솔에 출력
			
			
			//인풋 스트림은 flush없음
			//flush는 출력스트림에만 관련됨
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//사용완료된 메모리 반환
			try {
				if(fis!=null) fis.close();
				
			} catch (Exception e) {
		}
	}
		
	
		
	}

	/**
	 * 노래가사 배열로 읽어오기 
	 */
	public void fileByteInput2() {
		//파일 입력용 바이트 기반 스트림 선언
				FileInputStream fis = null;
				
				
				try {
					
					fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
					
					
					//방법 2 번째 : 파일에 저장된 모든 byte값을 다 읽어와
					//byte[]배열 형태로 반환 받기 
					
					//안 : 바이트단위 로 쪼개면 ㅇ,ㅏ,ㄴ 쪼개서 데려옴
					//ㅇ->20, ㅏ->97,ㄴ->34라고 가정하면 배열로 하면 [20,97,34]니까
					//배열에 나열해서 쪼개지지않고 하나의 글자가 완성된 상태로 들어오니까  
					//숫자를 배열에 넣어서 가져와야함.
					
					//=> byte[]을 이용해서 string 객체 생성
						byte [] bytes = fis.readAllBytes();
						
						String content = new String (bytes);
						
						System.out.println(content);
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					//사용완료된 메모리 반환
					try {
						if(fis!=null) fis.close();
						
					} catch (Exception e) {
					}
				}

	}

	
	/**
	 *  보조스트림 이용한 성능 향상 
	 *  -> 읽어오는 파일의 크기가 작으면 보조스트림의 성능 이점이 크게 눈에 띄지않음
	 */
	public void bufferedFileByteInput() {
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		//파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			//기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			//보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			
			byte [] bytes = bis.readAllBytes();
			
			String content = new String (bytes);
			
			
			System.out.println(content);
			
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis!= null) bis.close(); //보조스트림 bis닫으면 기반스트림 fis도 닫힘
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 외부에 있는 config.properties 파일 을 입출력 하기 
	 * -> map 계열인 properties 라는 클래스 사용하기 
	 */
	public void readProperties() {
		//properties 클래스는 hashtable 의 하위클래스로 맵 계열 클래스중 하나
		//키와 밸류 모두 스트링 타입으로 이루어짐.
		
		//읽어오기 (input stream) : 읽어오려면 먼저 메모장으로 파일 만들어야함
		//안그럼 filenotfound로 익셉션 발생함 
		
		//그래서 config.properties파일 만듦
		//내부에 id-admin, pw-1234, language-ko 값 넣음
		
		
		//properties 객체 생성
		Properties properties = new Properties();
		
		//바이트 기반 파일 입력 스트림 참조변수 선언
		FileInputStream fis = null;
		
		//바이트 기반 파일 출력 스트림 참조 변수 선언
		FileOutputStream fos = null;
		
		
		
		
		
		
		
		try {
			
			
			//읽어오려면 객체 생성하면서 경로 넣기 
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			properties.load(fis); //파일 로드 
			//안에있는 데이터를 읽어들인후 프로퍼티 라는 객체에 저장함
			
			
			
			//Properties.getProperty(key) :key에 대응되는 value반환
			System.out.println("username: "+ properties.getProperty("username"));//admin
			System.out.println("password: "+ properties.getProperty("password"));//1234
			System.out.println("language: "+ properties.getProperty("language"));//ko반환
			System.out.println("아무것도 안넣기: "+ properties.getProperty(""));//없는키 넣으면 null반환
			
			//지금까지는 읽기 였음
			
			
			
			//쓰기 하려면 바이트 기반 출력 스트림 참조 변수 선언 해야하는데
			// 트라이문안에서 하면 안되니까 나가서 선언하기
			//바이트 기반 파일 출력 스트림 참조 변수 선언
			//FileOutputStream fos = null;//바깥에서 선언완료
			
			
			fos = new FileOutputStream ("/io_test/20250305/config.properties");
			properties.setProperty("theme", "dark");//새로운 속성 : 설정 추가
			// theme = dark 키밸류 추가 
			
			properties.store(fos, "update");//(아웃풋 스트림 , "코멘트")
			
			
			
			//메모장 파일 열어보면 : 주석 #update 달려있고, 테마도 잘 추가됨!!
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
		
		//
		
		
		
	}
	
}
