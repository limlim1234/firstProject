package com.yedam.object;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key k1 = new Key(1);
		hashMap.put(k1, "홍길동");
		Key k2 = new Key(1);
		System.out.println(k1.hashCode()); //key값이 다르니까 hash코드나 equals를 이용해 값을 같게해야함
		System.out.println(k2.hashCode());
		String value = hashMap.get(k2);
		System.out.println(value);

	}

}
