package com.yedam.interfaces;

public class DaoExample {

	public static void main(String[] args) {
//		DataAccessObject dao = new OracleDb(); oracledb를 사용하다 mysqldb를 사용하게됨
		DataAccessObject dao = new MySqlDb(); //데이터엑세스는 인터페이스
		
		dao.select(); 
		dao.insert();
		dao.update();

	}

}
