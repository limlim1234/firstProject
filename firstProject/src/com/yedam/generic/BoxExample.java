package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String> box = new Box <String>();
		
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person>box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person> box3 =Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
		
		
	}
/*		Box box = new Box();
		String str1 = new String("Hello");
		box.set(str1);
		String result = (String) box.get(); //Object타입은 어떠한 타입도 들어갈수있음 스트링 인트 더블 등등

		Person p1 = new Person();
		box.set(p1);
		Person p2 = (Person) box.get();
		
		result = (String) box.get(); //runtime error
	} */

}
