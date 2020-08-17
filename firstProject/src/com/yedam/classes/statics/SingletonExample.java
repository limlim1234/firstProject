package com.yedam.classes.statics;

public class SingletonExample {

	public static void main(String[] args) {
		// new Singleton(); //private를 써서 뉴라고 못만듬
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)//주소값을 가지고 비교
		{
			System.out.println("동일한 instance입니다.");
			
		} else {
			System.out.println("다른 instance입니다.");
		}
		Person p1 = new Person(); //패키지위치가 달라서 오류남
		//p1.name = "111";
		p1.setName("1111"); 
	}
	

}
