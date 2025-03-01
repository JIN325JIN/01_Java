package inheritance.com.hw2.model.dto;

public abstract class Employee extends Person{

	private String positon;

	public Employee(String id, String name, String positon) {
		super(id, name);
		this.positon = positon;
	}
	
	@Override
	public String getInfo() {
		return null;
	}
	
	
}
