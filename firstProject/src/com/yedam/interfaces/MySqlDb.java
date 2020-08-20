package com.yedam.interfaces;

public class MySqlDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql Db 입력.");
		
	}

	@Override
	public void insert() {
		System.out.println("Mysql Db 수정.");
	}

	@Override
	public void update() {
		System.out.println("Mysql Db 조회.");
		
	}

}
