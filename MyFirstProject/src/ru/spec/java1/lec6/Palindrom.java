package ru.spec.java1.lec6;

public class Palindrom {

	public static void main(String[] args) {
		
//		for (int i=0;i<100_000;i++) {
//			
//			if (isPalindrom(i,7) && isPalindrom(i, 17)) {
//				System.out.println("("
//						+ i
//						+ ") "
//						+ Long.toString(i,7)
//						+ " "
//						+ Long.toString(i,17));
//			}
//		}

		System.out.println(isPalindrom("1233211"));
		
		StringBuilder sb = new StringBuilder();
		for(int i =0 ; i<1000_000;i++) {
			sb.append("A");
		}
		testString=sb.toString();
		
		for(int i=0 ; i<10 ;i++) {
			
			test1();
			test2();
			test3();
			System.out.println();
		}
	}

	static int  MAX = 1_000;
	static String testString = "1wertyuioppoiuytrewq";
	private static void test1() {
		long ts = System.nanoTime();
		for(int i=0;i<MAX;i++) {
			isPalindrom(testString);
		}
		System.out.println((System.nanoTime()-ts)/1000/1000d+" ms -1-");
	}
	private static void test2() {
		long ts = System.nanoTime();
		for(int i=0;i<MAX;i++) {
			isPalindrom2(testString);
		}
		System.out.println((System.nanoTime()-ts)/1000/1000d+" ms -2-");
	}
	private static void test3() {
		long ts = System.nanoTime();
		for(int i=0;i<MAX;i++) {
			isPalindrom3(testString);
		}
		System.out.println((System.nanoTime()-ts)/1000/1000d+" ms -3-");
	}

	private static boolean isPalindrom(long m,int r) {
		
		String string;
		string = Long.toString(m, r);
		return isPalindrom(string);
		
		
	}

	
	
	private static boolean isPalindrom(String string) {

		int lenght = string.length() / 2;
		for (int i = 0; i < lenght; i++) {

			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}	
	

	private static boolean isPalindrom2(String string) {

		char[] charArray = string.toCharArray();
		int lenght = charArray.length / 2;
		for (int i = 0; i < lenght; i++) {

			if (charArray[i] != charArray[string.length() - 1 - i]) {
				return false;
			}

		}
		return true;
	}
	
	int age;
	public void setAge(int age) {
		this.age = age;
	}
	public Palindrom withAge(int age) {
		this.age = age;
		return this;
	}

	public Palindrom age(int age) {
		this.age = age;
		return this;
	}
	public int age() {
		return age;
	}
	
	private static boolean isPalindrom3(String string) {
		return new StringBuilder(string)
				.reverse()
				.equals(string);
	}

}