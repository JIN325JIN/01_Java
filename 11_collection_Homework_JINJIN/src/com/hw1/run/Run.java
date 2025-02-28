package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		List<Friend> friendList = new ArrayList<>();
		
		friendList.add(new Friend ("짱구"));	//0
		friendList.add(new Friend ("철수"));	//1
		friendList.add(new Friend ("유리"));	//2
		friendList.add(new Friend ("훈이"));	//3
		friendList.add(new Friend ("맹구"));	//4
		
		
		new Friend().pickLeader(friendList);
		
	}

}
