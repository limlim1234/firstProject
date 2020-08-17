package com.yedam.classes;

public class Person {
// 필드
//(default) String name;
	String name;
	int age;
	//생성자
	public Person() { // 매개값이 생성자를 기본생성자(default Constructor)
//		name = "anonymous";
//		age = 10;
	}
	public Person(String name) {  //매개값을 갖는 생성자
		this.name = name;
	}
	//메소드
	public String introduce() {
		return "이름은 " + name + " 나이는" + age;
	}
	public String getName() { //getName 필드이름 첫문자대문자 
		return name;
	}

	public void setName(String name, int age) {  
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

