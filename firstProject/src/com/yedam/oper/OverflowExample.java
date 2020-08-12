package com.yedam.oper;

public class OverflowExample {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		// 2147483647, -2147483648
          safeAdd(2147483648, -10); 
          
	}
    public static int safeAdd(int a, int b) {
    	int sum = 0;
    	if(Integer.MAX_VALUE - b < a) { //양의 범위벗어남
    	System.out.println("유효값이 아닙니다.");
    	sum = 0; 
    } else if (Integer.MIN_VALUE - b > a ) {
    	System.out.println("유효값이 아닙니다.");
    	sum = 0; //두번째값에 -10을 하면 -2147483658이 되니까 
    	//범위에 포함이 되지 않음  포함된 값을 산출해야하니까 
    }
    else {
    	sum = a + b;
    }
    	return sum;
 }
}