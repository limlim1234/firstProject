package com.yedam.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");

	}
}

class Bus extends Vehicle {

	@Override
	void run() {
		// super.run();
		System.out.println("버스가 달립니다."); //재정의
	}

}

class Taxi extends Vehicle {
	@Override
	void run() {
		// super.run();
		System.out.println("택시가 달립니다.");
	}
}