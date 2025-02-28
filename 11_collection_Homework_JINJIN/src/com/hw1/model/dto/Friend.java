package com.hw1.model.dto;
import java.util.List;

public class Friend {
	
	private String name;
	
	public Friend() {}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pickLeader(List<Friend> friendlist) {
		int random = (int)(Math.random()*friendlist.size());
//		0 <=random < 1
		System.out.println(friendlist.get(random).getName()+"가 떡잎방범대 대장이다.");
	}
	
}
