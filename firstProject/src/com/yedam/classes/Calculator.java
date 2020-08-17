package com.yedam.classes;

public class Calculator {

	private static double pi = 3.14; //static 고정되어있다
	
	// 가로, 세로 => 넓이를  반환해주는 메소드(getRectagle)
	public static String getRectagle(int z, int a) {
	return "가로" + z +", 세로" + a +" 의 넓이는 " + calRectagle1(z,a) + "입니다."; 
	}
	
	
	public static int calRectagle1(int z, int a) {
		return z*a;
	}
		
	

		public static int add(int x, int y) { 
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public static double add(double x, double y) {
			return x + y;
		}

	public static void getArea(double a) { //더블파이 앞에 static 없으면 pi가 오류뜸
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);
	}
}