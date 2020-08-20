package com.yedam.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행");
	}
}

interface AnonymInterface {
	void run();
}

public class AnonoymousExample {
	public static void main(String[] args) {
		AnonymInterface anonymInf = new AnonymInterface() {

			@Override
			public void run() {
				System.out.println("자식  구현 객체 실행");
				
			}
			
		};
		anonymInf.run();
		
		Anonymous anonym = new Anonymous() {
			String str;

			@Override
			void run() {
				System.out.println("자식 실행");
			}
			
		};
		
		anonym.run();
	}

}
