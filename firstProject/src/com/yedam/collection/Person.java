package com.yedam.collection;

public class Person implements Comparable<Person> {


		String name;
		int age;
		
		public Person(String name, int age) {
			super();
			this.name =name;
			this.age = age;
		}

		@Override
		public int compareTo(Person o) {
			return this.age - o.age; //음수(오름차순) this.age - o.age;, 양수(내림차순) return o.age - this.age;
		}

	

}
