package com.yedam.test;

public class Test8 {

	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		byte result = (byte)(byteValue + byteValue);
		
		System.out.println(result);
		int result1 = 5 + byteValue;
		System.out.println(result);
		float result2 = 5 + floatValue;
		System.out.println(result);
		double result3 = 5 + doubleValue;
		System.out.println(result);

	}

}
