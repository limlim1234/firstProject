package com.yedam.classes;

public class Calculator {

	double pi = 3.14;
	
	// 가로, 세로 => 넓이를  반환해주는 메소드(getRectagle)
	public String getRectagle(int z, int a) {
	return "가로" + z +", 세로" + a +" 의 넓이는 " + calRectagle1(z,a) + "입니다."; 
	}
	
	
	public int calRectagle1(int z, int a) {
		return z*a;
	}
		
	

		public int add(int x, int y) { 
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public double add(double x, double y) {
			return x + y;
		}

	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);
	}
}