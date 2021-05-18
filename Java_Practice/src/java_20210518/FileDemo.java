package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		// f2의 마지막 수정날짜 구하기
		// 1970년 1월 1일 00:00:00초부터 파일을 수정한 날까지의 시간을
		// 밀리세컨드로 변환
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd a hh : mm");
		String format = sim.format(cal.getTime());
		return format;
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		if (f1.mkdirs()) {
			System.out.println("디렉토리를 생성");
		} else {
			System.out.println("이미 디렉토리 존재");
		}

		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		long len = f2.length();
		System.out.printf("%,d \n", len);

		System.out.println(format(f2));

		boolean isDirectory = f2.isDirectory();
		boolean isFile = f2.isFile();
		if (isFile) {
			String path = f2.getPath();
			if (path.endsWith("zip")) {
				System.out.println("압축파일입니다.");
			} else if (path.endsWith("txt")) {
				System.out.println("텍스트파일");
			} else if (path.endsWith("java")) {
				System.out.println("자바파일");
			}
			System.out.println("파일입니다.");
			System.out.println(path);
		} else {
			System.out.println("디렉토리입니다.");
		}
		if (isDirectory) {
			System.out.println("존재하는 디렉토리입니다.");
		} else {
			System.out.println("아무것도 아닙니다.");
		}
		
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
		File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");
		
		f3.renameTo(f4);
		
		String path = f4.getPath();
		System.out.println(path);
		String parent = f4.getParent();
		String name = f4.getName();
		System.out.printf("%s %s \n",parent,name);
		
		f4.delete();
		
		File f5 = new File("C:\\Users\\Home\\eclipse-workspace\\Java_Fundamental");
		File[] files = f5.listFiles();
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if(f.isDirectory()) {
				String lastmodified = format(f);
				String fileName = f.getName();
				for (int j = 0; j < fileName.length(); j++) {
					System.out.println(" ");
				}System.out.printf("%s \t 파일폴더, %s \n",fileName,lastmodified);
			}else if(f.isFile()) {
				String lastModified = format(f);
				String fileName = f.getName();
				long filesize = f.length();
				for (int j = fileName.length(); j < 10; j++) {
					System.out.print(" ");
				}
				System.out.printf("%s \t   파일, %s , 크기 %,dB \n",fileName, lastModified, filesize);
			}
		}
	}
}
