package edu.kh.exception.model.service;




//사용자 정의 예외 클래스
public class UserException extends Exception {

	
	//기본생성자
	public UserException() {}

	
	//매개변수 생성자
	public UserException(String message) {
		super(message);
	}
	
	
	
	
	
	
}
