package com.yedam.classes;

public class Friend {
//필드
	private String name;
	private int age;
	private String phone;
// 클래스명 직접 올수있음 ;

//생성자 오버로딩

	public Friend() {

	}

	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
		this.phone = "";
	}

	public Friend(String name, int age, String pnum) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

//메서드
	

	@Override
	public String toString() {
		return "친구 이름: " + this.getName() + ", 연락처: " + this.getPhone();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String Phone) {
		this.phone = Phone;
	}

}
