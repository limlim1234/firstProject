package com.yedam.classes.exam;

public class MemberServiceExample {
	public static void main(String[] args) {

		// db역할
		/*
		 * Member[] members = new Member[3]; members[0] = new Member("홍길동", "hong");
		 * members[0].setPassword("hong123"); members[1] = new Member("김유신", "kim");
		 * members[1].setPassword("kim123"); members[2] = new Member("최재영", "choi");
		 * members[2].setPassword("choi123");
		 */

		// 로그인정보
		Member mem1 = new Member("홍길동", "hong");
		mem1.setPassword("hong123");
		MemberService mService = new MemberService();
		boolean result = mService.login(mem1.getId(), mem1.getPassword()); // mService는 위에 변수 메소드를 호출
		if (result) {
			System.out.println(mem1.getName() + " 님 로그인되었습니다.");

		} else {
			System.out.println("id 또는 password를 확인하세요.");
		}
	}

}
