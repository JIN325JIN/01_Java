package chapter12.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileService {

	
	/**
	 * file 클래스로 객체 생성, 폴더가 존재하지않으면 폴더생성
	 */
	public void method1() {
		
		//최상위 폴더 : 나는 d드라이브에 생김
		File directory = new File("/io_test/20250305");
	
		//존재하지 않는 폴더를 관리하는 file 객체 생성
		
		if(!directory.exists()) {//존재하지안으면
			//io익셉션 방지
			
			directory.mkdirs();//모든 디렉토리 생성
			
			System.out.println(directory.getName());//가장 하위 폴더 : 20250305
			System.out.println(directory.getPath());// 경로 표시 : \io_test\20250305
		}
	}
	
	/**
	 * file 객체 이용해서 지정된 위치에 파일 생성하기
	 */
	public void method2() {
		
		//문자열에서  역슬래시는 두개 표기해야함
		File file = new File ("\\io_test\\20250305\\파일생성.txt");
		
		if(!file.exists()) {//존재하지 않으면
			//파일생성
			
			try {//파일클래스의 메서드는 대부분 io익셉션 발생시킴
				//-io익셉션은 반드시 예외처리 해야하는 체크드 익셉션임!
				//
				
				
				if(file.createNewFile()) {//파일이 잘 생성되면
					System.out.println(file.getName()+"파일이 생성되었습니다.");
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();//예외정보+예외발생한 위치 추적 메서드
			}

		}
	}
	
	/**
	 * file 클래스 제공 메서드 활용하기
	 */
	public void method3() {
		//file객체 생성
		File directory = new File("\\JAVA_LABS\\01_Java\\12_io");
		//지정된 경로에 있는 모든파일 , 디렉토리를 file[]형태로 얻어오기
		File[] files = directory.listFiles();
		//System.out.println(Arrays.toString(files));
	
	
		//향상된 포문
		for(File f: files) {
			
			//파일명 얻어오기
			String fileName = f.getName();
			
			//마지막으로 수정한 날짜 얻어오기
			long lastModified = f.lastModified();
			System.out.println(lastModified);//1741180071924
			
			//java.text.simpledateformat : 간단히 날짜 형식 지정 객체
			SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd a h:mm");
			
			//string형을 반환하는 simpledatefomat.format.(long) :
			//매개변수 long값을 지정된 패턴 형식으러 변환하여 문자열 형태로 반환
			
			String date = sdf.format(lastModified);
			
			//System.out.println(date);//2025-03-05 오후 10:07
			
			
			//파일유형
			String type = null;
			if(f.isFile()) type = "파일";
			else type = "폴더";
				
			//파일 크기 (byte)
			String size = f.length() + "B";
			
			if(f.isDirectory())size ="";//폴더라면 사이즈를 빈 문자열로 벼경
			//폴더 크기를 구하는 메서드는 따로 존재하지 않응ㅁ
			//구하려면 폴더안의 모든 파일을 순회하여 각 파일 크기를 합산해서 써야함
			
			
			//우리가 폴더에서 보는거와 같은 느낌으로 형식 지정
			String result = String.format("%-20s %-20s %-5s %10s", fileName,date,type,size);
			
			
			System.out.println(result);
			
		}
	}
}
