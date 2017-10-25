package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilesTest {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception {
		// System.out.println("enter any string:");

		InputStream in = System.in;

		File file = new File("C:/Users/mikhail.rakitskij/Documents/Java/text.txt");
		in = new FileInputStream(file);
		in = new URL("http://specialist.ru").openStream();

		Scanner scanner = new Scanner(in);

		Map<String, Integer> stat = new HashMap<>();

		for (; scanner.hasNextLine();) {
			String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");// авы 234 ыва
			for (String word : nextLine) {
				Integer count = stat.get(word);
				count = count == null ? 1 : count + 1;
			}
			// System.out.println(nextLine);
		}

	}
}
