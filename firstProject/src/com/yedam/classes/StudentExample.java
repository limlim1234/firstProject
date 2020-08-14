package com.yedam.classes;

public class StudentExample {

	public static void main(String[] args) {
		
		Student hgd = new Student(1111,"홍길동","역사");
	    Student kys = new Student(2222,"김유신","말타기");
	    Student lse = new Student(3333,"임성은","사탕");	
	    
	    String serchName = "김유신";
	    String searchMajor = "역사";
	    
	    
//	   Student[] sAry = { s1, s2 };
//	    for(Student s : sAry) {
//	    	if(s.getStudName().equals(searchName))
//	    	System.out.println(s.toString());    김유신이 들어가있는 자료만 나옴
	    }

	    
	    System.out.println("학번은 "+ hgd.studentnumber+" "+ "이름은 " + hgd.name+" " + "전공은 "+ hgd.major + "입니다.");
	    System.out.println(kys.studentnumber+" "+kys.name+" " +kys.major);    
	    System.out.println(lse.studentnumber+" "+lse.name+" " +lse.major);
	}

}
