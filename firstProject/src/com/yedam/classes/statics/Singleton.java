package com.yedam.classes.statics;

public class Singleton {
	private static Singleton singleton = new Singleton();  // 하나의 인스턴스만 필요할때 static 씀
	
	private Singleton() {
		
	} 
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
