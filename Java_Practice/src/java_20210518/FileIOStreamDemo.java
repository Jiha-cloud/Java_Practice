package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-copy.zip");
			
			/*int readBytes = 0;
			long start = System.currentTimeMillis();
			// read()는 1바이트씩 읽어서 읽은 바이트를 반환한다.
			while (((readBytes = fis.read()) != -1)) {
				// write()는 1바이트씩 쓴다.
				fos.write(readBytes);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d초\n", (end - start));*/
		
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*100];
			long start = System.currentTimeMillis();
			while(((readByteCount=fis.read(readBytes)) != -1)) { // 읽은 것을 readBytes에 저장하고 그 읽은 횟구를 readByteCount에 저장한다.
				fos.write(readBytes,0,readByteCount); // readBytes를 쓰는데 0부터 readByCount까지 쓴다.
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d\n", (end - start));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
