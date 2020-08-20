package com.yedam.string;

import java.util.Scanner;

public class Gender {
   public static void main(String[] args) {
      String ssn = "010624-1230123";
      char sex = ssn.charAt(7);
      subX("990205-1234567");
      subX("010205/3234567");
      subX("980205*2234567");
      subX("0102054234567");
      boolean run = true;
      while(run) {
         Scanner sc = new Scanner(System.in);
         System.out.println("주민번호를 입력하세요> ");
         String id = sc.next();
         if(id.length()==14) {
            subX(id);
            
         }else {
            System.out.println("형식이 다릅니다.");
            System.out.println("다시 입력하세요.");
            continue;
         }
         
      }
   }

private static void subX(String string) {
	// TODO Auto-generated method stub
	
}
}
      
//      public static void subX(String id) {
//         String idx = id;
//         
//      }