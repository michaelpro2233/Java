package ru.spec.java1.lec6;

public class RegExpTest {
	public static void main(String[] args) {
		String[] split = "������ hello ���".split("[^�-��]+");
		for (String word : split) {
			System.out.println(word);
		}
		System.out.println(split.length);
	}
}
