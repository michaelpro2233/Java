package ru.spec.java1.lec6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "world");
		map.put("bye", "123");
		System.out.println(map.put("hello", "WORLD!"));
		map.put("123", "1");
		map.put("234", "2");
		map.put("345", "3");

		System.out.println(map);

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}

		Set<String> keySet = map.keySet();
		Collection<String> values = map.values();

		map.forEach((key, val) -> System.out.println(key + " => " + val));

	}
}
