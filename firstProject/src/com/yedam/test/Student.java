package com.yedam.test;

public class Student  {
	
	private String Name;
	private int Age;
	private int Grade;
	

	public Student(String name, int age, int grade) {
		super();
		this.Name = name;
		this.Age = age;
		this.Grade = grade;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}
	
	public int getGrade() {
		return Grade;
	}
	
	public void setGrade(int grade) {
		this.Grade = grade;
	}

	@Override
	public String toString() {
		return ("이름: " + Name + " "+"나이: " + Age + " " + "성적: " + Grade);
	}
	
	
	

}