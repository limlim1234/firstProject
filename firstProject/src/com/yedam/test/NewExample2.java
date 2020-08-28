package com.yedam.test;
class Member{
	String name;
	int score;
	
}
//java.lang.Math

//com.yedam.test.Math
/*class Math {

	public static int max(int a, int b) { //스태틱 맥스라는 메소드도 실행가능하도록함 인스턴스를 안만들고 바로 클래스이름으로 쓸수있음
		int result = (a >= b) ? a : b; // 삼항연산자 a가 b보다 크면
		return result;
	}
	//min() // 39, 25= >25, 24.6, 3.8=> 3.8

	public static int min(int i, int j) {
		int result1 = (i <=j) ? i : j;
		return result1;
	}
	public static double min(double q, double s ) {
		double result2 = (q <=s) ? q : s;
		return result2;
	}
	
}

*/
class Calculator {
	public static int sum(Member[] ary) {
		int sum = 0;
		/*스코어합을반환*/ for(Member mem : ary) {
			sum += mem.score;
		}
		return sum;
	}
	
	public static int sum(int[] ary) {
		int sum = 0;
		/* 배열타입 */ for (int i : ary) {
					sum +=i;
		}
		return sum;
	}
}

public class NewExample2 {

	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		System.out.println(Calculator.sum(ary));
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		Member[] mAry = {m1,m2,m3};
		Calculator.sum(mAry);
		/*
		 * Math math = new Math(); int result = Math.max(10, 5);
		 * System.out.println("큰 수는: " + result); int result1 = Math.min(39, 25);
		 * System.out.println("작은 수는: "+ result1); double result2 = Math.min(24.6, 3.8);
		 * System.out.println("작은 수는: " + result2);
		 * 
		 * // Math.min(39, 25); // Math.min(24.6, 3.8);
		 */}

}
