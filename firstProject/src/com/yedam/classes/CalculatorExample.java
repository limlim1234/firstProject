package com.yedam.classes;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int i = 4, y = 5;
		
		System.out.println("10+20" + cal.add(10, 20));
		System.out.println("10.0+20.0 = " + cal.add(10.0, 20.0));

		double r1 = 3.5;
		cal.getArea(r1);
		
		System.out.println(cal.getRectagle(4, 5));
		System.out.println("가로" + i +", 세로" + y +" 의 넓이는 " + cal.calRectagle1(i,y) + "입니다.");
		// => 가로 4, 세로 5의 넓이는 20입니다.
	}

	
	
	
}
