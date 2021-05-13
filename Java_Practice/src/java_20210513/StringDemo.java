package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
	char[] c = {'h','e','l','l','o'};
	String str = new String(c);
	String str2 = new String(c,2,2);
	System.out.println(str);
	System.out.println(str2);
	
	// 문자열 중에 특정 문자 하나만 반환하는 메서드
	// index는 0부터 시작
	char c1 = str.charAt(1);
	System.out.println(c1);
	
	// 문자열 연결하는 메서드
	str = str.concat("123");
	System.out.println(str);
	
	// endsWith("msg") => msg로 끝나면 true
	// 그렇지 않으면 false
	str = new String("abc.zip");
	if(str.endsWith("zip")) {
		System.out.println("압축파일입니다");
	}else {
		System.out.println("일반파일입니다");
	}
	
	// startsWith("msg") => msg로 시작하면 true
	// 그렇지 않으면 false
	String url = new String("http://www.naver.com");
	String path = new String("/news/board.do?id=123&cat=1");
	if(path.startsWith("/news")) {
		System.out.println("뉴스 페이지입니다.");
	}else {
		System.out.println("페이지가 존재하지 않습니다");
	}
	
	// equals() => 문자열 비교 **빈칸 주의, 빈칸도 비교됨**
	// 앞뒤 공백을 제거해주는 메서드 trim()
	// equalsIgnoreCase() = 대소문자 구분하지 않고 비교
	String m1 = new String("hello");
	String m2 = new String("hello");
	if(m1.equals(m2)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	// getBytes() => 문자열을 바이트 배열로 반환하는 메서드
	String m3 = new String("안녕하세요");
	byte[] b = m3.getBytes();
	System.out.println(b.length);
	// 문자열 내에서 위치 찾기
	String m4 = new String("111111-1111119");
	System.out.println(m4.indexOf("-"));
	// 문자열 내에서 검색했을 때 그 중 제일 뒤쪽 문자의 위치
	String m5 = new String("sdkfjs.sdfkjsdf.sdfklsa.zip");
	int lastIndexOf = m5.lastIndexOf(".");
	System.out.println(lastIndexOf);
	
	System.out.println(m4.substring(0, m4.indexOf("-"))); // 주민번호 앞자리
	System.out.println(m4.substring(m4.indexOf("-")+1)); // 주민번호 뒷자리
	System.out.println(m5.substring(0, lastIndexOf));
	
	String m6 = new String("010-6814-2355");
	System.out.println(m6.substring(0,m6.indexOf("-"))); // 핸드폰 번호 맨 앞 3자리
	System.out.println(m6.substring(m6.indexOf("-")+1, m6.lastIndexOf("-")));
	System.out.println(m6.substring(m6.lastIndexOf("-")+1,m6.length()));
	
	int a1 = Integer.parseInt(m4.substring(0,1)); // 1이라는 문자열을 primitive type인
											      // int type으로 바꾸는 방법
	String m7 = 123+"";
	String m8 = String.valueOf(123); // int type인 123을 reference type인
								     // String type으로 바꾸는 방법
	String m9 = m6.replace("-", "_");
	
	String m10 = new String("hello");
	String up10 = m10.toUpperCase();
	System.out.println(up10);
	System.out.println(up10.toLowerCase());
	
	// 핸드폰 번호를 - 기준으로 배열에 하나씩 집어 넣음
	// 010-6814-2355 가 있을 때
	// - => 구분자 delimiter
	// 010, 6814, 2355 => 토큰 token
	
	String[] temp = m6.split("-");
	for(String value : temp) {
		System.out.println(value);
	}
	double d = 123456.345;
	String m13 = String.format("%,.3f", d); // 소수점 둘째짜리까지 출력, 3자리마다 ','
	System.out.format("%s \n", m13);

	
	}
}
