package com.yedam.exam;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		boolean run = true;
		int a = 23;
		int b = 44;
		int c = 28;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			int i = scanner.nextInt();
			if (a > b) {
				System.out.println(a);
				if (c > a)
					System.out.println(c); // cba
				else if (b > c)
					System.out.println(b); // abc

			} else {
				if (a < b)
					System.out.println();
				
				

			}

		}

	}
}