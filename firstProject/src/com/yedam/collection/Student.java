package com.yedam.collection;

public class Student implements Comparable<Student> {
	private String name;
	private int math;
	private int eng;
	public Student(String name, int math, int eng) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public int compareTo(Student o) {
	
		if((this.math + this.eng) < (o.math + o.eng))
		return -1; 
			
		else
			return 1 ;
		
//		return this.math - o.math ; //수학점수만 기준이지만 영어수학기준으로 하려면 매스뒤에 영어 점수 더하고 괄호하고 빼기
	}
	
	

}
