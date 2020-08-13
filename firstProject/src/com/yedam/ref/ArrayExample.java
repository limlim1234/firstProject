package com.yedam.ref;

public class ArrayExample {

	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50;
		int sum = score1 + score2 + score3 + score4;

		// 배열선언하면
		int[] intAry = { 10, 20, 30, 40 };
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50;
		System.out.println(intAry.length); //length가 데이터갯수만큼나옴
		//for 반복문을 사용
		sum = 0; //sum 초기화값
		for(int i = 0; i < intAry.length; i++) { //배열의 크기 
			System.out.println(intAry[i]);
		sum = sum + intAry[i];	
		
		}

		System.out.println("sum :" + sum);
		
		double[] dAry = {2.3, 4.3};
		
		String[] sAry = { "hello", "world", "nice", "good" };
		for(int i = 0; i<sAry.length; i++) {
			System.out.println(sAry[i]);
		}
		//크기만 지정	
			String[] scoreAry = new String[5]; //크기를 5개 담음
			for(int i = 0; i<scoreAry.length; i++) {
			System.out.println(scoreAry[i]);	
			}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for(int i = 0; i<scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
	}
		//기억하기
		int[] mathAry;
		mathAry= new int[] {1,2,3,4};
	}
}
