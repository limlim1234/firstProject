package com.yedam.database;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in); // ctrl 쉬프트 o 하면 임포트됨
		
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scn.nextInt(); scn.nextLine();
			
			if(selectNo ==1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				for(Employee emp : emps) {
					if(emp !=null)
					System.out.println(emp.toString());
				}
			} else if(selectNo ==2) {
				
				System.out.print("사원번호 입력> ");
				int empId=scn.nextInt();
				System.out.print("이름 입력> ");
				String empName =scn.nextLine();
				System.out.print("이메일 입력> ");
				String empEmail=scn.nextLine();
				System.out.print("입사일 입력> ");
				String empDate=scn.nextLine();             //여기있는 데이터들은 not null 필수로 데이터들어가야함
				System.out.print("부서 입력> ");
				String empJobid=scn.nextLine();
				
				Employee emp = new Employee(empId, empName ,empEmail, empDate, empJobid);
				
				EmpDAO dao =new EmpDAO();
				dao.addEmployee(emp); //메소드 호출
//				dao.addEmployee(new Employee(333, "test","test", "2020-05-05", "IT_PROG"));
			} else if(selectNo ==3) {
				System.out.print("수정할 사원번호 입력: ");
				int upId = scn.nextInt();scn.nextLine();
				
				
			} else if(selectNo ==4) {
				
				System.out.print("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();scn.nextLine();
			
				EmpDAO dao = new EmpDAO();
				dao.removeEmp(new Employee(empId));
				
				
			} else if(selectNo ==9) {
				run = false;
			}

		}
		System.out.println("프로그램 종료.");
	}

}
