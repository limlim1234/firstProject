package com.yedam.cond;

public class MethodExample {
	// 구구단

	public static void main(String[] args) {
		multiTable(3, 5);
		multiTable(6);
		multiTable();
		// int num = 2;
		// for(;num<=9; num++)
		// multiTable(num);
	}

	public static void multiTable(int a, int b) {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + "=" + (i * j));
			}
		}
	}

	public static void multiTable(int a) {
		int num1 = a;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	}

	public static void multiTable(int b) {
		int num1 = b;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	}
	
}

