package ru.spec.java1.WebApiHabrahabr;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EntryPointHabr {
	public static void main(String[] args) throws MalformedURLException, IOException {
		specUrls();
	}
	
	private static void specUrls() throws IOException, MalformedURLException {
		Document doc = Jsoup.parse(new URL("https://habrahabr.ru/post/340370/"), 5_000);
		Elements refs = doc.select(".comments-section .comment");
		Elements refs1 = doc.select(".js-score");
		
		for (Element ref : refs) {
			System.out.println(ref.text());
		}
		
		
		String refers = refs.text();
		String refers1 = refs1.text();
		Matcher matcher = Pattern.compile("–?(d+)").matcher(refers1);
		String mr = matcher.toString();
		int foo = Integer.parseInt(mr);
		
		HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		List<String> list = new ArrayList<>();
		list.add(refers);
		map.put(foo, list);
		System.out.println(map);
		
		
		
		
		
		}
}