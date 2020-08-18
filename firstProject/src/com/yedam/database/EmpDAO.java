package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Employee[] employees = new Employee[100];
	Connection conn = DBConnection.getConnection(); // DB 연결후

	// 조회
	public Employee[] getEmpList() {
		try {

			String sql = "select *from emp_temp";// 쿼리 작성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // ResultSet에 결과값을 넣고
			int idx = 0;
			while (rs.next()) { // ResultSet 가져올꼐 있으면 참
				Employee emp = new Employee();
				emp.setFirstName(rs.getNString("first_name"));
				emp.setLastName(rs.getNString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getNString("email"));
				emp.setPhoneNumber(rs.getNString("phone_number"));
				emp.setHireDate(rs.getNString("hire_date"));
				emp.setJobId(rs.getNString("job_id"));

				employees[idx++] = emp;
			}
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;

	}

	// 입력
	public void addEmployee(Employee emp) {
		String sql = "INSERT INTO emp_temp(employee_id,last_name,email,hire_date,job_id)" + "values("
				+ emp.getEmployeeId() + ",\'" + emp.getLastName() + "\',\'" + emp.getEmail() + "\',\'"
				+ emp.getHireDate() + "\',\'" + emp.getJobId() + "\')";
		System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력 되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// 삭제
	public void removeEmp(Employee emp) {
		
		Connection conn = DBConnection.getConnection();

		String sql = "delete from emp_temp where employee_id = " + emp.getEmployeeId();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			}
		}
		
//수정		
		 public void updateEmp(Employee eId) {
      	   Connection conn = DBConnection.getConnection();
      	   String sql = "update from emp_temp where employee_id = " + eId.getEmployeeId();
     		try {
  			PreparedStatement pstmt = conn.prepareStatement(sql);
  			int r = pstmt.executeUpdate();
  			System.out.println(r + " 건 수정되었습니다.");
  		} catch (SQLException e) {
  			e.printStackTrace();
    		}
           
		 }
	}

