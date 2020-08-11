package com.yedam.oper;

public class IncreaseOperatorExample {

	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;
		
		var1++; //var1 = var1 - 1;
		for(int i=0; i<3; i++) {
			run = !run; //!가 반대의미임
			if (run) {
			var1--; //1:ok,2:false라 결과가 안나옴 3:ok 
			 } //var1=2 var3=3 빼기일경우 var1=-3
			}
		System.out.println(var1);
// for (int i = 0; i < 10; i++) {
		// run = !run;
		//if (run) {
			//System.out.println("i의 값: " + i);
	}

}
