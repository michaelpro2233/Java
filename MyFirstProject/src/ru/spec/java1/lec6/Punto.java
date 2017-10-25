package ru.spec.java1.lec6;

import java.util.HashMap;

public class Punto {
	static HashMap<Character, Character> ru_en = new HashMap<>();
	static HashMap<Character, Character> en_ru = new HashMap<>();

	static {
		String enLayout = "`1234567890-=qwertyuiop[]asdfghjkl;'\\\\zxcvbnm,./"
				+ "~!@#$%^&*()_+QWERTYUIOP{}ASDFGHJKL:\"||ZXCVBNM<>?";
		String ruLayout = "ё1234567890-=йцукенгшщзхъфывапролджэ\\\\ячсмитьбю."
				+ "Ё!\"№;%:?*()_+ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭ//ЯЧСМИТЬБЮ,";

		for (int i = 0; i < enLayout.length(); i++) {
			ru_en.put(ruLayout.charAt(i), enLayout.charAt(i));
			en_ru.put(enLayout.charAt(i), ruLayout.charAt(i));
		}

	}

	public static void main(String[] args) {
		System.out.println(ruToEn("Руддщ цщкдв!"));
		System.out.println(enToRu("Ghbdtn vbh!"));

	}
	
	

	static public String enToRu(String en) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < en.length(); i++) {
			char c = en.charAt(i);
			Character tmp = en_ru.get(c);
			sb.append(tmp==null? c:tmp);
		}
		
		return sb.toString();
	}
	
	static public String ruToEn(String ru) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ru.length(); i++) {
			char c = ru.charAt(i);
			Character tmp = ru_en.get(c);
			sb.append(tmp==null? c:tmp);
			
		}

		return sb.toString();
	}
}
