package inheritance.com.hw2.model.service;

import inheritance.com.hw2.model.dto.Person;

public interface ManagementSystem{

	
	public abstract void addPerson(Person person);
	public abstract void removePerson(Person person);
	public abstract void displayAllPerson();
	
}
