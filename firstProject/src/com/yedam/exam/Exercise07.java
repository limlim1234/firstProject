package com.yedam.exam;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0; // 누적해서 저장
		int input = 0;
		

		Scanner scanner = new Scanner(System.in); // system.in 키보드 또는 마우스 타자쳐서 나오게 하는 scanner가 클래스라생성해야함

		while (run) {
			System.out.println("-------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();
			if (menu == 1) { //예금선택
				System.out.println("예금금액입력하세요> ");
				input = scanner.nextInt();
				balance = balance + input;
				
				
			} else if (menu ==2) { //출금
				System.out.println("출금금액을 입력하세요.");
				balance = balance - input;
			} else if (menu ==3) { //잔고
				System.out.println("잔액: " + balance);
			} else if (menu == 4)
				run = false; //계속 반복됨 4번을 누르지않은 이상
			
		} //end of while
		System.out.println("프로그램종료.");
	} //end of main

} //end of class
