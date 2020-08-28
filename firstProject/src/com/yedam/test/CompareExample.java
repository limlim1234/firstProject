package com.yedam.test;

import java.util.Comparator;

public class CompareExample {
	class Student  implements Comparator<Student> {
		int sno;
		Student(int sno) {
			this.sno =sno;
		}
		@Override
		public int compare(Student o1, Student o2) {
			if (a.sno < b.sno)
				return -1;
			else if (a.sno == b.sno)
				return 0;
			else
				return 1;
		
		}
	
		}


		

	

	
		public static void main(String[] args) {
			Student s1 = new Student(1);
			Student s2 = new Student(1);
			Student s3 = new Student(2);

			int result = Objects.compare(s1, s2, new StudentComparator());
			System.out.println(result);
			result = Objects.compare(s1, s3, new StudentComparator());
			System.out.println(result);
		}
		
	
		
		static class StudentComparator implements Comparator<Studnet> {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.sno, o2.sno);
			}
		}
}
}