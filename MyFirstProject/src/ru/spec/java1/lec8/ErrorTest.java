package ru.spec.java1.lec8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ErrorTest {
	
	public static void main(String[] args) {
		System.out.println("START");
		//TODO try()
		//TODO finally
		// 		return
		// 		throw

		System.out.println(m1());

		// System.out.println("END");
	}

	@SuppressWarnings("finally")
	private static int m1() {
		File f = new File("C:/Users/mikhail.rakitskij/documents/java/new.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write("hello world".getBytes());
			return 3;
		} catch (Exception e) {
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
				
		}
		return 1;
	}

}