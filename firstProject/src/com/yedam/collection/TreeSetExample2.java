package com.yedam.collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); // 소티드 크다작다
		sSet = set.tailSet(new Person("So", 12));
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 12)); // 범위를 가져올때 서브셋
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("-------------------------");
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true);
		nSet = set.tailSet(new Person("Sorted", 12), false);
		set.subSet(new Person("SSS", 10), true, new Person("TTT", 12), true);
		
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}

//	Iterator<Person> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next().name);
	}

}
//	}
