package ru.spec.java1.lec8;

import java.util.concurrent.TimeUnit;

public class SwitchTest {

	static final String type = "asd";
	
	public static void main(String[] args) {

		long k = 1;
		Menu item = Menu.ABOUT;
		select(item);
		
		Menu.PROJECTS.run();
		
//		TimeUnit.SECONDS.sleep(5);
	}
	public static void select (Menu item) {
		switch (item) {
		case ABOUT:
			System.out.println(item.toString());
			System.out.println(item.name());
			break;
		case CONTACTS:
			break;
		case MAIN:
			System.out.println("hello");
			break;
		case PROJECTS:
			break;
		
		}
	}

}
