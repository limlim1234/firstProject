package com.yedam.classes;

public class Student {

	 int studentnumber;
	 String name;
	 String major;
//생성자(초기값)	
	public Student(int x) {
		this.studentnumber = x;
		this.name = "";
		this.major = "";
		}
	public Student(int x, String y) {
		this.studentnumber = x;
		this.name = y;
		this.major = "";
		}
	public Student(int x, String y, String z) {
		this.studentnumber = x;
		this.name = y;
		this.major =z;

}
	//메소드(기능, 동작)
	public int getStudentnumber() {
		return studentnumber;
}
	
	  
	 
	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
}
	public String getMajor() {
		return major;
}

}
