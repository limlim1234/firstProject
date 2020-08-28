package com.yedam.test;

public class MemberExample {
	 class Member implements Cloneable {
		public String id;
		public String name;
		public String password;
		public int age;
		public boolean adult;

		public Member(String id, String name, String password, int age, boolean adult) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
			this.adult = adult;
		}

		public Member getMember() {
			Member cloned = null;
			try {
				 cloned = (Member) super.clone();
			} catch (CloneNotSupportedException e) {
			}
			return cloned;
		}
	}

	public static void main(String[] args) {
		MemberExample mem = new MemberExample();
		Member mem1 = mem. new Member("blue", "홍길동", "12345", 25, true);

		Member cloned = mem1.getMember();
		cloned.password = "67890";

		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);

		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + mem1.id);
		System.out.println("name: " + mem1.name);
		System.out.println("password: " + mem1.password);
		System.out.println("age: " + mem1.age);
		System.out.println("adult: " + mem1.adult);

	}
}
