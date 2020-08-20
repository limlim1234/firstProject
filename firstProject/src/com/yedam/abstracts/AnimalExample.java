package com.yedam.abstracts;

public class AnimalExample {

	public static void main(String[] args) {
//		Animal anm = new Animal(); //추상클래스 인스턴스생성불가
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a; //promotion
		a =(int) b;    //casting
		//강제변환
		Dog dog = (Dog) anm;
		dog.sound();
		
	}

}
