package com.yedam.exam;

public class ArrayExercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		int maxVal = 0;
		for (int num : array) {
			if (num >= maxVal) {
				maxVal = num;
			}

		}

		System.out.println("max: " + maxVal);
	}
}

