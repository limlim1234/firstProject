package com.yedam.inherit;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName(); //부모 parent getName()
		child.getAge(); //부모 parent getAge()
		child.getGrade(); //자신 getGrade()
		
		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade(); 자식 클래스
		
		Vehicle v1 = new Taxi();
//		v1.run();     //여기에는 택시 실행
		v1 = new Bus();   //버스 실행
//		v1.run();
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}

}
