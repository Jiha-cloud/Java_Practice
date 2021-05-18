package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
		
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\2_network_analysis&prediction.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\2_network_analysis&prediction-copy.zip");
			
			int readByCount = 0;
			byte[] readBytes = new byte[1024*100];
			long start = System.currentTimeMillis();
			
				while((readByCount = fis.read(readBytes)) != -1) {
					fos.write(readBytes,0,readByCount);
			}
				long end = System.currentTimeMillis();
				System.out.printf("경과시간 : %d\n", (end - start));
			}catch (IOException e) {
				e.printStackTrace();
			} finally {
					if(fis != null)
						try {
							fis.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
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
	

