package com.yedam.classes;

public class Cal {
	//필드
	private int r; //r은 반지름
	private double pi = 3.14;
	
	public void setRadius(int r) {
		if(r<0) //음수면 0나옴
			r=0; 
		else
			this.r = r;
	}
	public int getRadius() {
		return r;
	}
	
	public double getArea() {
		double result = pi* r * r;
		return result;
	}
}
