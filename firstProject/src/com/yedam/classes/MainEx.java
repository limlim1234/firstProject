package com.yedam.classes;

final class FinalClass {
	
}

class ExtendClass extends FinalClass {
	
}

class ExString extends String {
	//더이상 상속받지못한다
}
public class MainEx {

	final int age = 10;

	public static void main(String[] args) {
		Friend fr = new Friend(); // 인스턴스
		fr.getAge(); // 인스턴스 메소드

//		Calculator cal = new Calculator();
		Calculator.add(10, 10); // 정적메소드

		final int val = 10;
//		val = 20;

		MainEx ex = new MainEx();
//		ex.age = 20;
	}

	// 메소드
	public static void runInt(int a) {
		System.out.println(a);
	}
}
