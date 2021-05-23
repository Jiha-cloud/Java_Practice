package java_20210521;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) throws IOException {
	String url = "http://www.imbc.com/";
	Document doc = null;
	
	doc = Jsoup.connect(url).get();
	System.out.println("성공");
	
	Elements elements = doc.select(".notice-list li");
	for(Element element : elements) {
		System.out.println(element.text());
	}
	}
}
