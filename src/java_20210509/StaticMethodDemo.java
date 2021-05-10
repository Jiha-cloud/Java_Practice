package java_20210509;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	
	public void m1() {
		System.out.println("instance method m1() 호출");
	}
	
	public void m2() {
		this.name = "박지하";
		StaticMethodDemo.interestRate = 3.4;
		this.m1();
	}
	public static void m3() {
		System.out.println("static method m3() 호출");
	}
	public static void m4() {
		interestRate = 4.3;
		m3();
	}
	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.m2();
		smd.m1();
		smd.name = "박지하";
	}

}
