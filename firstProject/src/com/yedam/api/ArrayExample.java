package com.yedam.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


import com.yedam.collection.Person;
class User implements Comparator<Person>{ 
	
	String name;
	int grade;
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.name);
		return o.grade - this.grade; //오름차순(음수), 내림차순(양수) 1-2:음수(오름차순), 양수(내림차순)
	}
}
	

public class ArrayExample {

	public static void main(String[] args) {
		int[] scores = { 95, 80, 36, 88 };

		String[] names = { "Hong", "Park", "Choi" };
		System.out.println("--------정렬전------");
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("--------정렬후---------");
		Arrays.sort(names);
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("====================");
		User[] users = {new User("user1", 1), new User("user2",2), new User("user3",3)};
		Arrays.sort(users);
		for ( User s : users) {
			System.out.println(s.name + ", " + s.grade);
		}
		
		
		
		//user3, user2, user1 이런 순으로 나오도록
		// names=> "choi,hong park
	}

}
