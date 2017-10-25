package ru.spec.java1.lec6;

import java.util.HashMap;

public class MapWithNull {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("123", null);
		map.put("hello", "world");
		
		System.out.println(map.get("hello"));
		System.out.println(map.get("123"));
		System.out.println(map.containsKey("123"));
		System.out.println(map.keySet());
		
		
	}

}
