package com.ysrk.spring03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 컬렉션 프레임워크
		// List
		List<String> lst1 = new ArrayList<>();

		lst1.add("One");
		lst1.add("Two");
		lst1.add("Three");
		lst1.add("Four");
		

		System.out.println(lst1);

		List<String> lst2 = new ArrayList<>();
		lst2.add("Five");
		lst1.set(0,"Zero");

		System.out.println(lst1);
		System.out.println(lst1.get(5)); // six

		// 연결리스트
		List<Integer> lst3 = new LinkedList<>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(30);
		System.out.println(lst1);

		//정렬
		Collections.sort(lst1, Collections.reverseOrder());
		System.out.println(lst1);
		// lst1.sort(); // 이 정렬 메서드 사용해도 무방

		System.out.println(lst1.contains("three")); // lst1 리스트에 "Three"라는 문자열이 존재하는지 여부
		System.out.println(lst1.isEmpty()); // 리스트가 비어있는지 판별
		System.out.println(lst1.size()); // 배열 .length() 동일
		lst1.remove(5);
		lst1.add("Four");
		System.out.println(lst1);
		// !중요한 메서드
		// lst1.clear(); // 로직 중간에 함부로 쓰지 말 것! 프로그램 종료시 리스트를 비우는 것!

		// Vector - ArrayList와 거의 동일.
		Vector<String> vec1 = new Vector<>(10); // 용량을 지정할 수 있음.
		vec1.add("One");
		vec1.add("Three");
		System.out.println("벡터 크기! -> " + vec1.size());
		System.out.println("벡터 용량! -> " + vec1.capacity());

		// Set
		Set<String> set1 = new HashSet<>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Two");

		System.out.println(lst1.contains("three")); // lst1 리스트에 "Three"라는 문자열이 존재하는지 여부
		System.out.println(lst1.isEmpty()); // 리스트가 비어있는지 판별
		System.out.println(lst1.size()); // 배열 .length() 동일
		set1.remove("Four"); // set은 순서가 없기 때문에 지울 요소값을 입력해야 함!
		set1.removeAll(set1); //모두 지운다 		
		// set1.clear();
		set1.add("Four");
		System.out.println(set1);

		// Map
		Map<String, String> phones = new HashMap<>();
		phones.put("010-9999-5555", "Galaxy S10");
		phones.put("010-0000-7733", "Iphone 15");
		phones.put("010-9898-6890", "Galxy S24");
		phones.put("010-6666-6622", "IPhone 11");

		System.out.println(phones);

		System.out.println(phones.get("010-6666-662"));
	}
}
