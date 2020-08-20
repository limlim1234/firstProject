package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in); // ctrl 쉬프트 o 하면 임포트됨
		EmpService service = new EmpServiceImpl();
		int selectNo = 0; // int selectNo 초기값을 해줘야 안에 있는 selectNo를 사용할수 있다.
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			try {
				selectNo = scn.nextInt(); // try는 한문장만 실행가능하다 2문장을 고치려면 try 한번더 쓴다

			} catch (Exception e) {
				scn.nextLine();
				System.out.println("숫자를 입력하세요."); // catch는 예외를 잡는거
				continue;

			}

			if (selectNo == 1) {
//				EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList(); // dao.getEmpList();
				for (Employee emp : emps) {
					if (emp != null)
						System.out.println(emp.toString());
				}
			} else if (selectNo == 2) {

				System.out.print("사원번호 입력> ");
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

				Employee emp = new Employee(empId, empName, empEmail, empDate, empJobid);

//				EmpDAO dao =new EmpDAO();
				service.addEmp(emp); // dao.addEmployee(emp); //메소드 호출
//				dao.addEmployee(new Employee(333, "test","test", "2020-05-05", "IT_PROG"));
			} else if (selectNo == 3) {
				System.out.print("수정할 사원번호 입력: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("변경 될 월급 인력> ");
				int salary = scn.nextInt();
				scn.nextLine();
				Employee emp = new Employee();
				emp.setSalary(salary);
				emp.setEmployeeId(empId);
//			 EmpDAO dao = new EmpDAO();
				service.modEmp(emp);
//				dao.updateEmp(new Employee(empId));
//				dao.updateEmp(new Employee(salary));
			} else if (selectNo == 4) {

				System.out.print("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();
				scn.nextLine();

//				EmpDAO dao = new EmpDAO();
//				dao.removeEmp(new Employee(empId));

				service.removeEmp(empId);

			} else if (selectNo == 9) {
				run = false;
			}

		}
		System.out.println("프로그램 종료.");
	}

}
