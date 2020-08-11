package com.yedam.dev;

public class LongExample {
 public static void main(String[] args) {
	 long l1 = 10;
	 System.out.println("long 최소값: " + Long.MIN_VALUE);
	 System.out.println("long 최대값: " + Long.MAX_VALUE);
	 
	 long l2 = 20;
	 
	 int result = (int) (l1 * l2); 
	 //롱형이어야하지만 int로 선언해서 에러남
	 //뒤에 int를 붙이고 l1만 인트를 붙이는게 아니라 l1l2 둘다 붙어야하니 
	 //괄호로 묶어줌
 }
}
