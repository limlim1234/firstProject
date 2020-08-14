package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		boolean run = true;
		int age = 0;
        String name = null;
        String no = null;
		Scanner scanner = new Scanner(System.in);
		
		Friend[] fary= new Friend[2];
		while (run) {
			
			System.out.println("1.정보입력 2.리스트 3.이름조회 4.이름조회 후 수정 9.종료");
			System.out.println();
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				for(int f=1; f<=2; f++) {
				System.out.println("정보입력을 하세요"); 
				System.out.println("이름을 입력하세요");
				name = scanner.nextLine();
				System.out.println("나이를 입력하세요");
				age = scanner.nextInt();scanner.nextLine();
				System.out.println("전화번호를 입력하세요");
				no = scanner.nextLine();
				}
				
				 Friend f1=new Friend(name,age,no);
				 fary[0]=f1;
				
						

			} else if (selectNo == 2) {
				for(int f =1; f<=2; f++) {
					System.out.println("정보입력을 하세요"); 
					System.out.println("이름을 입력하세요");
					age = scanner.nextInt();
					System.out.println("전화번호를 입력하세요");
					no = scanner.nextLine();
					
				}
				System.out.println(age);
				int num = scanner.nextInt();
//			} else if (selectNo == 3) {
//				System.out.println(no);
			} else if (selectNo == 9) {
				run = false;

			}

		}
		System.out.println("프로그램 종료.");
	}

}
