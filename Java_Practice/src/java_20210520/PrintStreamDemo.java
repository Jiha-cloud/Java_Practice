package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		PrintStream ps1 = null;

		ps1 = System.out;
		ps1.print("�ȳ��ϼ���");
		ps1.print("�߰�����");

		fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-copy.zip");

		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);

		ps = new PrintStream(bos, true);

		int readCount = 0;
		byte[] readByteCount = new byte[1024 * 100];

		while ((readCount = bis.read(readByteCount)) != -1) {
			ps.write(readByteCount, 0, readCount);
		}
	}
}
