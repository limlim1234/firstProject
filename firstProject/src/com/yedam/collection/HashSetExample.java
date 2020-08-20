package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("김다희", 20));
		set.add(new Member("김도은",21));
		set.add(new Member("김도은",22));  //인스턴스는 다르니까 저장됨
		
		for(Member mem : set) {                           //출력하기위해서
			System.out.println(mem.getName()+ ", " + mem.getAge());  
		
		}
		

	}

}
