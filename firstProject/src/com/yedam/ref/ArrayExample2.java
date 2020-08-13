package com.yedam.ref;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] numAry = { 2,4,5,3,5};
		int result = addAry(new int[] { 2, 3, 4});//외우기 
	System.out.println("배열의 합: " + result);
	
	}

	public static int addAry(int[] ary) { // int형으로 반환해주겠다
		int sum = 0;
		for (int i = 0; i < ary.length; i++) { //배열의 크기만큼 더하겠음
			sum += ary[i];
		}
		return sum;
	}
}
