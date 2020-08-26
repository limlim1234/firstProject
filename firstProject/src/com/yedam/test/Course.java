package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Course {
	public void getBoardList() {
		List<Board> list = new ArrayList();
		list.add(new Board("자바과정", 5));
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 10, 90));
		list.add(new Student("김유신", 20, 80));
		list.add(new Student("신용권", 15, 85));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String str : list) {
			System.out.println(str);    
		}
	}

}