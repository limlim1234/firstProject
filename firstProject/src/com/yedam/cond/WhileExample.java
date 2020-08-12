package com.yedam.cond;

public class WhileExample {

	public static void main(String[] args) {
		// 구구단 while을 사용해서 출력.
		int j=2, x =1 ; 
		
		while (j<10) {
			System.out.println(j);
			x=1; //초기화 시켜야함 
			while(x<10) {
				System.out.println(j+"*"+x+"="+(j*x));
				x++;
			}
		
			j++;
			System.out.println();
			
		}
		// 1~10값의 합:
		int i = 0;
		int sum = 0;
		while (i < 10) {
			i++;
			sum += i;
		}
		System.out.println("1 ~ " + i + "까지 합:" + sum);
	}

}
