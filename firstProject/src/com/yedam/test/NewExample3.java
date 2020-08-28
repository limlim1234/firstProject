package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample3 {
	Member mem; //필드
	// 클래스안에 클래스선언 (중첩클래스)
	class Member {
		String id;
		
		/*생성자	*/	
		Member(String id) {
			this.id =id;
		}

		@Override //이퀄스만클릭 재정의
		public boolean equals(Object obj) { //재정의해서 같에 만들자 오브젝트니까 아무열이나 다 가능
			if(obj instanceof Member) {
		Member mem = (Member) obj;
			return id.equals(mem.id);
		} else {
			return false;
		}
				
	
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
//			return super.hashCode();
		}
		
	}	
	public static int hashCode(Object a[]) {
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }

	public void printMember() {
		Member m1 = new Member("hong");
	} 
	
	public static void main(String[] args) {
		NewExample3 ne =new NewExample3();
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2));
		
		System.out.println(Objects.hash("hhh"));
//		System.out.println(hashCode(new Integer(1)));
		
		Set<Member> set = new HashSet<>();
		set.add(m1);   //m1=m2 동일한 값이라 판단해서 하나만 나옴
		set.add(m2);
		for (Member m: set) { //이퀄스랑 해시코드랑 비교
			System.out.println(m.id);
		}
		
	} 

}
