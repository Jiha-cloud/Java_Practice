package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NewsCrawlingDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.v.daum.net/v/20210521145605233");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort(); // 포트가 없으면 -1반환
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();

		System.out.println("protocol: " + protocol);
		System.out.println("host: " + host);
		System.out.println("port: " + port);
		System.out.println("path: " + path);
		System.out.println("query: " + query);
		System.out.println("reference: " + ref);

		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}
}
