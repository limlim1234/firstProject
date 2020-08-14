package com.yedam.classes;

public class Friend {

	String name;
	int age;
	String num;

	public Friend(String name) {
		this.name = name;
	}

	public Friend(int age) {
		this.age = age;
	}

	public Friend(String name, int age, String num) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}
	

}
