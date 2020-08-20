package com.yedam.generic;

public class Utils {
	// 메소드
	public static <T> Box<T> boxing(T t) { //T는 데이터타입 t는 매개변수
		Box<T> box = new Box<>();
		box.set(t);
		return box; // 아직까지 T 타입 안 정해짐

	}

	public static <T, M> boolean compare(Product<T,M> p1, Product<T, M> p2) {
		
	boolean b1 = p1.getType().equals(p2.getType());
	boolean b2 = p1.getModel().equals(p2.getModel());
	return b1 && b2;
		}

}
