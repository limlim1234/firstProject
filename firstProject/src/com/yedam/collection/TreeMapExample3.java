package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");

		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88)); // 기준값보다 작은값
		Set<Student> set = sMap.keySet();
		for (Student s : set) {
			System.out.println(s.getName() + "," + s.getMath());

			sMap = tMap.subMap(new Student("Temp", 70, 70), new Student("Temp2", 80, 80));
		 set = sMap.keySet();
			for (Student s1 : set) {
				System.out.println(s1.getName() + ", " + s1.getMath() + ", " + s1.getEng());

				sMap = tMap.tailMap(new Student("so", 80, 80)); 
				set = sMap.keySet(); 
				for (Student s11 : set) {
					System.out.println(s11.getName() + "," + s11.getMath());
			}

		}

		/*
		 * tMap.headMap(toKey) //80점 이하를 가져와라 tMap.tailMap(fromKey) //80점이상
		 * tMap.subMap(fromKey, tokey) //70에서 80사이 수학점수기준
		 */

	}

	}
}
