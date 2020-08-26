package com.yedam.test;

public class Person {

	public static void main(String[] args) {
		String name;
		int age;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
			
			
		}
		public int hashCode() {
			return this.age;
			
		}             
		public boolean equals(Object obj) {
			Person p = (Person) obj;
			return this.name.equals(obj.name)
					
		}
		
		
	}
	

}
