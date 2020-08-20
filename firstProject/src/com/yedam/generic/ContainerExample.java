package com.yedam.generic;

public class ContainerExample {

	public static void main(String[] args) {
		ContainerMain<String, String> container1 = new ContainerMain<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		ContainerMain<String, Integer> container2 = new ContainerMain<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name1 + job);
		System.out.println(name2 + age);
	}

}
