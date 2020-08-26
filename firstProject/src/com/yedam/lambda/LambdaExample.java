package com.yedam.lambda;

// 함수적인터페이스(functional Interface)
interface MyFunctionalInterface {
	public void run(); // 추상메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("ruuuuun");

	}

}

public class LambdaExample {

	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> /* new MyFunctionalInterface() */ {
			System.out.println("runn");
		};
		myintf.run();
		/*
		 * @Override public void run() { System.out.println("runn");
		 */

		ShowContent sc = /* new ShowContent() { */
				/*
				 * @Override public void show
				 (String */(content) -> {
					System.out.println("내용은 " + content + " 입니다.");
				};

		sc.show("바나나");

		
		ShowContent sc2 =(content) -> {
			System.out.println("this is " + content );
		}; 
		sc2.show("바나나");
		//this is 바나나.
		
		Calculate cal = (a, b) -> a + b; //int도 같은거니까 지움
			System.out.println("결과: " + cal.sum(10, 5));	
	}
}
