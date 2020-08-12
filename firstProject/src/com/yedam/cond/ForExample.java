package com.yedam.cond;

public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("결과는" + sum);

		sum = 0;
		for (int a = 3; a < 0; a--) {
			sum = sum + 1;
		}
		sum += 1;
		System.out.println("최종 결과는" + sum);

		// 1 ~10 범위 수 합계
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;
		}
		// 1 = 0 + 1;
		// 3 = 1 + 2;
		// 6 = 3 + 3;
		System.out.println("1 ~ 10합: " + sum);
		//구구단
		int num = 2;
         for(;num<=9;) {
		for (int i = 1; i <= 9; i++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(num + " * " + 1 + " = " + (num * 1));
			}
			num++;
		}
	}
}
}