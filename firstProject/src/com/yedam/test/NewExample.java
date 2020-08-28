package com.yedam.test;
class Something{ String field1;
	int field2;
	int [] field3;
	Student student;
	Something(String field1, int field2, int [] field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	public Student getStudent() {
		return this.student;
	}
	}


class Student {
	String studentName = "initValue";
	int studentAge = 10;
	int studentScore = 10;
}
public class NewExample {

	public static void main(String[] args) {
		int numA = 10;
		String str = "10";
		float f1 = 10.8f;
		
//		something = "hello", 10; //헬로도 넣고 싶고 10도 넣고싶으면? 클래스사용 class Something{ String field1; int field2;
		Something something = new Something("hello", 10, new int[] {1,2,3,4,5});
		System.out.println(something.field1);
		System.out.println(something.field2);
		for(int i=0; i<something.field3.length; i++) {
			System.out.println(something.field3[0]);
		}
		Student st1 = new Student();	
		something.setStudent(new Student());
		System.out.println(something.getStudent().studentName);
		System.out.println(something.getStudent().studentAge);
		System.out.println(something.getStudent().studentScore);
		
	}

}
