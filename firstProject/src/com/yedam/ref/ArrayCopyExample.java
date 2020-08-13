package com.yedam.ref;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4 };

		int[] cpyAry = new int[5]; // 4개만 할 경우 오류남

		// for (int i = 0; i < origAry.length; i++) {
		// cpyAry[i] = origAry[i];

		// }

		System.arraycopy(origAry, 0, cpyAry, 0, 5);
		for (int i = 0; i < origAry.length; i++) {
			System.out.println(cpyAry[i]);
		}
             // 확장 for()
       for(int num : cpyAry) {
    	   System.out.println(num);
       }
	}
}