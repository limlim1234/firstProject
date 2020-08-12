package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "임성은";
		System.out.println(str1 + ", " + name);
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값: " + result);
		introduce("홍길동");
		
		result = minus(v1, v2);
		System.out.println("결과는 " + result);
	} 
	//minus 메소드 정의해보세요
	public static int minus(int a, int b) {
	return a-b;
	}
	
	public static void introduce(String name) {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
	
public static int add(int x, int y) { //method 여기는 규칙을 정해준것
	int sum = x + y;
	return sum; //return 결과값을 반환하겠다
	
}
}
