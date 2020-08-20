package com.yedam.interfaces;

public class OracleDb implements DataAccessObject{
	//메소드 추가
	@Override
	public void select() {
	System.out.println("오라클 DB 입력");
	
		
		
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB 수정");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 DB 조회");
		
	}

}
