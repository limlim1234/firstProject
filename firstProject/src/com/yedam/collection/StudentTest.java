package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// 1)학생이름, 수학점수, 영어점수를 입력받고..(3명)
		// 2)수학평균, 영어평균 을 계산하는 분석.
		// 3)수학최고점수와 학생을 보는 최고점수
		// 9)종료.
		// 프로그램을 작성하세요.
		// ArrayList를 사용.
		Scanner scn = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.입력 2.분석 3.최고점수 9.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.print("이름:");
				String name = scn.nextLine();
				System.out.print("수학:");
				int math = scn.nextInt();
				System.out.print("영어:");
				int eng = scn.nextInt();
				list.add(new Student(name, math, eng));
			} else if (selectNo == 2) {
				int sumEng = 0, sumMath = 0;
				for (Student s : list) {
					sumEng += s.getEng();
					sumMath += s.getMath();
				}
				System.out.println("영어평균: " + (double) sumEng / list.size());
				System.out.println("수학평균: " + (double) sumMath / list.size());

			} else if (selectNo == 3) {
				Student maxStu = list.get(0);
				for (Student s : list) {
					if (maxStu.getMath() < s.getMath()) {
						maxStu = s;
					}
				}
				System.out.println("수학최고점: " + maxStu.getMath() + " 이름: " + maxStu.getName());

			} else if (selectNo == 9) {
				break;

			} else {
				for (Student st : list) {
					System.out.printf("이름 %s, 수학 %d 영어 %d", st.getName(), st.getMath(), st.getEng());
					System.out.println();
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}
