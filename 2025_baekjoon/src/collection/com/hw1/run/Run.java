package collection.com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import collection.com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		List<Friend> friends = new ArrayList<>(); 
		
		friends.add(new Friend ("짱구"));
		friends.add(new Friend ("철수"));
		friends.add(new Friend ("유리"));
		friends.add(new Friend ("훈이"));
		friends.add(new Friend ("맹구"));
		
		int who = (int)(Math.random()*friends.size());
		Friend leader = friends.get(who);
		leader.pickLeader();
	}
}
