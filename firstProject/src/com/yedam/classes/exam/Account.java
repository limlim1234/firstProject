package com.yedam.classes.exam;

public class Account {
	private int balance = 0;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 100;

	public int getBalance() {
		return balance;
	}

	
	public static int getMinBalance() {
		return MIN_BALANCE;
	}

	
	public static int getMaxBalance() {
		return MAX_BALANCE;
	}

	
	public void setBalance(int balance) {
		if(balance>=0 && balance<=1000000) 
				this.balance = balance;
		

	
	}
}
