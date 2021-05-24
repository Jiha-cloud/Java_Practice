package java_20210524;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for (int port = 1; port <= 1024; port++) {
			try {
				socket = new Socket("192.168.55.25", port);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.err.println("호스트가 존재하지 않습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(port + "번호를 사용하지 않고 있습니다.");
			}
		}
	}
}
