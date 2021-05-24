package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for(int port = 1;port<65536;port++) {
			try {
			serverSocket = new ServerSocket(port);
		}catch(IOException e) {
			System.err.println(port + "번호가 사용중이다.");
		}
	}
}
}