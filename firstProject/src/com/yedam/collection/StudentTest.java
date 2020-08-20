package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		/*1학생이름 수학점수 영어점수 입력받고 3명
		 * 2 수학평균 영어평균을 계산하는분석
		 * 3수학최고점수와 학생을 보는 최고점수
		 * 9종료
		 * 프로그램을 작성하세요
		 * arraylist 사용 */
		boolean run = true;
		Scanner scn = new Scanner(System.in); 
		
		int selectNo =0;
		List<Student>list = new ArrayList<>();
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.입력 2.평균 3.최고점수 9.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			selectNo = scn.nextInt();scn.nextLine();
			if (selectNo == 1) {
				System.out.println("이름입력> ");
				String name = scn.nextLine();
				System.out.println("수학점수입력> ");
				int math = scn.nextInt();
				System.out.println("영어점수입력> ");
				int eng = scn.nextInt();
				Student stu = new Student(name, math, eng);
				list.add(stu);
	
				
				
			} else if(selectNo == 2) {
				System.out.print("수학평균 입력> ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.print("이름 입력> ");
				String empName = scn.nextLine();
				System.out.print("이메일 입력> ");
				String empEmail = scn.nextLine();
				System.out.print("입사일 입력> ");
				String empDate = scn.nextLine(); // 여기있는 데이터들은 not null 필수로 데이터들어가야함
				System.out.print("부서 입력> ");
				String empJobid = scn.nextLine();
				
				
				
			} else if(selectNo == 3) {
				int mathmax= 0;
				
				
				
				
			} else if (selectNo == 9) {
				run = false;
			}
				
		}
		System.out.println("프로그램 종료.");
	}

}

