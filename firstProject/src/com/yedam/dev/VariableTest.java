package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
// b = b + 1;
		// 1 ~10까지 더하기
		int b = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			b = b + 1;
			sum = sum + b;
			System.out.println("sum = " + sum + ", b = " + b);
		}
		System.out.println("합계 : " + sum);
		int i = 0;
		// int sum = 10; 이렇게 하면 에러남 
		//변수 sum은 한번만 선언할수 있음
	}
}


