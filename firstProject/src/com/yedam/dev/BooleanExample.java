package com.yedam.dev;

public class BooleanExample {

	public static void main(String[] args) {
		long l1 = 10L;
		int i1= 10;
		
		boolean trueOrFalse = false;   //true와 폴스만 올수있음
		trueOrFalse = l1 != i1;    //l1 != i1; 둘이 다르다는 뜻  10 !=10 
		if (l1 == i1) { // ==값을 비교
		System.out.println("이 내용은 참일 경우에 출력됩니다.");
		}
		// >, <, >=, <=
		if (l1 >= i1) {
			System.out.println("왼쪽이 크거나 같습니다.");
		}
		System.out.println(trueOrFalse);
		
	}

}
