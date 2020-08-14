package com.yedam.ref;

public class MoringCode {

	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		int num1 = 1;
	
	int[][] iAry = new int[5][5];
	for(int i = 0; i<5; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.printf("%3d", iAry[i][j]);
		}
		System.out.println();
	}

	
	for(int i = 0; i<5; i++) {
		for (int j = 0; i < 5; j++) {
			System.out.printf("%3d", iAry[j][i]);
			
			}
		System.out.println();
			
			}
		} 

}
	



