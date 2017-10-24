package ru.spec.java1.WebApiHabrahabr;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		String refers = refs1.text();
		
		
		
		
		}
}