package com.yedam.generic;

public class Box<T> { //<T>는 파라미터
	
//필드
	private T obj;//오브젝트는 젤 최상위 클래스
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {   //반환해주는 메소드
		return this.obj;
	}
	
	
	

	}


