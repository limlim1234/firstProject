package com.yedam.classes;

public class Student {
// 필드
	private int studNo;
	 private String studName;
	 private String major;
//생성자(초기값)	
	 public Student() {
		 
	 }
	 public Student(int studNo) {
		this.studNo = studNo; 
		
		}
	public Student(int x, String y) {
		this.studNo = x;
		this.studName = y;
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
