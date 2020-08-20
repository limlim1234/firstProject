package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance(); //2020-8-19
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); //월:0~11
		System.out.println(cal.get(Calendar.DATE));
		//날짜 지정
		cal.set(2020, 7, 0); //2020년 3월 1일의 년도(2020, 2,1)  월, 요일정보 7월의 마지막날은 0 넣으면됨
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); //월:0~11
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일요일
		System.out.println(cal.get(Calendar.DATE));
		createCalendar();
	}
	
/*	public static void createCalendar() {
		System.out.println("일\t월\t화 \t수\t목\t금\t토 ");
		for(int i=1; i<31; i++) {
			if(i%7 == 0) {
				System.out.printf("%d\n", i);
			} else  {
				System.out.print(i + "\t"); */
// 2020 8월 달력			
	public static void createCalendar(int year, int month) {
		System.out.println();
			
			
	
	
	}
}

