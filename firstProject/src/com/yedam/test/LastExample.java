package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

class People{
	String name;
	int age;
	Pet[] pets;
	Fruit[] fruits;
	
	public People(String name, int age, Pet[] pets, Fruit[] fruits) {
		super();
		this.name = name;
		this.age = age;
		this.pets = pets;
		this.fruits = fruits;
	}
	
}
class Pet {
	String name;
	int age;
	String gender;
	//생성자정보
	
	
	
}
class Fruit {
	String name;
	int price;
//생성자 정보

	
}

public class LastExample {

	
//{ 사람이름 ,나이, 애완동물(이름, 나이, 성별), 과일(과일명, 가격)}
// 최재영,20,[{야옹이,2,수컷},{멍멍이,1,암컷}],[{사과,500},{키위,100}]
// 민해주,21,[{똘똘이,7,수컷},{바람이,6,수컷}],[{멜론,200},{바나나,200}]
//김상민,22,[{귀염이,5,수컷},{허스키,3,암컷}],[{포도,200},{딸기,200}]
//	personData=>위에 있는 모든 정보를 다 접근	
public static void main(String[] args) {
	Pet[] p1 = {new Pet() , new Pet()};
	Fruit[] f1 = {new Fruit(), new Fruit()};
	People cjy = new People("최재영", 20, p1, f1);
	People mhj = new People("민해주",21, new Pet[] {new Pet(), new Pet(), new Pet()}, new Fruit[] {new Fruit(), new Fruit(),new Fruit() });
	People ksm = new People("김상민", 22, null, null);
	List<People> personData = new ArrayList<>();
	personData.add(cjy);
	personData.add(mhj);
	personData.add(ksm);
	//민해주정보
	personData.get(1).pets[0].name = "야옹이";
	personData.get(1).pets[0].age = 2;
	personData.get(1).pets[0].gender = "수컷";
	//김상민 정보
	System.out.println((personData.get(2).fruits[1].name));
	
	
	
	
	
}
	  
	  }
