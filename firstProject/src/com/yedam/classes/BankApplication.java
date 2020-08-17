package com.yedam.classes;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		//작성 위치
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		
		String owner = scanner.next();
		
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();

		System.out.println("결과: ");
		Account	account = new Account( ano, owner,balance);
		
		
		
		
		
		}
	

	// 계좌목록보기
	private static void accountList() {
		// 작성위치
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + accountArray[i].getOwner()  + accountArray[i].getBalance());
				
				
			}
		}
	}

	// 예금하기
	private static void deposit() {
		// 작성 위치
	}

	// 출금하기
	private static void withdraw() {
		// 작성위치
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// 작성위치
		
	}
}
