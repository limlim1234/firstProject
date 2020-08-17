package com.yedam.classes.exam;

public class MemberService {
	public boolean login(String id, String password) {
		boolean result = false;
		
		if (id.equals("hong") && password.equals("12345"))
			result = true;
		else
			result = false;
		return result;
	}
		

	public void logout() {
		System.out.println("로그아웃되었습니다.");
	}
}
