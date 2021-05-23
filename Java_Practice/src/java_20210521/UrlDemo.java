package java_20210521;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {
public static void main(String[] args) throws IOException {
	URL url = new URL("https://imgnews.pstatic.net/image/215/2021/05/21/A202105210175_1_20210521144105619.jpg?type=w647");
	String protocol = url.getProtocol();
	String host = url.getHost();
	int port = url.getPort(); // 포트가 없으면 -1반환
	String path = url.getPath();
	String query = url.getQuery();
	String ref = url.getRef();
	
	System.out.println("protocol: "+ protocol);
	System.out.println("host: "+ host);
	System.out.println("port: "+ port);
	System.out.println("path: "+ path);
	System.out.println("query: "+ query);
	System.out.println("reference: "+ ref);
	
	InputStream is = url.openStream();
	
	int readByteCount = 0;
	byte[] readBytes = new byte[1024*100];
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Home\\Downloadsimage.jpg");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	while ((readByteCount = is.read(readBytes)) != -1) {
		bos.write(readBytes);
	}
	bos.flush();
	System.out.println("추출성공");
	bos.close();
}
}
