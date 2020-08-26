package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));

		Integer t = tSet.first();
		t = tSet.last();
		t = tSet.floor(new Integer(87)); // 작거나 같다
		t = tSet.lower(new Integer(87)); // 87은 빼고 자기보다 작은값 가져온다
		t = tSet.ceiling(new Integer(85)); // 크거나 같다
		t = tSet.higher(new Integer(85)); // 85보다 크다
		
		Iterator<Integer> dIter = tSet.descendingIterator();
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		System.out.println("------------------------");
		
		NavigableSet<Integer> nSet = tSet.descendingSet(); //역순정렬
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
		// 요소를 가지고 와서 삭제		
		int size = tSet.size();
		for(int i=0; i< size; i++) {
			t = tSet.pollLast();
			System.out.println(t+ ", " + tSet.size());
		}
		
		
		
		
		Iterator<Integer> iter = tSet.iterator();
		while (iter.hasNext()) {
			Integer icnt = iter.next();
//			System.out.println(icnt);
		}

	}

}
