package com.yedam.classes;

public class CalculatorExample {

	public static void main(String[] args) {  //static 쓰면 뉴라고 안쓰고 바로 활용가능
//		Calculator cal = new Calculator();
		int i = 4, y = 5;
		
		System.out.println("10+20" + Calculator.add(10, 20));
		System.out.println("10.0+20.0 = " + Calculator.add(10.0, 20.0));

		double r1 = 3.5;
		Calculator.getArea(r1);
		
		System.out.println(Calculator.getRectagle(4, 5));
		System.out.println("가로" + i +", 세로" + y +" 의 넓이는 " + Calculator.calRectagle1(i,y) + "입니다.");
		// => 가로 4, 세로 5의 넓이는 20입니다.
	}

	
	
	
}
