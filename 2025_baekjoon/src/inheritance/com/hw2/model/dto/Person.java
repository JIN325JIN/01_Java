package inheritance.com.hw2.model.dto;

public abstract class Person {

	protected String id;
	protected String name;
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	/**
	 * person 정보를 문자열로 리턴
	 */
	public abstract String getInfo();
	
	
	
}
