package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		Cal cal = new Cal();
		// car .r = -5;
		// cal.r = 5; //반지름이 -5라도 실행은 되지만 의미가 없는 값 그래서 계산
		// cal.setRadius(-5);
		cal.setRadius(5);
		// System.out.println("반지름: "+ cal.r + " 의 넓이는: " + cal.getArea());
		System.out.println("반지름: " + cal.getRadius() + " 의 넓이는: " + cal.getArea());

		// System.out.println(10);
		// System.out.println(10.5);
		// System.out.println("10");
		print("200.5");
	}
// 메소드 오버로딩(동일한 메소드명을 사용: 매개값의 타입이 다르거나 갯수가 다름)
	public static void print(int a) { // print를 3번쓸수있는걸 메소드 오버로딩
		System.out.println("입력값은: " + a);
	}

	public static void print(double a) {
		System.out.println("입력값은: " + a);
	}

	public static void print(String a) {
		System.out.println("입력값은: " + a);
	}
}
