package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("qpal748596", "123","qpal748596@naver.com",25);
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a2 = new Admin("qpal748596", "123","qpal748596@naver.com");
		Admin a1 = new Admin();
		a1.setId("qpal748596");
		a1.setPwd("123");
		a1.setEmail("qpal748596@naver.com");
		a1.setLevel(25);
	}	
	
}
