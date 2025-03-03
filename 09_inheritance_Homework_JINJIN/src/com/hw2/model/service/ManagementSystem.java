package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	public abstract void addPerson(Person person);//추상메서드
	public abstract void removePerson(String id);//추상메서드
	public abstract void displayAllPersons();//추상메서드
}
