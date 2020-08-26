package com.yedam.test;

public class Exampl041 {

	public static void main(String[] args) {
	      // 배열의 크기 3
	      // 1~6까지의 임의의 숫자가 반복되지 않도록 배열에 저장

	      int[] intAry = new int[3];
	      
	       for (int i = 0; i < intAry.length; i++) { 
	        int randomNum = (int) (Math.random() * 6) + 1; 
	        if(intAry[i] != randomNum) { intAry[i] = randomNum;
	        i++; } 
	       } 
	        for(int i=0; i <intAry.length; i++) 
	        { System.out.println(intAry[i]);
	        }
	       
	
	        for(int i=0; i<intAry.length; ) { 
	        for(int j=0; j<intAry.length; j++) {
	        
	        } 
	        }
	       

	     Set<Interger> set = new HashSet<>();
	      while (true) {
	         int temp = (int) (Math.random() * 6) + 1;
	         set.add(temp);
	         if (set.size() == 3)
	            break;
	      }
	      for(Interger it : set) {
	         System.out.println(it);
	         
	 		Set<Person> pSet = new HashSet<>();
			pSet.add(new Person("Hong1", 20));  //hashCode, equals : 논리 동일한 객체
			pSet.add(new Person("Hong2", 21));
			pSet.add(new Person("Hong3", 20));
			
			for(Person p : pSet) {
				System.out.println(p.name + ", " + p.age+ ", " + p.toString());
	      }
	   }
	}
}
